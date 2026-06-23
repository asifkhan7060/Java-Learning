package B_List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// In Which areas list interface are used ?
// Hold ctrl and move cursor to List keyword -> go to that file hold again ctrl and move to list and click -> dropdown project files and keep All Places to see where list are implemented

public class Implementation {
    static void main() {

        // Uncontrolled Datatypes
        List<Object> users = new ArrayList<>(); // or List users = new ArrayList<>();
        users.add("Alice");
        users.add(1);

        // Using For Each
        for (Object user : users){
            System.out.println("Using For Each: "+user);
        }

        System.out.println();


        //Controlled Datatypes (Applying Concept of Generics <>)
        ArrayList<String> users1 = new ArrayList<>(); // List or ArrayList Both can use as reference datatype but List keyword cant use at object creation (i.e after a new keyword)
        users1.add("Rudra");
        users1.add("Haya");
        users1.add("Arman");
        users1.add("Arman"); // Duplicates Allowed
        // users1.add(1); // Shows error

        for (String user : users1){  // Object also can be used but if we know confirmed datatype then this recommended
            System.out.println("User: "+user); // Output is ordered
        }

        // Using For
        for (int i = 0; i < users1.size(); i++) {
            System.out.println("Using For loop: "+users1.get(i));
        }

        // Iterator
        Iterator<String> it = users1.iterator();
        while (it.hasNext()){
            System.out.println("Using Iterator: "+it.next());
        }

        // Indexing
        System.out.println("Indexing: "+users1.get(1));


        System.out.println();


        // Work with Class
        Car car1 = new Car("BMW",900);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(new Car("Toyota",500));

        System.out.println("All Cars");
        for (Car car : carList){
            System.out.println("Brand: "+car.brand+", Speed: "+car.speed);
        }

        System.out.println(carList); //Need to implement to String method to get clear values instead Garbage Values
    }
}

class Car {
    String brand;
    int speed;

    Car(String brand,int speed){
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }
}
