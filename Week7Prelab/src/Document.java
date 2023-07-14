public class Document {
    protected String documentNumb;
    protected String authorLastName;
    protected int year;

    public Document(String documentNumber, String authorLastName, int year) {
        this.documentNumb = documentNumber;
        this.authorLastName = authorLastName;
        this.year = year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return documentNumb + " " + authorLastName + " " + year;
    }
}
