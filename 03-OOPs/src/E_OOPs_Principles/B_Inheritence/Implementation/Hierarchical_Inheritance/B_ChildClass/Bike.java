package E_OOPs_Principles.B_Inheritence.Implementation.Hierarchical_Inheritance.B_ChildClass;

import E_OOPs_Principles.B_Inheritence.Implementation.Hierarchical_Inheritance.A_ParentClass.Vehicle;

// Child Class 2

public class Bike extends Vehicle {
    private boolean hasCarrier;

    // Constructor
    public Bike(String brand,int speed,boolean hasCarrier){
        super(brand,speed);
        this.hasCarrier = hasCarrier;
    }

    // Setter
    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    // Getter
    public boolean isHasCarrier(){
        return hasCarrier;
    }

    @Override
    public void display() {
        System.out.println("Here it is Bike");
    }
}
