package lektion5.bokhylla;

public class Bok {
    //Titel
    private String title;
    //Författare
    private String author;
    //Antal sidor
    private int pages;
    //Ett påhittat ISBN
    private String ISBN;

    /*
        Konstruktor för klassen. Denna körs ALLTID först när vi skapar objekt av denna klass.
        När vi kör exempelvis:
            = new Bok("1984", "George Orwell", 328, "978-0451524935");

       Kommer konstruktorn att köras. Vi kan använda detta för att fråga om vörden som appliceras på
       objektets egenskaper-
     */

    public Bok(String title, String author, int pages, String ISBN) {
        //Vi använder this för att markera att det är klassens variabel title som skall tilldelas värdet från inparametern title
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.ISBN = ISBN;
    }

    // Get-metod för att få ut värdet title
    public String getTitle() {
        return title;
    }

    // Get-metod för att få ut värdet title
    public String getAuthor() {
        return author;
    }

    // Get-metod för att få ut värdet title
    public int getPages() {
        return pages;
    }

    // Get-metod för att få ut värdet title
    public String getISBN() {
        return ISBN;
    }

    /*
        För att bestämma och definiera hur klassen skall skrivas ut, kan vi override-a metoden toString.
        Genom denna kan vi bestämma vad och hur vi skriver ut om vi exempelvis kör
        System.out.println(bok1)
     */
    @Override
    public String toString() {
        return "Bok{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
}
