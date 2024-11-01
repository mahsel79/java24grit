package lektion6.djur;

public class Katt extends Djur {

    private int antalSvansar;

    public Katt(String name, int age, int antalSvansar) {
        super(name, age);
        this.antalSvansar = antalSvansar;
    }

    public int getAntalSvansar() {
        return antalSvansar;
    }

    @Override
    public void eat() {
        System.out.println("glofh");
    }

    @Override
    public void sleep() {
        System.out.println("mjauzzzzz");
    }
}
