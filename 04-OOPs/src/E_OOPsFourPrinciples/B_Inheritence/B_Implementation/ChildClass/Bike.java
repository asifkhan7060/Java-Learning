package E_OOPsFourPrinciples.B_Inheritence.B_Implementation.ChildClass;

import E_OOPsFourPrinciples.B_Inheritence.B_Implementation.ParentClass.Vehicle;

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


}
