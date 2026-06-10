# MARKER INTERFACE IN JAVA

## Study : Marker Interface

---

## 🔹 What is a Marker Interface?

A Marker Interface is a special type of Interface that contains:

* No Methods
* No Variables

It is used only to provide special information (metadata) to the JVM, Java APIs, or Frameworks.

Unlike normal interfaces, a Marker Interface does not define behavior.

Instead, it simply marks a class with a special capability.

---

## 🔹 Simple Definition

**Marker Interface = An Empty Interface used to mark a class with a special capability or metadata.**

---

## 🔹 Why is it Called a Marker Interface?

Because it "marks" a class for a special purpose.

Example:

```java
public class SportsCar implements Serializable {
}
```

When Java sees:

```java
implements Serializable
```

it understands:

```text
This object can participate in Serialization.
```

The interface itself does not perform any action.

It only acts as a marker.

---

# 🔹 What is Serialization?

Serialization is the process of converting an object into a stream of bytes.

These bytes can then be:

* Stored in a File
* Sent over a Network
* Saved in a Database
* Transferred between Systems

---

## 🔹 Serialization Flow

```text
Java Object
     │
     ▼
Serialization
     │
     ▼
Byte Stream
     │
     ▼
File / Network / Database
```

---

## 🔹 Deserialization

Deserialization is the reverse process.

```text
Byte Stream
     │
     ▼
Deserialization
     │
     ▼
Java Object
```

---

# 🔹 Serializable Interface

Java provides a built-in Marker Interface:

```java
import java.io.Serializable;
```

Definition:

```java
public interface Serializable {
}
```

Notice:

```text
No Methods
No Variables
```

It is completely empty.

---

## 🔹 Example

```java
import java.io.Serializable;

public class SportsCar implements Serializable {

}
```

Java checks:

```text
Does SportsCar implement Serializable?
```

If:

```text
YES
```

Serialization is allowed.

If:

```text
NO
```

Serialization is not allowed.

---

## 🔹 Why Doesn't Serializable Have Methods?

Java only needs a flag.

It simply checks:

```text
Does this class implement Serializable?
```

No behavior is required.

Therefore:

```java
public interface Serializable {
}
```

is sufficient.

---

# 🔹 Real Life Example

Think of an Airport Security Pass.

```text
Person
   │
   ▼
Security Pass
```

The pass does not perform any action.

It only tells security:

```text
This person is authorized.
```

Similarly:

```java
implements Serializable
```

tells Java:

```text
This object can be serialized.
```

---

# 🔹 Marker Interface vs Normal Interface

## Normal Interface

Used to define behavior.

Example:

```java
interface CarControls {

    void turnLeft();

    void turnRight();

    void accelerate();

    void applyBrakes();
}
```

A class implementing this interface must provide implementations for all methods.

---

## Marker Interface

Example:

```java
interface Serializable {
}
```

No methods need to be implemented.

It only provides metadata.

---

## 🔹 Comparison Table

| Feature                 | Normal Interface | Marker Interface |
| ----------------------- | ---------------- | ---------------- |
| Methods                 | ✔ Present        | ✘ Not Present    |
| Variables               | May Exist        | Usually None     |
| Implementation Required | ✔ Yes            | ✘ No             |
| Defines Behavior        | ✔ Yes            | ✘ No             |
| Provides Metadata       | Sometimes        | ✔ Yes            |
| Purpose                 | Contract         | Marker           |
| Example                 | CarControls      | Serializable     |

---

# 🔹 Example from Our Project

```java
import java.io.Serializable;

public class SportsCar
        implements CarControls, Serializable {

}
```

### CarControls

Normal Interface

Requires implementation of:

* turnLeft()
* turnRight()
* accelerate()
* applyBrakes()

---

### Serializable

Marker Interface

Requires:

```text
Nothing
```

It only marks the class as serializable.

---

# 🔹 Multiple Inheritance and Interfaces

## What is Multiple Inheritance?

Multiple Inheritance means inheriting features from more than one parent.

Example:

```text
ParentA
    ▲
    │
 Child
    │
    ▼
ParentB
```

---

## Does Java Support Multiple Inheritance?

### Using Classes → ❌ No

Not Allowed:

```java
class SportsCar extends Vehicle, Machine {

}
```

Reason:

Java avoids the **Diamond Problem**.

Suppose:

```text
Vehicle
   ▲
   │
SportsCar
   │
   ▼
Machine
```

If both Vehicle and Machine contain the same method:

```java
start()
```

Java would not know which method to execute.

This creates ambiguity.

Therefore Java does not support Multiple Inheritance using Classes.

---

### Using Interfaces → ✔ Yes

Java supports Multiple Inheritance through Interfaces.

Example:

```java
interface CarControls {
    void accelerate();
}

interface MusicSystem {
    void playMusic();
}

public class SportsCar
        implements CarControls, MusicSystem {

    @Override
    public void accelerate() {
        System.out.println("Accelerating...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music...");
    }
}
```

---

## Diagram

```text
CarControls        MusicSystem
      ▲                 ▲
      │                 │
      └──────┬──────────┘
             │
        SportsCar
```

SportsCar receives contracts from both interfaces.

---

## Why is This Allowed?

Interfaces mainly define behavior (contracts).

They do not create object state like classes.

Therefore Java safely allows:

```java
implements Interface1,
           Interface2,
           Interface3
```

---

## Real Life Example

```text
Robot
│
├── Can Walk
├── Can Talk
└── Can Lift Objects
```

In Java:

```java
class Robot
implements Walkable,
           Talkable,
           Liftable
{
}
```

One class can implement many capabilities.

---

# 🔹 Marker Interface + Multiple Inheritance

Consider:

```java
public class SportsCar
        implements CarControls,
                   Serializable {

}
```

Here:

### CarControls

Provides behavior.

```text
turnLeft()
turnRight()
accelerate()
applyBrakes()
```

---

### Serializable

Provides metadata.

```text
This object can be serialized.
```

---

### Diagram

```text
          CarControls
                ▲
                │
                │
SportsCar ──────┼────── Serializable
                │
                ▼
          SportsCar Object
```

SportsCar gets:

* Behavior Contract from CarControls
* Serialization Capability from Serializable

This is a practical example of Multiple Inheritance through Interfaces.

---

# 🔹 Common Marker Interfaces

### Serializable

```java
implements Serializable
```

Used for Serialization.

---

### Cloneable

```java
implements Cloneable
```

Used to indicate that an object can be cloned.

---

### Remote

```java
implements Remote
```

Used in Java RMI (Remote Method Invocation).

---

# 🔹 Modern Alternative

In modern Java, Annotations often replace Marker Interfaces.

Examples:

```java
@Override
@Deprecated
@SuppressWarnings
```

These provide metadata similarly to Marker Interfaces.

---

# 🔹 Advantages of Marker Interfaces

* Provides Metadata
* Easy to Identify Special Classes
* Helps JVM Apply Special Behavior
* Helps Frameworks Apply Special Behavior
* Lightweight and Simple
* Can Participate in Multiple Inheritance

---

# 🔹 Summary

Marker Interfaces are empty interfaces used to provide special information to Java.

Examples:

* Serializable
* Cloneable
* Remote

Unlike normal interfaces:

* They do not define behavior.
* They do not contain methods.
* They do not require implementation.

They simply mark a class with a special capability.

Java does not support Multiple Inheritance using Classes, but it supports Multiple Inheritance using Interfaces.

Therefore a class can implement:

```java
implements CarControls, Serializable
```

and receive both:

* Behavior Contracts
* Special Capabilities

---

# 🔹 Quick Revision

```text
Marker Interface
        │
        ▼
Empty Interface
        │
        ▼
Provides Metadata
        │
        ▼
Examples:
Serializable
Cloneable
Remote

Java Classes
        │
        ├── Single Inheritance Only
        │
        ▼
Java Interfaces
        │
        ├── Multiple Inheritance Supported
        │
        ▼
implements Interface1,
           Interface2,
           Interface3
```

---

## One-Line Definition

> A Marker Interface is an empty interface used to mark a class with a special capability or metadata, and it can participate in Multiple Inheritance because Java allows a class to implement multiple interfaces.
