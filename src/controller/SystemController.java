package controller;

import data.*;

import javax.swing.*;
import java.util.List;

public class SystemController {

    private DataFacade df = DataFacade.getInstance();
    private User loggedInUser;
    private static SystemController systemController;

    public static SystemController getInstance(){
        if(systemController == null){
           systemController = new SystemController();
        }
        return systemController;
    }

    private SystemController(){

    }



    public User Login(String txtUsername, String txtPassword) {
        // get all users
        for(User user: df.getUsers()){
            if(user.username.equals(txtUsername) && user.password.equals(txtPassword)){
                loggedInUser = user;
                break;
            }
        }

        return loggedInUser;
    }

    public User getLoggedInUser(){
        return loggedInUser;
    }

    public void logOut() {
        loggedInUser = null;
    }

    public List<Address> getAddresses() {
        return this.df.getAddresses();
    }
    
    public void addAddress(Address address){
        df.addAddress(address);
    }

    public void addMember(Member member) {
        df.addMember(member);
    }

    public List<Member> getMembers() {
        return df.getMembers();
    }

    public void addAuthor(Author author) {
        df.addAuthor(author);
    }

    public List<Author> getAuthors() {
        return df.getAuthors();
    }

    public void addBook(Book book) {
        df.addBook(book);
    }

    public List<Book> getBooks() {
        return df.getBooks();
    }

    public boolean checkoutBook(Book book, Member member) {
        //check availability
        var checkoutList = df.getCheckoutBooks();
        var outBooks = 0;
        for(CheckoutBooks b: checkoutList){
            if(b.book.equals(book)){
                outBooks ++;
            }
        }
        if(outBooks >= book.getCopyOfBooks()){
            return false;
        }
        //add to check out
        df.addCheckoutBook(checkoutList.size() + 1, book, member);
        return true;
    }

    public List<CheckoutBooks> getCheckoutBooks() {
        return df.getCheckoutBooks();
    }

    public void returnBook(CheckoutBooks selectedCheckout) {
        df.removeCheckout(selectedCheckout);
    }

    public void updateBookCopies(Book selectedBook, int numberOfCopies) {
        selectedBook.setCopyOfBooks(numberOfCopies);
    }

    public int getAddressIndex(Address address) {
        var addresses = df.getAddresses();
        var index = 0;
        for(Address a:addresses){
            if(a.equals(address)){
                return index;
            }
            index++;
        }
        return index;
    }

    public void editMember(Member selectedMember, String firstName, String lastName, String phone, Address selectedAddress) {
        selectedMember.setFirstName(firstName);
        selectedMember.setLastName(lastName);
        selectedMember.setPhone(phone);
        selectedMember.setAddress(selectedAddress);
    }
}
