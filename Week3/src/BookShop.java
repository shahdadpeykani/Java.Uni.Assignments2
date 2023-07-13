import java.util.Scanner;
public class BookShop {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of books: ");
        int size = input.nextInt();
        Book [] book = new Book [size];
        for(int i=0;i<size;i++){
            System.out.println("Book Name: ");
            String name = input.next();
            System.out.println("Authored: ");
            String authored = input.next();
            System.out.println("Piece: ");
            int piece = input.nextInt();
            System.out.println("Price: ");
            double price = input.nextDouble();
            book[i]=new Book(name,authored,piece,price);
        }
        int addedNum = book[0].addBook(5);
        System.out.println("New Book Number: "+addedNum);
        int RemovedNum = book[1].dropBook(2);
        System.out.println("New Book Number: "+RemovedNum);
        for(Book element: book){
            System.out.println(element);
        }
    }
}
