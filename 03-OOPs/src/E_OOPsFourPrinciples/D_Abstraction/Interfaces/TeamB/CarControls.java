package E_OOPsFourPrinciples.D_Abstraction.Interfaces.TeamB;

// Similar to Abstraction in interface template (Blueprint is created) - Only declaration is implemented here

// Team B : Who creates Car (Blueprint) - Team A use it while creating Car like Robot
public interface CarControls {
    void turnRight();
    void turnLeft();
    void applyBrakes();

    // In previous version definition for methods are not allowed just like abstraction
    // In new version , Now we can give definition to any methods by using default keyword
    default void accelerate(){
        System.out.println("Generally not used");
    }
}

