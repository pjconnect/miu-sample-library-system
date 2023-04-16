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

}
