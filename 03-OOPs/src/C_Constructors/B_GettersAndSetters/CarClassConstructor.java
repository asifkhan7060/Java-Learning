package C_Constructors.B_GettersAndSetters;

// In Encapsulation, instance variables are usually declared as private so that they cannot be accessed directly from outside the class.

/**
 🔹 Setter Method
 A Setter Method is used to assign or update the value of a private variable.

 Syntax:
 public void setVariableName(DataType value){
      this.variableName = value;
  }

 Example:
 public void setBrand(String brand){
      this.brand = brand;
  }

  🔹 Getter Method
 A Getter Method is used to retrieve the value of a private variable.

 Syntax:
 public DataType getVariableName(){
      return variableName;
 }

 Example:
 public String getBrand(){
      return brand;
 }
 */

// NOTE : Shortcut to create getter and setter directly (Right click on code after declaring properties -> Generate -> Getter and Setter -> Select property -> DONE )

// public,private and protected are the access modifier which are used to take full control over properties reading and writing
// Here Access modifier imp role in getter and setter , since private state cant be access by other class we can implement getter and setter for using it !
// If a dev wants to give access for reading the brand state but dosent want to give access for setting it..here we can declare brand state as private and implement only getter.

/**
 * Main Idea :
 * Private + Getter only = Read Only
 * Private + Setter only = Write Only
 * Private + Getter + Setter = Read and Write
 */

public class CarClassConstructor {

    // Declared Properties or state
    private String brand;
    private String colour;
    int speed;
    private double power;

    public CarClassConstructor(int speed) {
        this.speed = speed;
    }

    // Getter for Speed
    public int getSpeed() {
        return speed; // Returns value which stored in above declared properties
    }

    // Setter for Speed
    public void setSpeed(int speed) {
        this.speed = speed;  // Sets value to above declared properties
    }


    // Working on Private modifier

    public CarClassConstructor(String brand, String colour) {
        this.brand = brand;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    // Since brand is private now if we want user to allow to set brand then only we can uncomment below block of code

//    public void setBrand(String brand) {
//        this.brand = brand;
//    }


    // Setting is allowed for colour but reading disabled
    public void setColour(String colour) {
        this.colour = colour;
    }

    public void drive() {
        System.out.println(brand + " is driving at " + speed);
    }

    // Implementing changes in getter and setter for power

    public CarClassConstructor(double power) {
        this.power = power;
    }

    public double getPower() {

        if(power <= 0) {
            System.out.println("Power is not initialized properly");
            return 0;
        }

        return power;
    }

    public void setPower(double power) {

        if(power <= 0) {
            System.out.println("Power must be greater than 0");
            return;
        }

        this.power = power;
    }


}
