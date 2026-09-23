package B_OOPs_Principles.B_Inheritence.Multiple_Inheritance.A_Interfaces;

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

public interface B_Wheels {

    // Interface method (Just implement template it will be further defined in child classes)
    void rotateWheels();
}
