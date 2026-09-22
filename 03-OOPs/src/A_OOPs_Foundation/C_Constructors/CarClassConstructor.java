package A_OOPs_Foundation.C_Constructors;

/**
 Constructor

 A constructor is a special member of a class that is used to
 initialize an object when it is created.

 Why do we need a constructor?

 Normally, after creating an object, we would have to initialize
 its instance variables separately:
 ex:
 Student s1 = new Student(); // Creating object
 s1.name = "Asif"; // initializing instance variable
 s1.age = 20;

 This becomes inconvenient when a class has many instance variables.

 A constructor allows us to initialize the object directly at the
 time of its creation:

 Example:

 class Student {
 String name;
 int age;

 // Constructor
 Student(String name, int age) {
 this.name = name;
 this.age = age;
 }
 }

 // Constructor is automatically called when the object is created.
 Student s1 = new Student("Asif", 20); // passing to constructor

 Constructor Rules:
 1. Its name must be the same as the class name (ex-Student in above example)
 2. It does not have a return type, not even void.

 Syntax:
 ClassName(parameters) {
 // initialization
 }
 */

// NOTE : We can directly create constuctor-> right click -> generate -> select parameters -> create constructor DONE

public class CarClassConstructor {

    // Properties or state
    String brand;
    String colour;
    int speed;

    //ByDefault Constructor (seems invisible until we do manually)
    /**
    public CarClassConstructor() {
     This is default constructor that's exist everytime without manual writing
     For every program execution a constructor is created and its depends on us to initialize it or not
    }
    */

    // Parameterized Constructor
    public CarClassConstructor(String colour, String brand, int speed) {

        System.out.println("Printed when Constructor called");

        // 'this' keyword refers to the current object being created.

        this.colour = colour;
        // Left side (this.colour) -> instance variable of the current object
        // Right side (colour) -> constructor parameter

        this.brand = brand;
        this.speed = speed;
    }

    //Another Ex to understand well
    /**
    public CarClassConstructor(String a, String b, int c) {
        this.colour = a;
        this.brand = b;
        this.speed = c;
    }
    */

    // Concept of Constructor OverLoading

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

/**
1) VeryImp : Parameter names do not matter in constructor overloading.

Java only checks the parameter types (String,int etc), so Car(String brand) and Car(String colour) are considered the same constructor.
 Example:
 Car(String brand)
 Car(String colour)
 Above both in one class not allowed (Error)

 * Both are seen as: Car(String)*/