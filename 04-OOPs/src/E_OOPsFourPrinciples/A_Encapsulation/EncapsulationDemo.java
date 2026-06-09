package E_OOPsFourPrinciples.A_Encapsulation;

/**
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ENCAPSULATION IN JAVA<br>
 * ====================================================<br><br>
 *
 * Study : Encapsulation<br><br>
 *
 * 🔹 What is Encapsulation?<br><br>
 *
 * Encapsulation is one of the four pillars of
 * Object Oriented Programming (OOP).<br><br>
 *
 * It is the process of wrapping data (instance variables)
 * and methods into a single unit called a Class.<br><br>
 *
 * Encapsulation also helps in hiding data and providing
 * controlled access to it.<br><br>
 *
 * ----------------------------------------------------<br><br>
 *
 * 🔹 Simple Definition<br><br>
 *
 * Encapsulation = Data Hiding + Controlled Access<br><br>
 *
 * ----------------------------------------------------<br><br>
 *
 * 🔹 Why is Encapsulation Needed?<br><br>
 *
 * Without Encapsulation, any class can directly access
 * and modify variables, which may lead to invalid data.<br><br>
 *
 * Encapsulation protects data and allows controlled
 * interaction through methods.<br><br>
 *
 * ----------------------------------------------------<br><br>
 *
 * 🔹 How is Encapsulation Achieved?<br><br>
 *
 * 1. Declare instance variables as private.<br>
 * 2. Use Getter methods to read values.<br>
 * 3. Use Setter methods to modify values.<br><br>
 *
 * ----------------------------------------------------<br><br>
 *
 * Example:<br><br>
 *
 * private String brand;<br><br>
 *
 * public String getBrand() {<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;return brand;<br>
 * }<br><br>
 *
 * public void setBrand(String brand) {<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;this.brand = brand;<br>
 * }<br><br>
 *
 * ----------------------------------------------------<br><br>
 *
 * 🔹 Real Life Example<br><br>
 *
 * Consider a Bank Account.<br><br>
 *
 * Account balance should not be modified directly.<br><br>
 *
 * Instead, users should use methods such as:<br><br>
 *
 * • deposit()<br>
 * • withdraw()<br>
 * • checkBalance()<br><br>
 *
 * This ensures that balance is accessed and modified
 * in a controlled manner.<br><br>
 *
 * ----------------------------------------------------<br><br>
 *
 * 🔹 Access Modifiers and Encapsulation<br><br>
 *
 * private<br>
 * → Accessible only within the same class.<br><br>
 *
 * protected<br>
 * → Accessible within the same package and subclasses.<br><br>
 *
 * public<br>
 * → Accessible from anywhere.<br><br>
 *
 * ----------------------------------------------------<br><br>
 *
 * 🔹 Main Idea<br><br>
 *
 * private + Getter only<br>
 * = Read Only<br><br>
 *
 * private + Setter only<br>
 * = Write Only<br><br>
 *
 * private + Getter + Setter<br>
 * = Read and Write<br><br>
 *
 * ----------------------------------------------------<br><br>
 *
 * 🔹 Benefits of Encapsulation<br><br>
 *
 * • Data Security<br>
 * • Controlled Access<br>
 * • Data Validation<br>
 * • Better Maintainability<br>
 * • Better Code Organization<br><br>
 *
 * ----------------------------------------------------<br><br>
 *
 * 🔹 Summary<br><br>
 *
 * Encapsulation is the process of hiding data and
 * providing controlled access through methods.<br><br>
 *
 * It is implemented using:<br><br>
 *
 * • private variables<br>
 * • Getter methods<br>
 * • Setter methods<br><br>
 *
 * Encapsulation improves security, maintainability,
 * and reliability of software.
 */

// Access Modifier : Public, Private and Protected

// Access Modifiers are used to control the accessibility of variables, methods, constructors, and classes.
// public    → Accessible from anywhere.
// private   → Accessible only within the same class.
// protected → Accessible within the same package and by child classes.

class CarClass {

    /**
     Encapsulation = Data Hiding + Controlled Access
     Main Idea :
     * Private + Getter only = Read Only
     * Private + Setter only = Write Only
     * Private + Getter + Setter = Read and Write
     */

    // Private variables (Data Hiding)
    private final String brand;
    private int speed;

    // Constructor
    public CarClass(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Getter - Read Access
    public String getBrand() {
        return brand;
    }

    // Getter - Read Access
    public int getSpeed() {
        return speed;
    }

    // Setter - Controlled Write Access
    public void setSpeed(int speed) {

        if (speed < 0) {
            System.out.println("Speed cannot be negative");
            return;
        }

        this.speed = speed;
    }

    // Behaviour
    public void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }
}

public class EncapsulationDemo {

    public static void main(String[] args) {

        // Creating Object
        CarClass car1 = new CarClass("BMW", 200);

        // Reading private data using Getters
        System.out.println("Brand : " + car1.getBrand());
        System.out.println("Speed : " + car1.getSpeed());

        // Updating private data using Setter
        car1.setSpeed(250);

        System.out.println("Updated Speed : " + car1.getSpeed());

        // Validation through Setter
        car1.setSpeed(-100);

        // Calling Behavior
        car1.drive();

        // Direct access is not allowed
        // car1.speed = 1000;   // Error
        // car1.brand = "Audi"; // Error

        // Since Setter for brand is not defined and brand is private,
        // the brand value cannot be modified from outside the class.

        // Since Getter for brand is implemented,
        // the brand value can be read from outside the class.
    }
}