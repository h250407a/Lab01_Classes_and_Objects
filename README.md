# Lab 01: Classes and Objects

**Student Details:**
- **Name:** Anesu B Kahanda
- **Registration Number:** H250407A
- **Department:** Computer Science
- **Course:** Object-Oriented Programming in Java

---

## Overview
This laboratory covers the fundamental concepts of classes and objects in Java:
1. Defining classes with attributes (fields/state) and behaviours (methods).
2. Instantiating objects on the heap using the `new` keyword.
3. Accessing instance members via the dot (`.`) operator.
4. Distinguishing between reference variables and concrete heap objects.
5. Understanding reference aliasing and avoiding `NullPointerException`.

---

## Files in this Directory

| File Name | Description |
|---|---|
| `Student.java` | Program 1.1: Models a student with fields (`name`, `rollNo`, `gpa`) and methods (`display()`, `isHonours()`). |
| `ReferenceDemo.java` | Program 1.2: Explores reference aliasing, identity comparison (`==`), and null references. |
| `Course.java` | Program 1.3: Illustrates object composition and chained dot member access. |
| `Car.java` | Exercises 1 & 2: Models cars with `brand`, `year`, `mileage`, `display()`, and `isAntique()`. |
| `RectangleDemo.java` | Exercises 3 & 4: Computes area/perimeter for 5 rectangles, finds maximum area, and verifies aliasing side-effects. |
| `PersonAddressDemo.java` | Exercise 5: Demonstrates nested `Person` and `Address` objects, chained access, and null safety. |

---

## How to Compile and Run

To compile all Java files in this folder:
```bash
javac *.java
```

To run individual programs:
```bash
java Student
java ReferenceDemo
java Course
java Car
java RectangleDemo
java PersonAddressDemo
```

---

## Expected Output Samples

### `Student.java`
```
Name: Tariro, Roll No: 101, GPA: 3.8
Name: Farai, Roll No: 102, GPA: 3.1
Tariro honours? true
Farai honours? false
```

### `RectangleDemo.java`
```
Rectangle [3.0 x 4.0] - Area: 12.0, Perimeter: 14.0
Rectangle [5.5 x 2.0] - Area: 11.0, Perimeter: 15.0
Rectangle [8.0 x 6.0] - Area: 48.0, Perimeter: 28.0
Rectangle [1.5 x 9.0] - Area: 13.5, Perimeter: 21.0
Rectangle [4.0 x 7.0] - Area: 28.0, Perimeter: 22.0

--- Largest Rectangle ---
Largest Area: 48.0 (Width=8.0, Height=6.0)

--- Exercise 4: Aliasing Test ---
r1.width after changing r2.width: 99.0
```
