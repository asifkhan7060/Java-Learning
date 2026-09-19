package E_OOPsFourPrinciples.D_Abstraction.Interfaces;

import E_OOPsFourPrinciples.D_Abstraction.Interfaces.TeamA.ElectricCar;
import E_OOPsFourPrinciples.D_Abstraction.Interfaces.TeamA.SportsCar;
import E_OOPsFourPrinciples.D_Abstraction.Interfaces.TeamB.CarControls;

public class InterfaceDemo {
    static void main() {

        // Creating ElectricCar Object
        ElectricCar e1 = new ElectricCar();

        // Calling methods implemented from CarControls Interface
        e1.applyBrakes();
        e1.turnLeft();

        System.out.println();

        // Not Allowed:
        // Cannot create object of an Interface because
        // Interfaces only define a contract and do not
        // provide complete implementation.
        //
        // CarControls myCar = new CarControls() {};

        /**
         * Interface Reference = Child Object
         *
         * CarControls is an Interface.
         * ElectricCar implements CarControls.
         *
         * This is Runtime Polymorphism.
         *
         * Only methods declared inside the Interface
         * can be accessed through the Interface reference.
         */
        CarControls myCar = new ElectricCar();

        myCar.turnLeft();

        System.out.println();

        // Creating SportsCar Object
        SportsCar s1 = new SportsCar();

        // Calling implemented method directly
        s1.turnRight();

        System.out.println();

        /**
         * Interface Reference = Child Object
         *
         * SportsCar implements CarControls.
         *
         * Java allows storing the object of an implementing
         * class inside an Interface reference.
         */
        CarControls s2 = new SportsCar();

        s2.accelerate();

        /**
         * Interface Polymorphism:
         *
         * CarControls
         *      ↑
         *      |
         * -----------------
         * |               |
         * ElectricCar   SportsCar
         *
         * One Interface Reference can refer to
         * multiple implementing classes.
         */
    }
}