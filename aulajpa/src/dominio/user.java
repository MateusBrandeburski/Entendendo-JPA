package dominio;

import java.io.Serializable;

public class user implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String User;
	private String password;
	
	public user() {
	} {
		
	}

	public user(String user, String password) {
		super();
		User = user;
		this.password = password;
	}

	public String getUser() {
		return User;
	}

	public void setUser(String user) {
		User = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "user [User=" + User + ", password=" + password + "]";
	}
	
	
	
}
