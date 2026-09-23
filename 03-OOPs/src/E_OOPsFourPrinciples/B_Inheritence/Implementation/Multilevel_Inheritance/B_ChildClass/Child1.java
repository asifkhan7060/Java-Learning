package E_OOPsFourPrinciples.B_Inheritence.Implementation.Multilevel_Inheritance.B_ChildClass;

import E_OOPsFourPrinciples.B_Inheritence.Implementation.Multilevel_Inheritance.A_ParentClass.Vehicle;

public class Child1 extends Vehicle {

    private final int doors;

    // Constructor
    public Child1(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Doors: " + doors);
    }
}
