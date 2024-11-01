package lektion6.fordon;

public class Flygplan extends Fordon{

    private String reseBolag;

    public Flygplan(String regNummer, String reseBolag) {
        super(regNummer);
        this.reseBolag = reseBolag;
    }

    @Override
    public void drive() {
        System.out.println("Flygplan drive");
        System.out.println("Jag är snabbare");
    }

    public String getReseBolag() {
        return reseBolag;
    }

    public void setReseBolag(String reseBolag) {
        this.reseBolag = reseBolag;
    }
}
