package E_OOPs_Principles.C_Abstraction.Interfaces;

import E_OOPs_Principles.C_Abstraction.Interfaces.B_Team.ElectricCar;
import E_OOPs_Principles.C_Abstraction.Interfaces.B_Team.SportsCar;
import E_OOPs_Principles.C_Abstraction.Interfaces.A_Team.CarControls;

// Interface can define constants, abstract methods, default/static/private methods, and nested classes/interfaces;
// it cannot have constructors or instance variables.

public class InterfaceDemo {
    static void main() {

        // Cannot create object of an Interface
        // CarControls myCar = new CarControls() {}; - not possible

        // Creating ElectricCar Object
        ElectricCar e1 = new ElectricCar();

        // Calling methods implemented from CarControls Interface
        e1.applyBrakes();
        e1.turnLeft();

        System.out.println();

        // Possible
        CarControls myCar = new ElectricCar();
        myCar.turnLeft();

        System.out.println();




        // Creating SportsCar Object
        SportsCar s1 = new SportsCar();
        s1.turnRight();

        System.out.println();

        // possible
        CarControls s2 = new SportsCar();
        s2.accelerate();

    }
}