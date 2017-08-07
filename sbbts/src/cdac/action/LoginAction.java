package cdac.action;

import java.util.List;     
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequestWrapper;

import cdac.hbm.HibernateUtil;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import cdac.model.RegisterModel;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.net.httpserver.Authenticator.Failure;

import cdac.hbm.HibernateUtil;

public class LoginAction extends ActionSupport
{	
	Boolean bool;
	String uname,password,accounttype;
	public int division;
	RegisterModel rm;
	
	public RegisterModel getRm() 
	{
		return rm;
	}

	public void setRm(RegisterModel rm) {
		this.rm = rm;
	}
	
	
	public void validate()
	{
		if(rm != null)
		{	
			
			System.out.println(rm+"from loginaction");
			uname = rm.getUsername();
			password= rm.getPassword();
			accounttype = rm.getAccounttype();
			if(uname == null || uname.equals("")) {
				addFieldError("rm.username", "Username Cant be Empty.");
			}
			
			if(password == null || password.equals("")) {
				addFieldError("rm.password", "Password Cant be Empty.");
			}

			if(accounttype == null || accounttype.equals("")) {
				addFieldError("rm.accounttype", "AccountType Cant be Empty.");
			}
		}
	}

	public String execute()
	{
		if(rm!=null)
		{	
			// Business logic will come here.
			Session hibernatesession = HibernateUtil.getSession();
			hibernatesession.beginTransaction();
			//LoginModel lm1 = (LoginModel)session.get(LoginModel.class,"username");
			
			Criteria ctr = hibernatesession.createCriteria(RegisterModel.class);
			List<RegisterModel> all = ctr.list();
			
			for(RegisterModel lm1 : all)
			{
				System.out.println(lm1.getUsername());
				System.out.println(lm1.getPassword());
				System.out.println(lm1.getAccounttype());
				System.out.println("=================");
			}
			for(RegisterModel lm1 : all)
			{
				String name = lm1.getUsername();
				System.out.println(uname);
				System.out.println(password);
				System.out.println(accounttype);
				System.out.println(rm.getFirstname()+ "firstname");
				
				if( name.equals(uname) )
				{
					System.out.println("first if");
					if( lm1.getPassword().equals(password))
					{
						if(lm1.getAccounttype().equals("student"))
						{
						
							System.out.println("2nd if");
							System.out.println(rm.getUsername());
							System.out.println("authenticated");
							
							Map sess = ActionContext.getContext().getSession();
							sess.put("login","true");
							sess.put("rm", rm);
							
							System.out.println(sess);
							bool = true;
							hibernatesession.close();
							
							return SUCCESS;
						}else 
							if(lm1.getAccounttype().equals("admin"))
							{
								Map sess = ActionContext.getContext().getSession();
								sess.put("login","true");
								sess.put("rm", rm);
								bool = true;
								hibernatesession.close();
								return "adm";
							}
					}
				}
							
			}
			bool = false;
		
			System.out.println("authentication failure");
			hibernatesession.close();
		}
		return ERROR;
	}
	
}
