package cdac.action;

import org.apache.struts2.ServletActionContext;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cdac.hbm.HibernateUtil;
import cdac.model.RegisterModel;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport 
{
	
	RegisterModel rm;
		
	public RegisterModel getRm() 
	{
		System.out.println("getrm");
		return rm;
	}
	public void setRm(RegisterModel rm) 
	{
		System.out.println("setrm");
		this.rm = rm;
	}
	public void validate()
	{
		ServletActionContext.getServletContext().setAttribute("rm", rm);
		if(rm.getUsername() == "" || rm.getUsername() == null)
		{
			addFieldError("rm.username", "Username can not be empty!!");
		}
		if(rm.getPassword() == "" || rm.getPassword() == null)
		{
			addFieldError("rm.password", "Password can no be empty!!");
		}
		if(rm.getAccounttype() == "" || rm.getAccounttype() == null)
		{
			addFieldError("rm.accounttype", "Accounttype can no be empty!!");
		}
		
	}
	public String execute()
	{
		Session session = HibernateUtil.getSession();
		Transaction txn = session.beginTransaction();
		session.saveOrUpdate(rm);
		txn.commit();
		session.close();
		
		return SUCCESS;
		

	}
	
}
