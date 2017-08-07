package cdac.action;

import java.util.List; 
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cdac.hbm.HibernateUtil;
import cdac.model.DataModel;
import cdac.model.RegisterModel;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ExampleAction extends ActionSupport implements ServletRequestAware , ServletResponseAware 
{
	DataModel dl;
	public DataModel getDl()
	{
			return dl;
	}
	public void setDl(DataModel dl) {
		this.dl = dl;
	}
	public String addUsers()
	{
	    String e = ServletActionContext.getRequest().getParameter("dl.chapter");
		System.out.println(e);
		
		Map sess = ActionContext.getContext().getSession();
		System.out.println(sess.get("rm")+"this is value of rm");
		
		RegisterModel rm = (RegisterModel)sess.get("rm");
		//System.out.println(rm.getUsername());
		if(dl!=null)
		{	
			//System.out.println("chapter visited is : "+dl.getChapter());
			dl.setUserId(rm.getUsername());
		    	    	
			Session session = HibernateUtil.getSession();
			Transaction txn = session.beginTransaction();
			session.saveOrUpdate(dl);
			txn.commit();
			session.close();    	
		    	
		    	
		    	return "success";
	    }else
	    {
	    	return ERROR;
	    }
   
	}
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		
	}


}