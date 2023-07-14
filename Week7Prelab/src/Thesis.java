public class Thesis extends Document{
    public Thesis(String documentNumber, String authorLastName, int year) {
        super(documentNumber, authorLastName, year);
    }

    @Override
    public String toString() {
        return "thesis " + super.toString();
    }
}
