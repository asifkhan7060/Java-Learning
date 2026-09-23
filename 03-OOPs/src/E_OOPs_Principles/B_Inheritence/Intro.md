# INHERITANCE IN OOP

## What is Inheritance?

**Inheritance** is a core principle of Object-Oriented Programming (OOP).

It allows a new class (**Child / Derived class**) to acquire the properties and behaviors of an existing class (**Parent / Base / Super class**).

```text
Parent Class
     ↓
Child Class
```
A simple way to remember:

> **Inheritance creates an "is-a" relationship between classes.**

Example:

```text
Car is a Vehicle
Bike is a Vehicle
Truck is a Vehicle
```

---

# Key Terms

| Term | Meaning |
|---|---|
| **Parent / Base / Super Class** | Class whose properties and methods are inherited |
| **Child / Derived / Sub Class** | Class that inherits from the parent |
| **Inheritance** | Mechanism through which a child class reuses and extends a parent class |

---

# Why Do We Use Inheritance?

Inheritance is mainly used for:

- **Code Reusability** → reuse existing code
- **Extensibility** → add new features to existing classes
- **Modularity** → organize classes in a hierarchy
- **Maintainability** → make related code easier to manage
- **Real-World Modeling** → represent natural relationships between classes

Example:

```text
Vehicle
   ↓
 Car
 Bike
 Truck
```

Instead of writing common properties and methods again in every class, they can be defined in `Vehicle` and reused by the child classes.

---

# How Inheritance Works

The basic process is:

```text
1. Create a Parent Class
        ↓
2. Create a Child Class
        ↓
3. Child inherits from Parent
        ↓
4. Child reuses inherited members
        ↓
5. Child can add new members
   or override existing methods
```

In languages such as Java, inheritance between classes is created using `extends`.

```java
class ParentClass {
    // attributes and methods
}

class ChildClass extends ParentClass {
    // new attributes and methods
    // or overridden methods
}
```

> Syntax can vary between programming languages.

---

# What is Inherited?

A child class can inherit:

- **Attributes / variables**
- **Methods**

Important points:

- **Constructors are not inherited.**
- **Private members are not directly accessible** by the child class.
- Access to inherited members depends on their access level.

---

# Example

Consider:

```text
                 Vehicle
              /     |      \
            Car    Bike    Truck
```

`Vehicle` can contain common properties and behaviors:

```text
Vehicle
├── speed
├── fuel
├── brand
├── start()
└── stop()
```

The child classes can have their own features:

```text
Car
├── bootSpace
└── airConditionOn()

Bike
├── hasCarrier
└── kickStart()

Truck
├── loadCapacity
└── trailerAttach()
```

The relationship is:

```text
Car   is a Vehicle
Bike  is a Vehicle
Truck is a Vehicle
```

---

# Important Concepts

### Reusability

The child class can reuse code from the parent class.

### Extending

The child class can add its own new properties and methods.

### Overriding

The child class can provide its own implementation of a method already defined in the parent class.

### Hierarchy

Inheritance creates a class hierarchy.

```text
       Vehicle
      /   |   \
    Car  Bike Truck
```

# Types of Inheritance

## Single Inheritance

One child class inherits from one parent class.

```text
Parent
   ↓
Child
```

Example:

```text
Vehicle → Car
```

### Usage

✅ **Recommended / Preferred**

Useful when:

- A child has a clear relationship with one parent
- Common properties and behavior need to be reused
- A simple and clear hierarchy is required

---

## Multiple Inheritance

One child class inherits from multiple parent classes.

```text
Parent A      Parent B
     \          /
      \        /
       Child
```

Example:

```text
Engine + Wheels → Car
```

### Usage

⚠️ **Use with Caution**

Multiple inheritance can create:

- Ambiguity
- More complicated class relationships
- Maintenance difficulties

Languages such as Java avoid multiple inheritance between classes to avoid this type of complexity.

---

## Multilevel Inheritance

A class inherits from a class which is itself derived from another class.

```text
Grandparent
     ↓
   Parent
     ↓
   Child
```

Example:

```text
Vehicle
   ↓
 Car
   ↓
ElectricCar
```

### Usage

🟡 **Use selectively**

Useful when the hierarchy naturally needs multiple levels.

---

## Hierarchical Inheritance

Multiple child classes inherit from one parent class.

```text
       Parent
      /   |   \
   Child A Child B Child C
```

Example:

```text
       Vehicle
      /   |    \
    Car  Bike  Truck
```

### Usage

✅ **Recommended / Preferred**

Useful when several classes share common properties and behavior from one parent class.

---

# Inheritance Type Summary

| Type | Structure | Usage |
|---|---|---|
| **Single** | One parent → one child | ✅ Recommended |
| **Multiple** | Multiple parents → one child | ⚠️ Use with caution |
| **Multilevel** | Grandparent → Parent → Child | 🟡 Use selectively |
| **Hierarchical** | One parent → multiple children | ✅ Recommended |

---

# When Should You Use Inheritance?

Use inheritance when there is a genuine **"is-a" relationship**.

Good example:

```text
Car is a Vehicle
```

Not every relationship should use inheritance.

The child should represent a specialized form of the parent.

```text
Parent
  ↓
General concept

Child
  ↓
More specific version
```

---

# Overall Usage Guide

| Situation | Recommended Approach |
|---|---|
| One clear parent-child relationship | ✅ **Single Inheritance** |
| Several classes share one common parent | ✅ **Hierarchical Inheritance** |
| Natural multi-level hierarchy | 🟡 **Multilevel Inheritance** |
| Multiple parent classes are required | ⚠️ **Use with Caution** |

---

# Simple Mental Model

Think of inheritance as:

```text
Parent Class
     ↓
Common Properties + Methods
     ↓
Child Class
     ↓
Reuse + Extend + Override
```

Example:

```text
Vehicle
   ↓
Common:
speed
fuel
brand
start()
stop()

       ↓

Car
Bike
Truck
```

So the main purpose of inheritance is:

> **Reuse common code, extend existing classes, and build a meaningful class hierarchy.**