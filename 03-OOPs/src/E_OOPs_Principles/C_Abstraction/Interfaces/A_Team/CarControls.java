package E_OOPs_Principles.C_Abstraction.Interfaces.A_Team;

// Interface can define constants, abstract methods, default/static/private methods, and nested classes/interfaces;
// it cannot have constructors or instance variables.

// A Team : Creates Car Blueprint
// B Team : Use it while creating Car like Sports or Electric Cars

public interface CarControls {
    void turnRight();
    void turnLeft();
    void applyBrakes();

    // In previous version , definition for methods are not allowed just like abstraction
    // But in new version , Now we can give definition to any methods by using default keyword
    default void accelerate(){
        System.out.println("Generally not used");
    }
}

