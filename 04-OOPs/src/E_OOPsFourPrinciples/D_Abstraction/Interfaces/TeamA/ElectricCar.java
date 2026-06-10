package E_OOPsFourPrinciples.D_Abstraction.Interfaces.TeamA;

import E_OOPsFourPrinciples.D_Abstraction.Interfaces.TeamB.CarControls;

public class ElectricCar implements CarControls {
    @Override
    public void turnRight() {
        System.out.println("Electric Right");
    }

    @Override
    public void turnLeft() {
        System.out.println("Electric Left");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Electric Brake");
    }
}
