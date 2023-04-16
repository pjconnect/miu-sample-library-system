package data;

public class Address {

    public final String Street;
    public final String City;
    public final String State;
    public final String Zip;

    Address(String street, String city, String State, String Zip){
        this.Street = street;
        this.City = city;
        this.State = State;
        this.Zip = Zip;
    }

    @Override
    public String toString(){
        return Street + "," + City + "," + State + "," + Zip;
    }
}
