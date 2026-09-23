package E_OOPs_Principles.C_Abstraction.Interfaces.B_Team;

import E_OOPs_Principles.C_Abstraction.Interfaces.A_Team.CarControls;

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
