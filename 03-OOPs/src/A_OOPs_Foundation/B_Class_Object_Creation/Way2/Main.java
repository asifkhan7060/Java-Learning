package A_OOPs_Foundation.B_Class_Object_Creation.Way2;

// Way 2 - Multiple top-level classes in a single Java file (🟡 Use selectively - for Small demos, coding practice, closely related simple classes)

// Class 1
public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}

// Class 2
class Car {

    void drive() {
        System.out.println("BMW is driving");
    }
}

// or - You can also have the main() in the non-public class:

/**
public class Main {
}

class Car {

    public static void main(String[] args) {
        System.out.println("Printed");
    }
}

 The file is: Main.java
 Compile:
 javac Main.java
 This compiles both Main and Car and produces: Main.class & Car.class

 Run:
 java Car
 Output: Printed
 */