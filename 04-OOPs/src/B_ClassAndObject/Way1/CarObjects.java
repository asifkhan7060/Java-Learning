package B_ClassAndObject.Way1;

// Objects are the instances of Class
// Ex : Creating a Car instances

// NOTE : Objects class contains entry point (main function)

public class CarObjects {
    public static void main() {

        // Creating car object
        CarClass car1 = new CarClass();

        // Process of Instantiation
        car1.brand = "BMW";
        car1.colour = "Red";
        car1.speed = 89;

        car1.drive();


        // Creating another car object
        CarClass car2 = new CarClass();

        // Process of Instantiation
        car2.brand = "Audi";
        car2.colour = "Green";
        car2.speed = 100;

        car1.drive();
    }
}
