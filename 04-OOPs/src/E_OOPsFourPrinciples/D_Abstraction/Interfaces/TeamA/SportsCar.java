package E_OOPsFourPrinciples.D_Abstraction.Interfaces.TeamA;

import E_OOPsFourPrinciples.D_Abstraction.Interfaces.TeamB.CarControls;

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
