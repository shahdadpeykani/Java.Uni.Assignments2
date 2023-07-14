public class Book extends Document{
    public Book(String documentNumber, String authorLastName, int year) {
        super(documentNumber, authorLastName, year);
    }

    @Override
    public String toString() {
        return "book " + super.toString();
    }
}
