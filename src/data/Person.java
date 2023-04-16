package data;

public abstract class Person {

    public final String firstName;
    public final String lastName;
    public final String phone;
    public final Address address;

    Person(String firstName, String lastName, String phone, Address address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }
}
