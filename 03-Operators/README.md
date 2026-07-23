# Operators in Java

Operators are special symbols that perform operations on variables and values. They are one of the most fundamental concepts in programming, allowing us to perform calculations, compare values, make decisions, and manipulate data.

Think of operators as **tools**. Just as a calculator provides buttons for addition, subtraction, multiplication, and division, Java provides operators to perform these operations programmatically.

---

## Topics Covered

* Arithmetic Operators
* Assignment Operators
* Comparison (Relational) Operators
* Logical Operators
* Increment & Decrement Operators
* Operator Precedence

---

## 1. Arithmetic Operators

Used to perform mathematical calculations.

| Operator | Description         | Example |
| -------- | ------------------- | ------- |
| `+`      | Addition            | `a + b` |
| `-`      | Subtraction         | `a - b` |
| `*`      | Multiplication      | `a * b` |
| `/`      | Division            | `a / b` |
| `%`      | Modulus (Remainder) | `a % b` |

---

## 2. Assignment Operators

Used to assign values to variables.

| Operator | Meaning             |
| -------- | ------------------- |
| `=`      | Assign value        |
| `+=`     | Add and assign      |
| `-=`     | Subtract and assign |
| `*=`     | Multiply and assign |
| `/=`     | Divide and assign   |
| `%=`     | Modulus and assign  |

---

## 3. Comparison (Relational) Operators

Used to compare two values. The result is always `true` or `false`.

| Operator | Meaning                  |
| -------- | ------------------------ |
| `==`     | Equal to                 |
| `!=`     | Not equal to             |
| `>`      | Greater than             |
| `<`      | Less than                |
| `>=`     | Greater than or equal to |
| `<=`     | Less than or equal to    |

---

## 4. Logical Operators

Logical operators are commonly used with conditions.

| Operator | Meaning     |   |            |
| -------- | ----------- | - | ---------- |
| `&&`     | Logical AND |   |            |
| `        |             | ` | Logical OR |
| `!`      | Logical NOT |   |            |

---

## 5. Increment & Decrement

Used to increase or decrease a variable by one.

| Operator | Meaning       |
| -------- | ------------- |
| `++`     | Increase by 1 |
| `--`     | Decrease by 1 |

Example:

```java
count++;
count--;
```

---

## 6. Operator Precedence

Java follows precedence rules similar to mathematics.

Example:

```java
10 + 5 * 2
```

Output:

```text
20
```

Multiplication is performed before addition.

---

## Learning Objectives

After completing this topic, you should be able to:

* Perform mathematical calculations
* Update variable values efficiently
* Compare values
* Write logical conditions
* Understand how Java evaluates expressions
* Use increment and decrement operators correctly

---

## Next Topic

Conditional Statements (`if`, `if-else`, `switch`)
