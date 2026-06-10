# GETTERS AND SETTERS IN JAVA

## Study : Getter Methods and Setter Methods

---

# Why Getters and Setters?

In Object Oriented Programming, especially in Encapsulation, instance variables are usually declared as `private`.

Example:

```java
private String brand;
```

Since the variable is private, it cannot be accessed directly from outside the class.

Example:

```java
Car car = new Car();

car.brand = "BMW";
```

❌ Compilation Error

Because:

```text
brand has private access
```

To solve this problem, Java provides:

```text
Getter Methods
Setter Methods
```

---

# What is a Getter Method?

A Getter Method is used to read or retrieve the value of a private variable.

---

## Syntax

```java
public DataType getVariableName() {
    return variableName;
}
```

---

## Example

```java
private String brand;

public String getBrand() {
    return brand;
}
```

Usage:

```java
System.out.println(car.getBrand());
```

---

## Flow

```text
Private Variable
       │
       ▼
Getter Method
       │
       ▼
Value Returned
```

---

# What is a Setter Method?

A Setter Method is used to assign or update the value of a private variable.

---

## Syntax

```java
public void setVariableName(DataType value) {
    this.variableName = value;
}
```

---

## Example

```java
private String brand;

public void setBrand(String brand) {
    this.brand = brand;
}
```

Usage:

```java
car.setBrand("BMW");
```

---

## Flow

```text
New Value
    │
    ▼
Setter Method
    │
    ▼
Private Variable Updated
```

---

# Access Modifiers and Getters/Setters

Access Modifiers control how variables and methods are accessed.

| Modifier  | Access Level                                |
| --------- | ------------------------------------------- |
| public    | Accessible Everywhere                       |
| private   | Accessible Only Inside Same Class           |
| protected | Accessible Inside Package and Child Classes |

---

## Why Private Variables?

Example:

```java
private int speed;
```

Benefits:

* Data Hiding
* Security
* Validation
* Controlled Access

Without private variables:

```java
car.speed = -500;
```

Invalid data can enter the system.

---

# Main Idea of Getters and Setters

## Read Only

```java
private String brand;

public String getBrand() {
    return brand;
}
```

No Setter

Result:

```text
Read Only
```

User can read the value but cannot modify it.

---

## Write Only

```java
private String colour;

public void setColour(String colour) {
    this.colour = colour;
}
```

No Getter

Result:

```text
Write Only
```

User can modify the value but cannot read it.

---

## Read and Write

```java
private int speed;

public int getSpeed() {
    return speed;
}

public void setSpeed(int speed) {
    this.speed = speed;
}
```

Result:

```text
Read + Write
```

---

# Example 1 : Speed Property

Your Code:

```java
int speed;
```

Constructor:

```java
public CarClassConstructor(int speed) {
    this.speed = speed;
}
```

---

## Getter

```java
public int getSpeed() {
    return speed;
}
```

Purpose:

```text
Returns current speed
```

---

## Setter

```java
public void setSpeed(int speed) {
    this.speed = speed;
}
```

Purpose:

```text
Updates speed
```

---

## Usage

```java
CarClassConstructor car1 =
        new CarClassConstructor(500);
```

Initial State:

```text
speed = 500
```

---

Getting Value:

```java
System.out.println(
        car1.getSpeed()
);
```

Output:

```text
500
```

---

Updating Value:

```java
car1.setSpeed(1000);
```

New State:

```text
speed = 1000
```

---

Reading Again:

```java
System.out.println(
        car1.getSpeed()
);
```

Output:

```text
1000
```

---

# Example 2 : Private Brand Property

Your Code:

```java
private String brand;
```

Constructor:

```java
public CarClassConstructor(
        String brand,
        String colour) {

    this.brand = brand;
    this.colour = colour;
}
```

---

## Getter Only

```java
public String getBrand() {
    return brand;
}
```

Notice:

```java
setBrand()
```

does NOT exist.

---

Result:

```text
Brand = Read Only
```

---

Usage:

```java
System.out.println(
        car2.getBrand()
);
```

Output:

```text
Audi
```

---

Trying to Modify

```java
car2.setBrand("BMW");
```

❌ Error

Because:

```text
Setter not implemented
```

---

# Example 3 : Private Colour Property

Your Code:

```java
private String colour;
```

---

Setter:

```java
public void setColour(
        String colour) {

    this.colour = colour;
}
```

---

Notice:

```java
getColour()
```

does NOT exist.

---

Result:

```text
Write Only
```

---

Usage:

```java
car2.setColour("Black");
```

✔ Allowed

---

Trying to Read

```java
System.out.println(
        car2.getColour()
);
```

❌ Error

Because:

```text
Getter not implemented
```

---

# Important Observation

For Colour:

```text
Can Update
Cannot Read
```

---

For Brand:

```text
Can Read
Cannot Update
```

---

# Example 4 : Validation Using Setter

One major advantage of Setters is:

```text
Validation
```

Before updating data we can verify whether the value is valid.

---

Your Code:

```java
private double power;
```

---

Constructor:

```java
public CarClassConstructor(
        double power) {

    this.power = power;
}
```

---

# Getter Validation

Your Code:

```java
public double getPower() {

    if(power <= 0) {

        System.out.println(
                "Power is not initialized properly"
        );

        return 0;
    }

    return power;
}
```

---

Flow

```text
Getter Called
      │
      ▼
Power <= 0 ?
      │
 ┌────┴────┐
 │         │
YES        NO
 │          │
 ▼          ▼
Print      Return
Message    Power
```

---

# Setter Validation

Your Code:

```java
public void setPower(
        double power) {

    if(power <= 0) {

        System.out.println(
                "Power must be greater than 0"
        );

        return;
    }

    this.power = power;
}
```

---

Flow

```text
Setter Called
      │
      ▼
Power <= 0 ?
      │
 ┌────┴────┐
 │         │
YES        NO
 │          │
 ▼          ▼
Reject     Update
Value      Value
```

---

# Valid Update Example

```java
car3.setPower(1000);
```

Execution:

```text
1000 > 0
```

Therefore:

```text
Power Updated
```

---

Output:

```text
Updated Power : 1000.0
```

---

# Invalid Update Example

```java
car3.setPower(-100);
```

Execution:

```text
-100 <= 0
```

Therefore:

```text
Power must be greater than 0
```

Power remains unchanged.

---

# State After Invalid Update

Before:

```text
power = 1000
```

Attempt:

```java
car3.setPower(-100);
```

Rejected.

After:

```text
power = 1000
```

Still unchanged.

---

# Why Validation is Important?

Without validation:

```java
car3.setPower(-5000);
```

The object may enter an invalid state.

---

With validation:

```java
if(power <= 0)
```

Invalid values are blocked.

---

# Getter and Setter Shortcut in IntelliJ

```text
Right Click
      │
      ▼
Generate
      │
      ▼
Getter and Setter
      │
      ▼
Select Variables
      │
      ▼
Done
```

---

# Execution Flow of Your Program

```text
Create car1
      │
      ▼
Read Speed
      │
      ▼
Update Speed
      │
      ▼
Read Updated Speed
      │
      ▼
Create car2
      │
      ▼
Read Brand
      │
      ▼
Update Colour
      │
      ▼
Create car3
      │
      ▼
Read Power
      │
      ▼
Update Power
      │
      ▼
Attempt Invalid Update
      │
      ▼
Validation Rejects Value
```

---

# Getters vs Setters

| Feature             | Getter     | Setter         |
| ------------------- | ---------- | -------------- |
| Purpose             | Read Value | Update Value   |
| Returns Value       | ✔ Yes      | ❌ No (Usually) |
| Uses return         | ✔ Yes      | ❌ No           |
| Modifies Data       | ❌ No       | ✔ Yes          |
| Validation Possible | ✔ Yes      | ✔ Yes          |

---

# Key Notes

```text
Getter
   │
   ▼
Read Data
```

---

```text
Setter
   │
   ▼
Modify Data
```

---

```text
Private + Getter Only
        │
        ▼
Read Only
```

---

```text
Private + Setter Only
        │
        ▼
Write Only
```

---

```text
Private + Getter + Setter
        │
        ▼
Read + Write
```

---

```text
Validation
        │
        ▼
Usually Added
Inside Setters
```

---

# Quick Revision

```text
Getter
=
Retrieve Value
```

```text
Setter
=
Update Value
```

```text
Private Variable
=
Data Hiding
```

```text
Getter + Setter
=
Controlled Access
```

```text
Validation
=
Prevent Invalid Data
```

---

# Interview Questions

## Basic

1. What is a Getter Method?
2. What is a Setter Method?
3. Why are private variables used?
4. What is Data Hiding?
5. Why do we use Getters and Setters?

## Intermediate

6. Explain Read Only properties.
7. Explain Write Only properties.
8. What are the benefits of controlled access?
9. Why is validation usually placed inside setters?
10. Can validation be implemented inside getters?

## Advanced

11. What is the relationship between Encapsulation and Getters/Setters?
12. Why should instance variables generally be private?
13. How do Getters and Setters improve maintainability?
14. What happens if a setter is not implemented?
15. Explain data validation using your power example.

---

# One-Line Definition

> Getter Methods are used to read private data, Setter Methods are used to modify private data, and together they provide controlled access to encapsulated variables.
