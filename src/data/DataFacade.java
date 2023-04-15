package data;

import java.util.*;

public class DataFacade {

	private static DataFacade dataFacade;

	List<User> users = new ArrayList<>();

	public static DataFacade getInstance(){
		if(dataFacade == null){
			dataFacade = new DataFacade();
		}

		return dataFacade;
	}
	
	private DataFacade(){
		//populate test data
		users.addAll(TestData.getTestUsers());
	}

	public List<User> getUsers() {
		return users;
	}
}
