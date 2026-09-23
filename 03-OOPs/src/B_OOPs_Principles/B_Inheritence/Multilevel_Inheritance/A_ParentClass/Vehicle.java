package B_OOPs_Principles.B_Inheritence.Multilevel_Inheritance.A_ParentClass;

public class Vehicle {

    private final String brand;
    private final int speed;

    // Parent Class Constructor
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void display() {
        System.out.println("Brand: " + brand + " Speed: " + speed);
    }
}
