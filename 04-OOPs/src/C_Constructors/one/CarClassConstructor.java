package C_Constructors.one;

/**Constructor*/
// Without constructors, we need to initialize each instance variable
// manually after creating an object. This becomes tedious when a class
// contains many instance variables.

// Constructors are special methods that are used to initialize objects.
// They are defined inside the class and are automatically invoked when
// an object is created using the 'new' keyword.

// With constructors, we can initialize instance variables at the time
// of object creation by passing values as arguments.

// Example:
// Student s1 = new Student("Asif", 20);
// Here, "Asif" and 20 are passed to the constructor, which initializes
// the object's instance variables automatically.

// Syntax:
// public ClassName(type parameter1, type parameter2, ...) {
//     // Initialization code
// }

    /** NOTE : We can directly create constuctor-> right click -> generate -> select parameters -> create constructor DONE */

    
public class CarClassConstructor {

    // Properties or state
    String brand;
    String colour;
    int speed;

    // ByDefault Constructor
    /**
    public CarClassConstructor() {   // This is default constructor that's exist everytime without manual writing
     //(For every program execution a constructor is created and its depends on us to initialize it or not)
    }
    */

    // Parameterized Constructor
    public CarClassConstructor(String colour, String brand, int speed) {

        System.out.println("Printed when Constructor called");

        // 'this' refers to the current object being created.

        this.colour = colour;
        // Left side (this.colour) -> instance variable of the current object
        // Right side (colour) -> constructor parameter

        this.brand = brand;
        // Left side (this.brand) -> instance variable
        // Right side (brand) -> constructor parameter

        this.speed = speed;
        // Left side (this.speed) -> instance variable
        // Right side (speed) -> constructor parameter
    }

    //Another Ex to understand well
        /**
    public CarClassConstructor(String a, String b, int c) {
        this.colour = a;
        this.brand = b;
        this.speed = c;
    }
    */

    // We can create multiple constructors with different parameters!!!
    // Single parameter constructor
        public CarClassConstructor(String brand) {
            System.out.println("This is Single parameter constructor");
            this.brand = brand;
        }

    // Double parameter constructor
        public CarClassConstructor(int speed, String colour) {
            System.out.println("This is Double parameter constructor");
            this.speed = speed;
            this.colour = colour;
        }

        // Behaviour
    public void drive(){
        System.out.println(brand+" is driving at "+speed);
    }
}
