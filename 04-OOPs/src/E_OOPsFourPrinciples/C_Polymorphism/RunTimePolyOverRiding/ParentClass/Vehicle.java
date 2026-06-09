package E_OOPsFourPrinciples.C_Polymorphism.RunTimePolyOverRiding.ParentClass;

// Parent Class (Superclass)

public class Vehicle {

    // Encapsulated Properties
    private String brand;
    private int speed;

    // Constructor
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void start(){
        System.out.println("Starting Vehicle...");
    }

    // Getter for Brand
    public String getBrand() {
        return brand;
    }

    // Setter for Brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter for Speed
    public int getSpeed() {
        return speed;
    }

    // Setter for Speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Common Behavior
    public void display() {
        System.out.println("Brand: " + brand + " Speed: " + speed);
    }
}