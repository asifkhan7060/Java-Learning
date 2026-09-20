package A_OOPs_Foundation.B_Class_Object_Creation.Way1;

// Way 1 — Separate Classes ✅ Recommended / Preferred (Real projects, reusable classes, larger applications)

// Class is a Blueprint (Template)
// Ex : Creating a Car Template/BluePrint

// Rules to Note :
// In Java, if a class is declared as public, the file name must be exactly the same as the public class name.
// Top-level classes cannot be static (Top level means - a class that is not declared inside another class, interface, or similar type.)

// Top level Class
public class CarClass {

    // Properties or state or instance variable
    String brand;
    String colour;
    int speed;

    // Behavior or instance method
    public void drive(){
        System.out.println(brand+" is driving at "+speed);
    }
}
