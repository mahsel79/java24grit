package lektion5.bil;

public class Car {
    //Egenskaper

    //Max hastighet - 195
    private final int speedMax = 195;

    //Märke - Volvo
    private String brand;
    //Modell - 240
    private String model;
    //Tillverkningsår - 1999
    private int year;
    //Färg - Grön
    private String color;
    //Hastighet - 0
    private int speed;

    public Car(String brand, String model, int year, String color, int speed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.speed = speed;
    }


    //Metoder
    //Gasa – Öka hastigheten, men aldrig över 95
    //Bromsa – Sänk hastigheten, men aldrig under 0
    //Tuta – TJÅT TJÅT
    public void gasa() {
        System.out.println("Gasa");
    }

    public void bromsa() {
        System.out.println("Bromsa");
    }

    public void tuta() {
        System.out.println("Tuta");
    }



    //Getters setters
    public int getSpeedMax() {
        return speedMax;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
