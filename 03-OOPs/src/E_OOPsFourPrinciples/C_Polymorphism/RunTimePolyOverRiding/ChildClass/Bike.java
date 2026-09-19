package E_OOPsFourPrinciples.C_Polymorphism.RunTimePolyOverRiding.ChildClass;


import E_OOPsFourPrinciples.C_Polymorphism.RunTimePolyOverRiding.ParentClass.Vehicle;

public class Bike extends Vehicle {
    private boolean hasCarrier;

    // Constructor
    public Bike(String brand, int speed, boolean hasCarrier){

        // 2nd Preference (It prints second)
        super(brand,speed);

        this.hasCarrier = hasCarrier;

        // 1st preference (It prints first)
        System.out.println(
                "Brand: " + getBrand() +
                        " Speed: " + getSpeed() +
                        " km/hr " +
                        hasCarrier + " door "
        );
    }

    // OverRiding start() Method from parent class
    @Override
    public void start(){
        System.out.println("Starting Bike....");
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
