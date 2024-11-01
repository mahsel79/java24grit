package lektion6.djur;

public abstract class Djur {
    private String name;
    private int age;

    public Djur(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void walk() {
        System.out.println("Djur walk");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void eat();
    public abstract void sleep();
}
