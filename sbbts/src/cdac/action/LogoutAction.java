package cdac.action;

import javax.servlet.http.HttpSession;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;
import java.util.*;

public class LogoutAction extends ActionSupport {
 
	public String execute() throws Exception { 
		Map session = ActionContext.getContext().getSession();
		session.put("login", "false");
		System.out.println(session+"from lo.action");
		return SUCCESS;
	}
}
