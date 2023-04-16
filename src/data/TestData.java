package data;

import java.util.ArrayList;
import java.util.List;

public class TestData {

    public static List<User> getTestUsers(){
        var tmpUsers = new ArrayList<User>();
        tmpUsers.add(new User("james" ,"abc", "James", "Torantneeno", UserRoles.Admin));
        tmpUsers.add(new User("kafi" ,"abc", "Kafi", "Gordan", UserRoles.Librarian));
        tmpUsers.add(new User("joanna" ,"abc", "Joanna", "Saleem", UserRoles.Both));
        tmpUsers.add(new User("pj" ,"abc", "Joi", "Thombson", UserRoles.Both));

        return tmpUsers;
    }

    public static List<Address> getAddresses(){
        var tmpAddresses = new ArrayList<Address>();
        tmpAddresses.add(new Address("1000 n", "4th st", "BLD", "iowa"));
        tmpAddresses.add(new Address("1001 n", "4th st", "BLD", "iowa"));
        tmpAddresses.add(new Address("1002 n", "4th st", "BLD", "iowa"));
        tmpAddresses.add(new Address("1003 n", "4th st", "BLD", "iowa"));
        return tmpAddresses;
    };

}
