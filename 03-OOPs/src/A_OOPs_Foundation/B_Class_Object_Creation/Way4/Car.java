package A_OOPs_Foundation.B_Class_Object_Creation.Way4;

// Way 3 — Class + main() in Same Class (✅ Recommended for small programs)

public class Car {

    String brand;
    int speed;

    void drive() {
        System.out.println(brand + " is driving at " + speed);
    }

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.brand = "BMW";
        car1.speed = 100;

        car1.drive();
    }
}
