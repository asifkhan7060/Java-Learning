package E_OOPs_Principles.A_Encapsulation;

/**
 ====================================================
 ENCAPSULATION IN JAVA
 ====================================================

 🔹 What is Encapsulation?

 It is the process of wrapping data (instance variables) and methods into a single unit called a Class.
 It also helps in hiding data and providing controlled access to it.

 ----------------------------------------------------

 🔹 Why is Encapsulation Needed?

 Without Encapsulation, any class can directly access and modify variables, which may lead to invalid data.
 Encapsulation protects data and allows controlled interaction through methods.

 ----------------------------------------------------

 🔹 How is Encapsulation Achieved?

 1. Declare instance variables as private.
 2. Use Getter methods to read values.
 3. Use Setter methods to modify values.

 ----------------------------------------------------

 // Setter and Getter

 🔹 Setter Method : A Setter Method is used to assign or update the value of a private variable.

 Syntax:
 public void setVariableName(DataType value){
 this.variableName = value;
 }

 Example:
 public void setBrand(String brand){
 this.brand = brand;
 }

 🔹 Getter Method : A Getter Method is used to retrieve the value of a private variable.

 Syntax:
 public DataType getVariableName(){
 return variableName;
 }

 Example:
 public String getBrand(){
 return brand;
 }

 ----------------------------------------------------

 🔹 Access Modifiers (Used to control the accessibility of variables, methods, constructors, and classes.)

 private → Accessible only within the same class.

 protected → Accessible within the same package and subclasses (Mostly Not in used)

 public → Accessible from anywhere.

 ----------------------------------------------------

 🔹 Main Idea

 private + Getter only = Read Only

 private + Setter only = Write Only

 private + Getter + Setter = Read and Write

 ----------------------------------------------------

 🔹 Benefits of Encapsulation

 • Data Security
 • Controlled Access
 • Data Validation
 • Better Maintainability
 • Better Code Organization

 */

// NOTE : Shortcut to create getter and setter directly (Right click on code after declaring properties -> Generate -> Getter and Setter -> Select property -> DONE )

class CarClass {

    // Private variables (Data Hiding)
    private final String brand;
    private int speed;
    private double range;

    // Constructor
    public CarClass(String brand, int speed, double range) {

        this.brand = brand;
        this.speed = speed;

        // Calling Setter from Constructor
        // Validation is applied even during object creation
        setRange(range);
    }

    // Getter - Read Access
    public String getBrand() {
        return brand;
    }

    // Getter - Read Access
    public int getSpeed() {
        return speed;
    }

    // Getter - Read Access
    public double getRange() {
        return range;
    }

    // Setter - Controlled Write Access
    public void setSpeed(int speed) {

        // Validation can be Applied
        if (speed < 0) {
            System.out.println("Speed cannot be negative");
            return;
        }

        this.speed = speed;
    }

    // Setter - Controlled Write Access
    public void setRange(double range) {

        if (range < 0) {
            System.out.println("Range cannot be negative");
            range = 0;
        }

        this.range = range;
    }

    // Behaviour
    public void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }
}

public class EncapsulationDemo {

    public static void main(String[] args) {

        // Range is negative, but constructor calls setter,
        // so validation is automatically applied.
        CarClass car1 = new CarClass("BMW", 200, -50);

        // Reading private data using Getters
        System.out.println("Brand : " + car1.getBrand());
        System.out.println("Speed : " + car1.getSpeed());
        System.out.println("Range : " + car1.getRange());

        // Updating private data using Setter
        car1.setSpeed(250);

        System.out.println("Updated Speed : " + car1.getSpeed());

        // Validation through Setter
        car1.setSpeed(-100);

        // Updating Range
        car1.setRange(500);

        System.out.println("Updated Range : " + car1.getRange());

        // Calling Behaviour
        car1.drive();

        // Direct setting is not allowed
        // car1.speed = 1000;   // Error
        // car1.brand = "Audi"; // Error
        // car1.range = 1000;   // Error

        // Since Setter for brand is not defined and brand is private,
        // the brand value cannot be modified from outside the class.

        // Since Getter for brand is implemented,
        // the brand value can be read from outside the class.
    }
}