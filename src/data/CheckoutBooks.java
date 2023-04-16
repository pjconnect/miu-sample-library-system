package data;

public class CheckoutBooks {

    public final Book book;
    public final Member member;

    public CheckoutBooks(Book book, Member member){
        this.book = book;
        this.member = member;
    }

}
