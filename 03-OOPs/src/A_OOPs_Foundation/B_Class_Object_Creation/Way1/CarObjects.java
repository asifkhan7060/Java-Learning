package A_OOPs_Foundation.B_Class_Object_Creation.Way1;

// Objects are the instances of Class - Here we are Creating a Car instances

// NOTE : CarObjects contains the main() method, which serves as the entry point for the program.

// Top level Class - Cant be Static
public class CarObjects {
    public static void main(String[] args) {

        // Creating and instantiating an object
        CarClass car1 = new CarClass();  // new CarClass() -> Process of Instantiation

        // CarClass -> Reference type / Class type
        // car1 -> Reference variable
        // new -> Object creation operator — allocates memory for a new object
        // CarClass() -> Constructor invocation — initializes the newly created object

        // Assigning values to instance variables
        car1.brand = "BMW";   // brand = instance variable
        car1.colour = "Red";
        car1.speed = 89;

        // Calling an instance method
        car1.drive();

    }
}