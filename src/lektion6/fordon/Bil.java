package lektion6.fordon;

public class Bil extends Fordon{

    public Bil(String regNummer) {
        super(regNummer);
    }

    @Override
    public void drive() {
        System.out.println("Bil driven");
    }

}
