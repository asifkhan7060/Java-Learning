package E_OOPsFourPrinciples.B_Inheritence.Implementation.Multilevel_Inheritance.B_ChildClass;

public class Child2 extends Child1 {

    private final int batteryCapacity;

    // Constructor
    public Child2(String brand, int speed, int doors, int batteryCapacity) {
        super(brand, speed, doors);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}
