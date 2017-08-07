package cdac.model;

public class LoginModel
{
	
	String username;
	String password;
	String accounttype;
	
	
	public String getUsername() {
		System.out.println("hello");
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	
	

}
