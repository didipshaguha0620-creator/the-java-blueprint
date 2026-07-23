# Variables, Data Types & Input/Output

Variables are one of the fundamental building blocks of Java. They allow a program to store and manipulate data during execution.

Before performing calculations, making decisions, or building applications, it is essential to understand how Java stores different types of values.

## Topics Covered

* Variables
* Primitive Data Types
* Reference Data Types
* Variable Declaration
* Variable Initialization
* Variable Naming Rules
* Output using `System.out.print()` and `System.out.println()`
* User Input using the `Scanner` class

---

## What is a Variable?

A variable is a named memory location used to store data.

Think of a variable as a labeled container.

Example:

```text
Age Box  -> 20
Name Box -> "Alex"
```

Whenever the value changes, the contents of the box change while the label remains the same.

---

## Primitive Data Types

| Data Type | Description                | Example    |
| --------- | -------------------------- | ---------- |
| byte      | Small integer              | 100        |
| short     | Short integer              | 2000       |
| int       | Integer                    | 500        |
| long      | Large integer              | 999999999L |
| float     | Decimal (single precision) | 12.5f      |
| double    | Decimal (double precision) | 99.99      |
| char      | Single character           | 'A'        |
| boolean   | True or False              | true       |

---

## Reference Data Types

Reference types store the address of an object rather than the actual value.

Examples:

* String
* Arrays
* Classes
* Objects

---

## Variable Declaration

```java
int age;
```

A variable is declared by specifying its data type followed by its name.

---

## Variable Initialization

```java
int age = 20;
```

Initialization means assigning a value to a variable.

---

## Output

Java provides several ways to print data to the console.

```java
System.out.print();
System.out.println();
```

---

## User Input

The `Scanner` class allows a Java program to accept input from the keyboard.

Example:

```java
Scanner sc = new Scanner(System.in);
```

---

## Learning Objectives

After completing this section, you should be able to:

* Declare variables
* Choose appropriate data types
* Store values
* Display output
* Accept user input
* Build simple interactive programs

---


