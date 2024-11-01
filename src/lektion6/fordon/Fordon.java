package lektion6.fordon;

public abstract class Fordon {

    private String regNummer;

    public Fordon(String regNummer) {
        this.regNummer = regNummer;
    }

    public String getRegNummer() {
        return regNummer;
    }

    abstract void drive();
}
