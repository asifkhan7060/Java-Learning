package C_Constructors.B_GettersAndSetters;

public class CarObjects {
    public static void main() {

        CarClassConstructor car1 = new CarClassConstructor(500);

        // Getter : Can get a specific values which are already declared in state using setter or constructor(initial value)
        System.out.println("Initial Value : "+car1.getSpeed());
        car1.drive();

        // New values can be set using setter
        car1.setSpeed(1000);

        // Printed Updated Values
        System.out.println("Value Updated to : "+car1.getSpeed());


        // Working on private modifier

        CarClassConstructor car2 = new CarClassConstructor("Audi","Blue");
        System.out.println("Brand : "+car2.getBrand());

        // Getting the colour value (cant possible because it is private and only setter is declared)
        // System.out.println(car2.getColour); // Error : java: cannot find symbol (symbol:   variable getColour)

        // Setting is allowed for colour
        car2.setColour("Black");
        // System.out.println(car2.colour);  Not Possible


        // Implementing changes in getter and setter for power

        CarClassConstructor car3 = new CarClassConstructor(500.0);

        // Getting initial value
        System.out.println("Power : " + car3.getPower());

        // Setting a valid value
        car3.setPower(1000.0);

        System.out.println("Updated Power : " + car3.getPower());

        // Setting an invalid value
        car3.setPower(-100.0); // results : Power must be greater than 0 (hence cant be set)

        System.out.println("Power After Invalid Update : " + car3.getPower());



    }
}