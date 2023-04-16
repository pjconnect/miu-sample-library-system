package data;

import java.util.*;

public class DataFacade {

	private static DataFacade dataFacade;

	List<User> users = new ArrayList<>();
	List<Address> addresses = new ArrayList<>();

	public static DataFacade getInstance(){
		if(dataFacade == null){
			dataFacade = new DataFacade();
		}

		return dataFacade;
	}
	
	private DataFacade(){
		//populate test data
		users.addAll(TestData.getTestUsers());
		addresses.addAll(TestData.getAddresses());
	}

	public List<User> getUsers() {
		return users;
	}

	public List<Address> getAddresses(){
		return this.addresses;
	}
}
