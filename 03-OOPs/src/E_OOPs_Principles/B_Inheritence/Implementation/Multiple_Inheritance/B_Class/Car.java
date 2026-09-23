package E_OOPs_Principles.B_Inheritence.Implementation.Multiple_Inheritance.B_Class;

import E_OOPs_Principles.B_Inheritence.Implementation.Multiple_Inheritance.A_Interfaces.A_Engine;
import E_OOPs_Principles.B_Inheritence.Implementation.Multiple_Inheritance.A_Interfaces.B_Wheels;

// Since Java does not support multiple inheritance through classes,
// the two "parent classes - A_Engine and B_Wheels" here are represented using interfaces.

/**
 Interface:
 An interface defines a contract that implementing classes must follow.

 Basic Rules:
 - Cannot have constructors.
 - Does not have instance variables.
 - Variables declared in an interface are by default public, static, and final
 (So they are considered as constants not instance variables )
 - Methods without a body are abstract methods.
 - A class implements an interface using 'implements'.
 - A class can implement multiple interfaces.

 Further details about Interfaces will be studied in the Abstraction topic.
 */

public class Car implements A_Engine, B_Wheels {

    private String brand;

    // Constructor
    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " engine started");
    }

    @Override
    public void rotateWheels() {
        System.out.println(brand + " wheels are rotating");
    }
}
