package E_OOPs_Principles.B_Inheritence.Implementation.Multiple_Inheritance;

import E_OOPs_Principles.B_Inheritence.Implementation.Multiple_Inheritance.B_Class.Car;

public class MultipleInheritanceDemo {

    public static void main(String[] args) {

        Car car = new Car("BMW");

        car.startEngine();
        car.rotateWheels();
    }
}
