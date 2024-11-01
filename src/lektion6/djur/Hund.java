package lektion6.djur;

public class Hund extends Djur{

    private int antalTassar;

    public Hund(String name, int age, int antalTassar) {
        super(name, age);
        this.antalTassar = antalTassar;
    }

    public int getAntalTassar() {
        return antalTassar;
    }

    @Override
    public void eat() {
        System.out.println("yam yum");
    }

    @Override
    public void sleep() {
        System.out.println("Zzzzzzzzzzzzzzzzz");
    }
}
