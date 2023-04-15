package data;

import java.util.*;

public class DataFacade {
	
	List<User> user = new ArrayList<User>();
	
	
	DataFacade(){
		user.add(new User());
	}
	
	
	List<User> getUsers(){
		return user;
	}

}
