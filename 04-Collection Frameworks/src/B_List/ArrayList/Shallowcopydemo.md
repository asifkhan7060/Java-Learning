## Shallow Copy Demonstration

Consider the following code:

```java
ArrayList<Car> originalCars = new ArrayList<>();

originalCars.add(new Car("BMW", 900));
originalCars.add(new Car("Toyota", 500));

ArrayList<Car> copiedCars =
        (ArrayList<Car>) originalCars.clone();
```

---

### Step 1 : Before clone()

Only one `ArrayList` exists.

It stores references (addresses) of `Car` objects.

```text
original
   │
   ▼
+-----------+
|    ●------|------------------+
+-----------+                  |
                               ▼
                      +------------------+
                      | Brand = BMW      |
                      | Speed = 900      |
                      +------------------+

+-----------+
|    ●------|------------------+
+-----------+                  |
                               ▼
                      +------------------+
                      | Brand = Toyota   |
                      | Speed = 500      |
                      +------------------+
```

Notice:

- `ArrayList` stores references.
- It does **not** store the actual `Car` objects.

---

### Step 2 : After clone()

```java
ArrayList<Car> copiedCars =
        (ArrayList<Car>) originalCars.clone();
```

`clone()` creates a **new ArrayList**.

However,

it **does not create new Car objects**.

Both lists store references to the **same Car objects**.

```text
original                    copied
   │                          │
   ▼                          ▼
+-----------+            +-----------+
|    ●------|            |    ●------|
+-----------+            +-----------+
        \_____________________/
                  │
                  ▼
          +------------------+
          | Brand = BMW      |
          | Speed = 900      |
          +------------------+

+-----------+            +-----------+
|    ●------|            |    ●------|
+-----------+            +-----------+
        \_____________________/
                  │
                  ▼
          +------------------+
          | Brand = Toyota   |
          | Speed = 500      |
          +------------------+
```

Notice:

- Two different `ArrayList` objects exist.
- But only one object of each `Car` exists.

---

### Step 3 : Modify an Object

```java
copiedCars.get(0).brand = "Audi";
```

Let's understand this line.

#### Part 1

```java
copiedCars.get(0)
```

returns the object stored at **index 0**.

In this case,

```text
Car("BMW", 900)
```

---

#### Part 2

```java
.brand
```

accesses the `brand` variable of that object.

---

#### Part 3

```java
= "Audi";
```

changes

```text
BMW
```

to

```text
Audi
```

Now the memory becomes

```text
original                    copied
   │                          │
   ▼                          ▼
+-----------+            +-----------+
|    ●------|            |    ●------|
+-----------+            +-----------+
        \_____________________/
                  │
                  ▼
          +------------------+
          | Brand = Audi     |
          | Speed = 900      |
          +------------------+

+-----------+            +-----------+
|    ●------|            |    ●------|
+-----------+            +-----------+
        \_____________________/
                  │
                  ▼
          +------------------+
          | Brand = Toyota   |
          | Speed = 500      |
          +------------------+
```

Notice:

Only **one Car object** exists.

Its brand has changed from

```text
BMW
```

to

```text
Audi
```

---

### Step 4 : Printing the Lists

```java
System.out.println(originalCars);

System.out.println(copiedCars);
```

When Java prints `originalCars`,

it follows its stored references.

```text
original
   │
   ▼
+-----------+
|    ●------|
+-----------+
        │
        ▼
+------------------+
| Brand = Audi     |
| Speed = 900      |
+------------------+
```

Output

```text
Original :
[Car{brand='Audi', speed=900},
 Car{brand='Toyota', speed=500}]
```

---

When Java prints `copiedCars`,

it again follows its stored references.

```text
copied
   │
   ▼
+-----------+
|    ●------|
+-----------+
        │
        ▼
+------------------+
| Brand = Audi     |
| Speed = 900      |
+------------------+
```

Output

```text
Copied :
[Car{brand='Audi', speed=900},
 Car{brand='Toyota', speed=500}]
```

Both lists display the same updated object because both lists point to the same `Car` instance.

---

## Why didn't this happen in the String example?

```java
copy.add("JavaScript");
```

This statement **adds a new element to the copied list**.

It does **not modify any existing object**.

Therefore,

```text
Original

Java
Python
C++

Copied

Java
Python
C++
JavaScript
```

The original list remains unchanged.

---

## Key Difference

```java
copy.add("JavaScript");
```

Changes the **ArrayList structure**.

Only the copied list changes.

---

```java
copiedCars.get(0).brand = "Audi";
```

Changes the **shared Car object**.

Both lists reflect the change.

---

## Interview Point

`clone()` performs a **Shallow Copy**.

- A new `ArrayList` object is created.
- The objects stored inside the list are **not copied**.
- Both lists share references to the same objects.
- Modifying the list structure affects only that list.
- Modifying a shared object's state affects every list that references it.