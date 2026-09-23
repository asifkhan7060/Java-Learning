package E_OOPsFourPrinciples.B_Inheritence.Implementation.Hierarchical_Inheritance;

import E_OOPsFourPrinciples.B_Inheritence.Implementation.Hierarchical_Inheritance.B_ChildClass.Bike;
import E_OOPsFourPrinciples.B_Inheritence.Implementation.Hierarchical_Inheritance.B_ChildClass.A_Car;

public class InheritanceDemo {
    static void main() {
        // Creating Child Class Object
        A_Car c1 = new A_Car("Mercedes", 800,5);

        // Calling Parent Class Method using Child Object
        // Since Car inherits Vehicle, it can access all public methods of Vehicle.
        c1.display(); // Method Overriding concept is used

        Bike b1 = new Bike("Yamaha",120,true);
        b1.display();
    }
}
