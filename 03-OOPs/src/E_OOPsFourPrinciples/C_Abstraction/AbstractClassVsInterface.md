# Abstract Class vs Interface

## Comparison Table

| Feature                   | Abstract Class                                    | Interface                                                         |
| ------------------------- | ------------------------------------------------- | ----------------------------------------------------------------- |
| **Purpose**               | Used when classes share common state and behavior | Used to define a contract/capability                              |
| **Keyword**               | `abstract class`                                  | `interface`                                                       |
| **Methods**               | Can have abstract and concrete methods            | Can have abstract, default, static, and private methods (Java 9+) |
| **Variables / Fields**    | Can have instance, static, and final variables    | Variables are implicitly `public static final` (constants)        |
| **Constructors**          | ✔ Allowed                                         | ✘ Not Allowed                                                     |
| **Object Creation**       | ✘ Cannot instantiate directly                     | ✘ Cannot instantiate directly                                     |
| **Access Modifiers**      | Can use `private`, `protected`, `public`, etc.    | Methods are `public` by default                                   |
| **Multiple Inheritance**  | ✘ Not Supported                                   | ✔ Supported through multiple interfaces                           |
| **Inheritance Keyword**   | `extends`                                         | `implements`                                                      |
| **State (Data Storage)**  | ✔ Can store object state                          | ✘ Should not store object state                                   |
| **Method Implementation** | Can provide partial implementation                | Mainly defines a contract                                         |
| **Relationship Type**     | **IS-A** Relationship                             | **CAN-DO** Relationship                                           |
| **Use Case**              | Related classes sharing common code               | Unrelated classes sharing common capability                       |
| **Example**               | `Vehicle → Car, Bike`                             | `Flyable → Bird, Drone, Plane`                                    |
| **Common Variables**      | ✔ Supported                                       | ✘ Not Supported (except constants)                                |
| **Common Constructors**   | ✔ Supported                                       | ✘ Not Supported                                                   |
| **Best For**              | Common state + common behavior                    | Common capability/contract                                        |

---

# Quick Memory Trick

| Abstract Class                      | Interface              |
| ----------------------------------- | ---------------------- |
| **What things ARE**                 | **What things CAN DO** |
| Car **IS-A** Vehicle                | Bird **CAN Fly**       |
| Dog **IS-An** Animal                | Robot **CAN Move**     |
| SavingsAccount **IS-A** BankAccount | Drone **CAN Fly**      |

---

# Golden Rule

```text
Need shared state (variables) + common implementation?
→ Use Abstract Class

Need a contract/capability for unrelated classes?
→ Use Interface
```

---

# Simple Diagram

```text
Abstraction
│
├── Abstract Class
│      ├── Variables
│      ├── Constructors
│      ├── Abstract Methods
│      └── Concrete Methods
│
└── Interface
       ├── Contract
       ├── Abstract Methods
       ├── Default Methods
       └── Multiple Inheritance Support
```

---

# One-Line Summary

**Abstract Class = Common State + Common Behavior**

**Interface = Common Contract + Capability**
