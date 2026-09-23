package B_OOPs_Principles.B_Inheritence.Multiple_Inheritance;

import B_OOPs_Principles.B_Inheritence.Multiple_Inheritance.B_Class.Car;

public class MultipleInheritanceDemo {

    public static void main(String[] args) {

        Car car = new Car("BMW");

        car.startEngine();
        car.rotateWheels();
    }
}
