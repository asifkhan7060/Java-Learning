package E_OOPsFourPrinciples.C_Polymorphism.RunTimePolyOverRiding;

import E_OOPsFourPrinciples.C_Polymorphism.RunTimePolyOverRiding.ChildClass.Bike;
import E_OOPsFourPrinciples.C_Polymorphism.RunTimePolyOverRiding.ChildClass.Car;
import E_OOPsFourPrinciples.C_Polymorphism.RunTimePolyOverRiding.ParentClass.Vehicle;

public class PolymorphismDemo {
    static void main() {

        // Creating Child Class Object of Car
        Car c1 = new Car("Mercedes", 800,5);
        c1.display(); // Method Overriding concept is used (see in car class)
        c1.start(); //Since this method is implemented in parent class as a public we can access it through child Car Class
        System.out.println(); // for spacing



        // Creating Child Class Object of Bike
        Bike b1 = new Bike("Yamaha",120,true);
        b1.display();

        // OverRiding Method :
        b1.start(); //Since this method is implemented in parent class as a public we can access it through child Bike Class but here we override it
        System.out.println(); // for spacing



        // Creating Object of Vehicle (Parent Class)
        Vehicle v1 = new Vehicle("Maruti",400);
        v1.display();
        v1.start();

        Vehicle v2 = new Car("Jaguar",700,6);
        v2.display(); // same flow like c1.display();
        v2.start(); // Say Vehicle starting or Car starting ? Solution : Vehicle Starting Why? Because Car does not override the start() method.

        Vehicle v3 = new Bike("splender",700,false);
        v3.display(); // 1st sout -> 2nd super calling
        v3.start(); // Say Vehicle starting or Bike starting ? Solution : Bike Starting Why? Because Bike override the start() method.

    }
}