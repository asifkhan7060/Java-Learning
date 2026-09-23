package E_OOPsFourPrinciples.C_Abstraction.Interfaces.TeamA;

import E_OOPsFourPrinciples.C_Abstraction.Interfaces.TeamB.CarControls;

public class SportsCar implements CarControls {
    @Override
    public void turnRight() {
        System.out.println("Sports Right");
    }

    @Override
    public void turnLeft() {
        System.out.println("Sports Right");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Sports Right");
    }
}
