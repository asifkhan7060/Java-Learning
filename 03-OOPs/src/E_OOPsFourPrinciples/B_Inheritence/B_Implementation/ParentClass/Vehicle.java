package E_OOPsFourPrinciples.B_Inheritence.B_Implementation.ParentClass;

// Parent Class (Superclass)

public class Vehicle {

    // Encapsulated Properties
    private String brand;
    private int speed;

    /** Parent Class Constructor
     If the Parent Class has a parameterized constructor,
     then the Child Class must call it using super(...)
     to initialize the Parent Class properties */
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
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