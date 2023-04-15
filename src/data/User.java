package data;

public class User {


	private final UserRoles role;

	User(String username, String password, UserRoles role){
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	public String username;
	public String password;

}
