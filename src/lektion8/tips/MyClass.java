package lektion8.tips;


/*
    Denna klass användes enbart för att visa att age, weight och gender har standardvärde.
    Det här är något vi gått igenom tidigare lektioner, men om är värt att upprepa.
    Vi behöver oftast bara nämna typ och namn på våra egenskaper. Sen sätter vi värdena via constructorn.

    Vi behöver således INTE skriva int age = 0;
    int är default till 0 - vilket går att se om denna klass körs
 */
public class MyClass {

    private int age;
    private double weight;
    private String gender;

    public MyClass() {
        System.out.println("" + age);
        System.out.println("" + weight);
        System.out.println("" + gender);
    }

    /*
        Bara ett exempel på att vi kan ha flera Constructorer. Precis som vi kan ha flera metoder av "samma".
        Dock är principen densamma - in-parametrarna måste skilja sig för att detta skall fungera.
     */
    public MyClass(int age, double weight, String gender) {
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

}
