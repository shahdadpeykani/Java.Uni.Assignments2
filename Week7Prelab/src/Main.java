import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Document[] documents = new Document[10];
        int documentCount = 0;

        Scanner scan = new Scanner(System.in);
        String input = "";

        while (!input.equals("q")) {
            input = scan.nextLine();
            String[] parts = input.split(" ");

            if (parts[0].equals("add")) {
                String docType = parts[1];
                String docNumber = parts[2];
                String authorLastName = parts[3];
                int year = Integer.parseInt(parts[4]);

                if (docType.equals("book")) {
                    documents[documentCount] = new Book(docNumber, authorLastName, year);
                } else if (docType.equals("paper")) {
                    documents[documentCount] = new Paper(docNumber, authorLastName, year);
                } else if (docType.equals("thesis")) {
                    documents[documentCount] = new Thesis(docNumber, authorLastName, year);
                }

                documentCount++;
            } else if (parts[0].equals("update")) {
                String docNumber = parts[1];
                int newYear = Integer.parseInt(parts[2]);

                for (int i = 0; i < documentCount; i++) {
                    if (documents[i].documentNumb.equals(docNumber)) {
                        documents[i].setYear(newYear);
                        break;
                    }
                }
            } else if (parts[0].equals("q")) {
                System.out.println(documentCount + " documents:");
                for (int i = 0; i < documentCount; i++) {
                    System.out.println(documents[i]);
                }
            }
        }
    }
}