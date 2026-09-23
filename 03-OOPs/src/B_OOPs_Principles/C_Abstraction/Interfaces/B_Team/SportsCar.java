package B_OOPs_Principles.C_Abstraction.Interfaces.B_Team;

import B_OOPs_Principles.C_Abstraction.Interfaces.A_Team.CarControls;

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
