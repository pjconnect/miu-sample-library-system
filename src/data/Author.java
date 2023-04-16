package data;

public class Author extends Person{
    public Author(String firstName, String lastName, String phone, Address address) {
        super(firstName, lastName, phone, address);
    }

    @Override
    public String toString(){
        return firstName + " " + lastName;
    }
}
