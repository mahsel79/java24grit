package lektion5.bokhylla;

/*
  Skapa en bokhylla med böcker!
Det bör finnas 3 klasser
En Main / Application - där vi skapar våra objekt och kör programmet
En klass för bok - som innehåller bokens egenskaper
En klass för bokhyllan - som innehåller någon form av samlingstyp för att
spara böcker
Bokhyllan skall ha innehålla 3 böcker.
Bokhyllan skall vara ett eget object / klass
Bokhyllan skall ha någon form av samlingstyp för att lagra 3 böcker
Det skall vara enkelt att plocka ut en specifik bok från bokhyllan,
exempelvis via ISBN - som är en egenskap på boken
Bokhyllan bör ha metoder för att hämta ut enstaka bok från bokhyllan och
lägga till i bokhyllan (samlingtyp)
Det skall finnas en metod i bokhyllan för att skriva ut ALLA böcker (loop)

Varje bok skall vara ett objekt.
En bok bör ha följande egenskaper:
Titel
Författare
Antal sidor
Ett påhittat ISBN
Bok objektet skall ha en konstruktor!
   */

public class Application {

    public static void main(String[] args) {

        Bokhylla bokhylla = new Bokhylla(); //Skapar ett objekt av klassen Bokhylla för att nå bokhyllans metoder och därmed kan spara/placera böcker

        Bok bok1 = new Bok("1984", "George Orwell", 328, "978-0451524935"); // Skapar ett objekt av Bok och ger den egenskaper via constructor
        bokhylla.addBok(bok1); // Lägg till bok till den samlingstyp du valt

        Bok bok2 = new Bok("Moby Dick", "Herman Melville", 635, "978-1503280786"); // Skapar ett objekt av Bok och ger den egenskaper via constructor
        bokhylla.addBok(bok2); // Lägg till bok till den samlingstyp du valt
 // Skapar ett objekt av Bok och ger den egenskaper via constructor
        Bok bok3 = new Bok("Pride and Prejudice", "Jane Austen", 279, "978-1503290563"); // Skapar ett objekt av Bok och ger den egenskaper via constructor
        bokhylla.addBok(bok3); // Lägg till bok till den samlingstyp du valt

        //Skapar en variabel för att spara undan det objekt som hittas genom getBookById
        Bok hittadBok
                = bokhylla.getBookById("978-1503280786"); //Returnerar ett bok-objekt

        System.out.println(hittadBok); // Vi skriver ut den bok som hittades enligt den struktur vi satt. toString()-metoden i Bok-klassen

        bokhylla.printBooks(); //System out alla böcker - Alla egenskaper, Skriver ut alla böcker och dess egenskaper
    }
}
