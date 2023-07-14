public class Paper extends Document{
    public Paper(String documentNumber, String authorLastName, int year) {
        super(documentNumber, authorLastName, year);
    }

    @Override
    public String toString() {
        return "paper " + super.toString();
    }
}
