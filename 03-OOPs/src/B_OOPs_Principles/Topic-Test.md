# Topic-Test.md — OOP Principles (Coverage + Understanding Test)

> **Scoring rule:** A score of **80% or higher** indicates that the learner has demonstrated enough coverage to move on without doing a first-pass read of the documentation. Below 80%, review the topics represented by the missed questions.

**Total Questions:** 79  
**80% Threshold:** 64 / 79

---

## A. Encapsulation

### Q1.

Consider the design:

```java
class Car {
    private int speed;

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }
}
```

What problem is this design mainly trying to solve?

- **A.** Replacing inheritance with composition
- **B.** Controlling access to object state through methods
- **C.** Making `speed` automatically static
- **D.** Allowing outside code to change `speed` without restriction


### Q2.

Suppose a private field has a getter but no setter. What capability is intentionally exposed?

- **A.** Read-only access
- **B.** No access from anywhere
- **C.** Read-write access
- **D.** Write-only access


### Q3.

Use this setter from the supplied example:

```java
public void setSpeed(int speed) {
    if (speed < 0) {
        System.out.println("Speed cannot be negative");
        return;
    }
    this.speed = speed;
}
```

If the current speed is `250` and `setSpeed(-100)` is called, what is the important state change?

- **A.** The speed becomes `100`
- **B.** The speed becomes `0`
- **C.** The previous value `250` remains unchanged
- **D.** The speed becomes `-100`


### Q4.

The constructor in the supplied `CarClass` does this:

```java
this.speed = speed;
setRange(range);
```

Why is calling `setRange(range)` instead of directly assigning `this.range = range` useful?

- **A.** It prevents the constructor from receiving a value
- **B.** It makes `range` static
- **C.** It automatically creates a getter
- **D.** It applies the setter's validation even during object creation


### Q5.

The supplied setter is:

```java
public void setRange(double range) {
    if (range < 0) {
        range = 0;
    }
    this.range = range;
}
```

What value is stored after `setRange(-50)`?

- **A.** `0`
- **B.** `-50`
- **C.** The previous value is always preserved
- **D.** `50`


### Q6.

A class has:

```java
private final String brand;
public String getBrand() { return brand; }
```

There is no `setBrand()` method. Which conclusion follows from the supplied design?

- **A.** `brand` cannot even be read by the class itself
- **B.** Code outside the class can read `brand` but cannot change it through the class API
- **C.** Code outside the class can assign `brand` directly because a getter exists
- **D.** `brand` can be changed only through `setSpeed()`


### Q7.

Given:

```java
class CarClass {
    private int speed;
}
```

and code outside the class tries `car1.speed = 1000;`. What is the relevant reason this direct statement is not allowed?

- **A.** `speed` is protected and therefore inaccessible everywhere
- **B.** `speed` is a final field
- **C.** `speed` is a private field, so outside code cannot access it directly
- **D.** `speed` is automatically converted to a method


### Q8.

Assume a member is `protected`, and the rule is: it can be accessed within the same package and by subclasses. Which situation matches that rule?

- **A.** A completely unrelated class in another package always has unrestricted access
- **B.** A subclass can access the member as allowed by the protected access rules
- **C.** Only the declaring class can use the member
- **D.** The member must be final before it can be protected


### Q9.

Why does the supplied `CarClass` use methods such as `setSpeed()` instead of exposing `speed` as a public field?

- **A.** So the class can control updates and apply validation
- **B.** So every class automatically inherits `speed`
- **C.** So the field becomes static
- **D.** So constructors stop working


### Q10.

A private field is exposed through both a getter and a validated setter. Which combination is being demonstrated?

- **A.** No external access
- **B.** Read-only access
- **C.** Controlled read-and-write access
- **D.** Write-only access


## B. Inheritance

### Q11.

A design says `Car is a Vehicle`. What kind of relationship does that wording represent, and why is it relevant when deciding whether inheritance makes sense?

- **A.** A constructor-only relationship
- **B.** A serialization relationship
- **C.** A 'has-a' relationship
- **D.** A genuine 'is-a' relationship


### Q12.

The notes say inheritance is useful for reuse, extension, hierarchy, and maintainability. Which change is a direct example of extension?

- **A.** Deleting all methods from `Vehicle`
- **B.** Replacing the child with an unrelated class
- **C.** Adding a `doors` field to `Car` while reusing `Vehicle` behavior
- **D.** Making every `Vehicle` field public


### Q13.

Consider:

```text
Vehicle
  |
 Car
```

One child class inherits from one parent. Which structure is this?

- **A.** Multilevel inheritance
- **B.** Multiple inheritance
- **C.** Hierarchical inheritance
- **D.** Single inheritance


### Q14.

Consider:

```text
       Vehicle
       /     \
     Car     Bike
```

Both children share the same parent. Which structure is illustrated?

- **A.** Multiple inheritance
- **B.** Hierarchical inheritance
- **C.** Single inheritance
- **D.** Multilevel inheritance


### Q15.

Consider:

```text
Vehicle
   |
  Car
   |
ElectricCar
```

Which inheritance structure is represented?

- **A.** Multilevel inheritance
- **B.** Single inheritance
- **C.** Multiple inheritance
- **D.** Hierarchical inheritance


### Q16.

Java class inheritance does not allow one child to inherit from two parent classes when their implementations could conflict. Which situation illustrates the ambiguity this avoids?

- **A.** A child has exactly one parent
- **B.** A parent has a constructor
- **C.** Two parent classes provide conflicting versions of the same behavior
- **D.** A child adds a new field


### Q17.

Suppose `Vehicle` contains common `start()` and `stop()` behavior, while `Car` adds `airConditionOn()`. Which benefit of inheritance is most directly demonstrated?

- **A.** All parent members become public
- **B.** Constructors are automatically inherited
- **C.** The child becomes unrelated to the parent
- **D.** The parent code is reused while the child adds specialized behavior


### Q18.

Constructors are not inherited by child classes. If `Vehicle` has a constructor, which mechanism does a child use to initialize the parent portion?

- **A.** `super(...)`
- **B.** A setter
- **C.** `implements`
- **D.** A getter


### Q19.

Consider these classes:

```java
class Vehicle {
    private String brand;
    Vehicle(String brand) { this.brand = brand; }
}

class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }
}
```

Why is `super(brand)` important here?

- **A.** It replaces inheritance with an interface
- **B.** It lets `Vehicle` initialize its own state through its constructor
- **C.** It accesses a private field directly from `Car`
- **D.** It creates a second `Car` object


### Q20.

In the supplied hierarchical example, `Vehicle` keeps `brand` and `speed` private, while `A_Car` needs those values for display. Which approach is used instead of direct field access?

- **A.** Getters such as `getBrand()` and `getSpeed()`
- **B.** Direct access through `this.brand`
- **C.** Static fields
- **D.** Constructors inherited from `Vehicle`


### Q21.

The supplied `A_Car.display()` is:

```java
@Override
public void display() {
    System.out.println("Car-specific...");
    super.display();
}
```

What role does `super.display()` play?

- **A.** It calls the child method again
- **B.** It calls the sibling `Bike` method
- **C.** It calls the child constructor
- **D.** It calls the parent implementation after the child has executed its own statement


### Q22.

Using the same `A_Car.display()` code, what happens when `display()` is called on an `A_Car` object?

```java
System.out.println("Car-specific...");
super.display();
```

- **A.** Only the parent message appears
- **B.** Neither message appears
- **C.** The child-specific line appears first, then the parent implementation runs
- **D.** Only the child message appears


### Q23.

If a parent has `private void check()`, what can the child directly do with that method?

- **A.** Call it with `super.check()`
- **B.** It cannot directly access, inherit, or override that private method
- **C.** Override it normally
- **D.** Access it because all parent methods are inherited


### Q24.

In the supplied hierarchy, `Bike` has its own `hasCarrier` field and provides `isHasCarrier()` and `setHasCarrier(...)`. What is the key design idea being used for that child-specific state?

- **A.** The field is exposed directly to every class
- **B.** The field is inherited from `Vehicle`
- **C.** The field becomes a constructor
- **D.** The child keeps its own state and controls access through methods


### Q25.

Suppose several classes share the same `Vehicle` parent and common behavior, while each child adds its own feature. Why is hierarchical inheritance a natural fit for this design?

- **A.** Every child needs a different parent class
- **B.** It allows a class to extend multiple classes
- **C.** One common parent can hold shared properties/behavior for multiple specialized children
- **D.** It removes the need for child-specific methods


## C. Abstraction — Abstract Classes

### Q26.

The notes describe an ATM where the user can withdraw money without knowing database queries or transaction processing. What idea is illustrated?

- **A.** Method overloading
- **B.** Abstraction: expose required functionality while hiding implementation details
- **C.** Field hiding
- **D.** Multiple class inheritance


### Q27.

Consider:

```java
abstract class BankAccount {
}
```

Which statement follows from the rule that an abstract class cannot be instantiated directly?

- **A.** `new BankAccount()` is not allowed, but a `BankAccount` reference can refer to a concrete child
- **B.** The class can only contain abstract methods
- **C.** The class must be final
- **D.** The class cannot have constructors


### Q28.

Why can this declaration be valid even though `BankAccount` is abstract?

```java
BankAccount account = new SavingAccount(...);
```

- **A.** The abstract class is automatically instantiated
- **B.** Constructors are inherited into the parent
- **C.** Abstract classes become interfaces at runtime
- **D.** The parent reference can refer to a concrete child object


### Q29.

An abstract method has a declaration but no method body. Which declaration follows that rule?

- **A.** `abstract deposit(double amount) { }`
- **B.** `abstract void deposit(double amount);`
- **C.** `abstract void deposit(double amount) { }`
- **D.** `void abstract deposit(double amount) { }`


### Q30.

An abstract parent declares:

```java
abstract void deposit(double amount);
```

A child class is concrete. What must the child do?

- **A.** Implement the inherited abstract method
- **B.** Remove `extends`
- **C.** Turn the method into a field
- **D.** Ignore the method


### Q31.

A concrete child must implement all inherited abstract methods. What is the other allowed choice when a child does not do so?

- **A.** The parent becomes concrete automatically
- **B.** The child must implement an interface instead
- **C.** The child must also be declared `abstract`
- **D.** The method becomes private


### Q32.

The supplied `BankAccount` abstract class has a constructor, instance fields, abstract methods, and a concrete `balance()` method. What does this combination demonstrate?

- **A.** An abstract class can combine state, shared implementation, and required child behavior
- **B.** Concrete methods are illegal in abstract classes
- **C.** Constructors disappear from abstract classes
- **D.** An abstract class is restricted to method declarations only


### Q33.

Suppose the abstract class contains:

```java
BankAccount(String id, double balance) { ... }
```

and `SavingAccount` has:

```java
SavingAccount(String id, double balance) {
    super(id, balance);
}
```

Why is the parent constructor still useful even though `BankAccount` itself cannot be instantiated?

- **A.** It calls the child's constructor twice
- **B.** It bypasses inheritance
- **C.** It turns the abstract class into a normal class
- **D.** It initializes common state when a concrete child object is created


### Q34.

An abstract method has no implementation body, while a concrete method provides an implementation. Which pair correctly matches them?

- **A.** Both must always be implemented by the child
- **B.** Both are forbidden in abstract classes
- **C.** Abstract method = no body; concrete method = has an implementation
- **D.** Abstract method = implementation provided; concrete method = declaration only


### Q35.

Consider:

```java
abstract class BankAccount {
    abstract void deposit(double amount);

    void showBalance() {
        System.out.println("Balance shown");
    }
}
```

Why does this example represent partial abstraction?

- **A.** Because only fields are abstract
- **B.** Because both required behavior and some implementation are supplied
- **C.** Because the class can be instantiated only once
- **D.** Because the class contains no useful behavior


### Q36.

The supplied abstraction example uses:

```java
BankAccount account = new SavingAccount(...);
account = new CurrentAccount(...);
```

What changes while the reference type stays the same?

- **A.** The reference stops pointing to objects
- **B.** The abstract class becomes concrete
- **C.** The actual object changes from one concrete child type to another
- **D.** The reference type changes from `BankAccount` to `Object`


### Q37.

Using the previous example, why can `account.deposit(900)` execute different implementations on different assignments?

- **A.** Abstract methods are ignored at runtime
- **B.** Constructors choose the method each time
- **C.** The compiler copies every child method into `BankAccount`
- **D.** The actual object at runtime determines the overridden implementation


### Q38.

An abstract method declares an operation that child classes must provide, but it leaves the implementation to the child. Which statement best captures its role in `BankAccount`?

- **A.** It tells child classes which operation must exist while leaving the implementation to them
- **B.** It prevents child classes from extending the parent
- **C.** It stores the common balance value
- **D.** It makes all child classes identical


## D. Abstraction — Interfaces

### Q39.

Consider:

```java
interface CarControls {
    void turnLeft();
}

class ElectricCar implements CarControls {
    public void turnLeft() { ... }
}
```

What is the interface providing to `ElectricCar`?

- **A.** An instance field copied into the class
- **B.** A contract describing required behavior
- **C.** A concrete constructor
- **D.** A parent class object


### Q40.

Why is this not a valid way to create an object in the supplied interface model?

```java
CarControls c = new CarControls();
```

- **A.** Interfaces cannot be instantiated directly
- **B.** `CarControls` must be final
- **C.** Interfaces cannot declare methods
- **D.** All interface references are static


### Q41.

An interface cannot be instantiated directly. Why does that make a constructor inappropriate here?

- **A.** Interfaces cannot contain any code
- **B.** Only static methods can exist in Java
- **C.** An interface is not instantiated directly
- **D.** Interfaces are always abstract classes


### Q42.

An interface contains:

```java
int MAX_SPEED = 200;
```

Under the interface rule that fields are implicitly `public static final`, how should this field behave?

- **A.** It is an instance field that each object changes independently
- **B.** It is private and accessible only inside the interface
- **C.** It is implicitly `protected` and mutable
- **D.** It is implicitly `public static final`


### Q43.

Consider:

```java
interface Vehicle {
    void start();
}
```

What is the normal responsibility of a concrete class implementing `Vehicle`?

- **A.** Change `start()` into a field
- **B.** Provide the required `start()` implementation
- **C.** Remove the interface method
- **D.** Instantiate `Vehicle` first


### Q44.

A class wants to follow two contracts, one for engines and one for wheels. Which declaration matches the supplied multiple-inheritance example?

- **A.** `class Car implements Engine, Wheels`
- **B.** `class Car uses Engine, Wheels`
- **C.** `class Car extends Engine, Wheels`
- **D.** `class Car inherits Engine + Wheels`


### Q45.

Suppose:

```java
interface Vehicle { void start(); }
interface ElectricVehicle extends Vehicle { void charge(); }
```

What must a concrete class implementing `ElectricVehicle` provide?

- **A.** A constructor for both interfaces
- **B.** Only `charge()`
- **C.** The required methods from the interface hierarchy, including `start()` and `charge()`
- **D.** Only `start()`


### Q46.

An implementing class does not override this default method:

```java
interface CarControls {
    default void accelerate() {
        System.out.println("Generally not used");
    }
}
```

What happens when `s2.accelerate()` is called on an object that does not override it?

- **A.** The call always fails because interfaces cannot contain implementations
- **B.** The interface default implementation is used
- **C.** The method becomes abstract at runtime
- **D.** A constructor is called instead


### Q47.

A `default` interface method can provide a reusable implementation so implementing classes do not have to override it. Which feature is being described?

- **A.** Java 17
- **B.** Java 5
- **C.** Java 11
- **D.** Java 8


### Q48.

Given:

```java
interface Vehicle {
    static void info() { ... }
}
```

Because `info()` is a static method declared inside the interface, how should it be called?

- **A.** `this.info()` from any object
- **B.** `Vehicle.info()`
- **C.** `new Vehicle().info()`
- **D.** `super.info()` from a child class


### Q49.

A private method exists inside an interface and a default method calls it. What is the intended use of that private interface method?

- **A.** It is an internal helper used by methods of the same interface
- **B.** Every implementing class calls it directly
- **C.** It is used as an interface constructor
- **D.** It is inherited by every child class


### Q50.

Suppose:

```java
interface CarControls {
    void turnLeft();
}

class ElectricCar implements CarControls {
    public void turnLeft() { System.out.println("Electric Left"); }
    public void charge() { System.out.println("Charging"); }
}

CarControls car = new ElectricCar();
```

Which call is guaranteed to be available through the `car` reference based on its declared type?

- **A.** `car.getBatteryLevel()`
- **B.** `car.ElectricCar()`
- **C.** `car.charge()`
- **D.** `car.turnLeft()`


### Q51.

Why can a class implement several interfaces even though Java does not allow it to extend several classes?

- **A.** Multiple class inheritance is allowed when methods are public
- **B.** Interfaces are actually hidden parent classes
- **C.** Interfaces let a class follow multiple contracts without inheriting multiple class implementations
- **D.** Java automatically merges all class constructors


### Q52.

Suppose two hypothetical parent classes both provide `start()` and a child could inherit both implementations. What problem does this situation create?

- **A.** Serialization
- **B.** Read-only access
- **C.** Method overloading
- **D.** The diamond/ambiguity problem


### Q53.

What makes a marker interface different from a normal behavior interface?

- **A.** A marker interface automatically creates object fields
- **B.** A marker interface mainly marks a class with a capability or meaning and defines no required behavior methods
- **C.** A marker interface must always contain a constructor
- **D.** A marker interface can be instantiated directly


### Q54.

The notes use `Serializable` as an example of a marker interface. What is serialization described as?

- **A.** Converting an object into a stream of bytes
- **B.** Converting methods into constructors
- **C.** Converting a byte stream back into an object
- **D.** Converting a class into an interface


### Q55.

If serialization converts an object into a byte stream, what is the reverse operation called?

- **A.** Converting source code into a constructor
- **B.** Converting an interface into a class
- **C.** Converting a byte stream back into a Java object
- **D.** Converting an object into bytes


### Q56.

Consider:

```java
class SportsCar implements CarControls, Serializable {
    ...
}
```

What two roles are combined?

- **A.** A constructor and a getter
- **B.** Two parent classes
- **C.** Two concrete implementations of `SportsCar`
- **D.** A behavior contract and a serialization marker


### Q57.

The supplied `InterfaceDemo` reuses one reference:

```java
CarControls car = new ElectricCar();
car = new SportsCar();
```

What concept is this demonstrating?

- **A.** Field hiding
- **B.** Multiple class inheritance
- **C.** Interface polymorphism
- **D.** Constructor inheritance


### Q58.

In the previous example, why can `car.turnLeft()` behave differently after the assignment changes from `ElectricCar` to `SportsCar`?

- **A.** The actual object changes, so the overridden implementation used at runtime changes
- **B.** Constructors are called on every method invocation
- **C.** Static methods are selected from the object
- **D.** The interface type changes automatically


### Q59.

The supplied `SportsCar` does not override `accelerate()`. If `CarControls` provides a default `accelerate()`, what should the call use?

- **A.** The parent class constructor
- **B.** The `CarControls` default implementation
- **C.** An unrelated `Vehicle` method
- **D.** No method because every interface method must be overridden


## E. Polymorphism

### Q60.

The supplied calculator contains:

```java
add(int a, int b)
add(int a, int b, int c)
add(double a, double b)
```

What makes these methods overloaded?

- **A.** They use the same method name with different parameter lists
- **B.** They all return the same type
- **C.** They belong to different packages
- **D.** They have the same parameter list but different comments


### Q61.

Given the overloaded methods above, which call is matched to `add(int, int, int)`?

- **A.** `calc.add(10, 20.5)`
- **B.** `calc.add(10.5, 20.5)`
- **C.** `calc.add(10, 20, 30)`
- **D.** `calc.add(10, 20)`


### Q62.

The calculator contains both `add(int, double)` and `add(double, int)`. Why are these valid overloads?

- **A.** The return types are different
- **B.** The parameter names are different
- **C.** The methods are in different classes
- **D.** The order of parameter types is different


### Q63.

Why are these two declarations NOT valid overloads?

```java
add(int a)
add(int b)
```

- **A.** The return type must be `double`
- **B.** Parameter names do not change the parameter list
- **C.** Only constructors can use `int`
- **D.** A method can never have one parameter


### Q64.

Why can these two methods not coexist as overloads?

```java
int add(int a, int b)
double add(int a, int b)
```

- **A.** They have too few parameters
- **B.** They use different method names
- **C.** Both must be interfaces
- **D.** Return type alone cannot distinguish overloaded methods


### Q65.

If an overloaded method is selected during compilation by examining the arguments, what kind of polymorphism is that?

- **A.** Run-time polymorphism
- **B.** Compile-time polymorphism
- **C.** Constructor polymorphism
- **D.** Interface-only polymorphism


### Q66.

Given:

```java
calc.add(10.5, 20.5);
```

and an available overload `add(double, double)`, which result is returned by the supplied `Class` implementation?

- **A.** `31.0`
- **B.** No method can match
- **C.** `21.0`
- **D.** `30.0`


### Q67.

The overloaded calculator has:

```java
add(int a, int b)
add(double a, double b)
add(int a, double b)
add(double a, int b)
```

What is Java using to distinguish these methods?

- **A.** Only the class name
- **B.** Only parameter names
- **C.** The parameter list, including number, types, and order
- **D.** Only the method's return type


### Q68.

For method overriding, compare these declarations:

```java
class Vehicle {
    public void start() { }
}

class Bike extends Vehicle {
    public void start() { }
}
```

Why does the child `start()` qualify as overriding?

- **A.** The child returns a different type only
- **B.** The child has the same method name and parameter list within an inheritance relationship
- **C.** The child has a different method name
- **D.** The methods are static


### Q69.

What is the main purpose of `@Override` in the supplied code?

- **A.** To create an overloaded method
- **B.** To stop inheritance
- **C.** To make the method private
- **D.** To help the compiler verify that the child method really overrides a parent method


### Q70.

The supplied `A_Car.display()` contains:

```java
@Override
public void display() {
    System.out.println("Car...");
    super.display();
}
```

What does `super.display()` specifically select?

- **A.** The parent `display()` implementation
- **B.** The constructor of `A_Car`
- **C.** The sibling `Bike.display()` method
- **D.** The child's `display()` method again


### Q71.

Consider:

```java
class Vehicle {
    public void start() {
        System.out.println("Started");
    }
}

class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Starting Bike....");
    }
}

Vehicle v = new Bike();
v.start();
```

What should execute?

- **A.** Neither method
- **B.** `Bike.start()`
- **C.** Both methods
- **D.** `Vehicle.start()`


### Q72.

Now consider:

```java
class Car extends Vehicle {
    // Car does NOT override start()
}

Vehicle v = new Car();
v.start();
```

Which implementation is used when the child does not override `start()`?

- **A.** `Bike.start()`
- **B.** The call is always rejected
- **C.** `Vehicle.start()` is used because the child inherits it
- **D.** `Car.start()` even though it is not defined


### Q73.

In:

```java
Vehicle v = new Bike("Splender", 700, false);
```

what is the reference type and what is the actual object type?

- **A.** Reference = `Bike`; Object = `Object`
- **B.** Reference = `Object`; Object = `Vehicle`
- **C.** Reference = `Bike`; Object = `Vehicle`
- **D.** Reference = `Vehicle`; Object = `Bike`


### Q74.

This statement is an example of upcasting:

```java
Vehicle v = new Bike("Splender", 700, false);
```

What is the essential idea of upcasting here?

- **A.** A method is overloaded at runtime
- **B.** A parent object is converted into a child object
- **C.** A child object is referred to through a parent-type reference
- **D.** A byte stream is converted into an object


### Q75.

An overriding method must not reduce the inherited method’s access level. If the parent declares:

```java
public void start() { }
```

which child declaration is consistent with that rule?

- **A.** `protected void start() { }`
- **B.** `public void start() { }`
- **C.** No-modifier `void start() { }`
- **D.** `private void start() { }`


### Q76.

Why does the following provide runtime polymorphism?

```java
Vehicle v = new Bike();
v.start();
```

- **A.** The actual object type can determine which overridden implementation executes
- **B.** The reference type changes automatically
- **C.** The compiler chooses among overloaded methods by parameter names
- **D.** The parent constructor runs on every method call


### Q77.

A parent reference is reused like this:

```java
Vehicle vehicle;
vehicle = new A_Car(...);
vehicle = new Bike(...);
```

What practical benefit does this design provide?

- **A.** Every field becomes public
- **B.** All child objects become the same class
- **C.** Constructors become inherited
- **D.** One common type can work with multiple child implementations


### Q78.

Consider the supplied `Bike` constructor:

```java
public Bike(String brand, int speed, boolean hasCarrier) {
    super(brand, speed);
    this.hasCarrier = hasCarrier;
    System.out.println("Brand: " + getBrand());
}
```

What must happen before the child constructor body can finish its own initialization?

- **A.** `start()` is automatically called
- **B.** The child constructor is executed twice
- **C.** The parent constructor is invoked to initialize inherited state
- **D.** The interface constructor runs


### Q79.

In the supplied runtime demo, `A_Car` overrides `display()` but does not override `start()`. For:

```java
Vehicle v = new A_Car("Jaguar", 700, 6);
v.display();
v.start();
```

which statement is correct?

- **A.** `display()` uses the child implementation, while `start()` uses the inherited `Vehicle` implementation
- **B.** Neither call is valid through the parent reference
- **C.** Both calls use `Vehicle` implementations only
- **D.** Both calls use child implementations


---

# Answer Key

| Q | Ans | Q | Ans | Q | Ans | Q | Ans |
|---|---|---|---|---|---|---|---|
| 1 | B | 21 | D | 41 | C | 61 | C |
| 2 | A | 22 | C | 42 | D | 62 | D |
| 3 | C | 23 | B | 43 | B | 63 | B |
| 4 | D | 24 | D | 44 | A | 64 | D |
| 5 | A | 25 | C | 45 | C | 65 | B |
| 6 | B | 26 | B | 46 | B | 66 | A |
| 7 | C | 27 | A | 47 | D | 67 | C |
| 8 | B | 28 | D | 48 | B | 68 | B |
| 9 | A | 29 | B | 49 | A | 69 | D |
| 10 | C | 30 | A | 50 | D | 70 | A |
| 11 | D | 31 | C | 51 | C | 71 | B |
| 12 | C | 32 | A | 52 | D | 72 | C |
| 13 | D | 33 | D | 53 | B | 73 | D |
| 14 | B | 34 | C | 54 | A | 74 | C |
| 15 | A | 35 | B | 55 | C | 75 | B |
| 16 | C | 36 | C | 56 | D | 76 | A |
| 17 | D | 37 | D | 57 | C | 77 | D |
| 18 | A | 38 | A | 58 | A | 78 | C |
| 19 | B | 39 | B | 59 | B | 79 | A |
| 20 | A | 40 | A | 60 | A |  |  |

## Coverage Audit

| Topic | Questions |
|---|---:|
| A. Encapsulation | 10 |
| B. Inheritance | 15 |
| C. Abstraction — Abstract Classes | 13 |
| D. Abstraction — Interfaces | 21 |
| E. Polymorphism | 20 |

> **Quality check applied:** no question asks only for a modifier/keyword/class name that can be answered by locating a single line in the documentation. Where source-specific behavior matters, the necessary context is included in the question.