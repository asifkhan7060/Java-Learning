package B_ClassAndObject.Way1;

// Objects are the instances of Class
// Ex : Creating a Car instances

// NOTE : Objects class contains entry point (main function)

public class CarObjects {
    public static void main() {

        // Creating and instantiating an object
                CarClass car1 = new CarClass();  // new CarClass() -> Process of Instantiation

        // Assigning values to instance variables
                car1.brand = "BMW";   // car1 = reference variable, brand = instance variable
                car1.colour = "Red";
                car1.speed = 89;

        // Calling an instance method
                car1.drive();


        // Creating and instantiating an object
        CarClass car2;
        car2 = new CarClass();

        // Assigning values to instance variables
        car2.brand = "Audi";
        car2.colour = "Green";
        car2.speed = 100;

        car1.drive();
    }
}
