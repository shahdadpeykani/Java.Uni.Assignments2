public class Book {

    private String name;
    private String authored;
    private int piece;
    private double price;

    public Book(String name,String authored,int piece,double price){
        this.name=name;
        this.authored=authored;
        this.piece=piece;
        this.price=price;
    }

    public int dropBook(int num) {
        piece-=num;
        return piece;
    }

    public int addBook(int num) {
        piece+=num;
        return piece;
    }

    public void changePrice(double price) {
        this.price=price;
    }

    public String toString() {
        return "There are "+piece+" of the $"+price+" book, called "+name+" and the publisher is "+authored;
    }
}
