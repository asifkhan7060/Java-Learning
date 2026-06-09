package E_OOPsFourPrinciples.B_Inheritence.B_Implementation;

import E_OOPsFourPrinciples.B_Inheritence.B_Implementation.ChildClass.Bike;
import E_OOPsFourPrinciples.B_Inheritence.B_Implementation.ChildClass.Car;

public class InheritanceDemo {
    static void main() {
        // Creating Child Class Object
        Car c1 = new Car("Mercedes", 800,5);

        // Calling Parent Class Method using Child Object
        // Since Car inherits Vehicle, it can access
        // all public methods of Vehicle.
        c1.display();

        Bike b1 = new Bike("Yamaha",120,true);
        b1.display();
    }
}
