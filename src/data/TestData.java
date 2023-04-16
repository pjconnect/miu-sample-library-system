package data;

import java.util.ArrayList;
import java.util.Collection;
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

    public static List<Author> getAuthors(){
        var tmpAuthors = new ArrayList<Author>();
        tmpAuthors.add(new Author("James", "Gordon", "456 56454 545", getAddresses().get(1)));
        tmpAuthors.add(new Author("Kiyanu", "Reevs", "344 43434 545", getAddresses().get(2)));
        return tmpAuthors;
    }

    public static List<Book> getBooks() {
        var tmpBooks = new ArrayList<Book>();
        tmpBooks.add(new Book(1, "Programming", "33s344", getAuthors().get(1), 2));
        tmpBooks.add(new Book(2, "System Design", "3f3344", getAuthors().get(1), 1));
        tmpBooks.add(new Book(3, "STC", "333s44", getAuthors().get(1), 0));
        tmpBooks.add(new Book(4, "Consciousness", "3f3344", getAuthors().get(1), 1));
        return tmpBooks;
    }

    public static List<Member> getMembers() {
        var tmpMembers = new ArrayList<Member>();
        tmpMembers.add(new Member(1, "James", "Gordan", "3343 4343", getAddresses().get(1)));
        tmpMembers.add(new Member(1, "Name2", "Gordan", "3343 4343", getAddresses().get(1)));
        tmpMembers.add(new Member(1, "Name3", "Gordan", "3343 4343", getAddresses().get(1)));
        tmpMembers.add(new Member(1, "Name4", "Gordan", "3343 4343", getAddresses().get(1)));
        return tmpMembers;
    }
}
