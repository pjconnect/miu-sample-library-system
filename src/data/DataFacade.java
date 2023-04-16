package data;

import java.util.*;

public class DataFacade {

    private static DataFacade dataFacade;

    List<User> users = new ArrayList<>();
    List<Address> addresses = new ArrayList<>();
    List<Member> members = new ArrayList<>();
    List<Author> authors = new ArrayList<>();

    public static DataFacade getInstance() {
        if (dataFacade == null) {
            dataFacade = new DataFacade();
        }

        return dataFacade;
    }

    private DataFacade() {
        //populate test data
        users.addAll(TestData.getTestUsers());
        addresses.addAll(TestData.getAddresses());
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Address> getAddresses() {
        return this.addresses;
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public void addMember(Member member) {
        this.members.add(member);
    }

    public List<Member> getMembers() {
        return this.members;
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public List<Author> getAuthors() {
        return this.authors;
    }
}
