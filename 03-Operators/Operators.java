/*
 

 * This program demonstrates:
 * 1. Arithmetic Operators
 * 2. Assignment Operators
 * 3. Comparison Operators
 * 4. Logical Operators
 * 5. Increment & Decrement
 */

public class Operators {

    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        // ==============================
        // Arithmetic Operators
        // ==============================

        System.out.println("----- Arithmetic Operators -----");

        System.out.println("Addition       : " + (a + b));
        System.out.println("Subtraction    : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division       : " + (a / b));
        System.out.println("Remainder      : " + (a % b));

        // ==============================
        // Assignment Operators
        // ==============================

        System.out.println("\n----- Assignment Operators -----");

        int number = 5;

        number += 3;   // number = number + 3
        System.out.println("After += : " + number);

        number -= 2;   // number = number - 2
        System.out.println("After -= : " + number);

        number *= 4;   // number = number * 4
        System.out.println("After *= : " + number);

        number /= 3;   // number = number / 3
        System.out.println("After /= : " + number);

        number %= 2;   // number = number % 2
        System.out.println("After %= : " + number);

        // ==============================
        // Comparison Operators
        // ==============================

        System.out.println("\n----- Comparison Operators -----");

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // ==============================
        // Logical Operators
        // ==============================

        System.out.println("\n----- Logical Operators -----");

        boolean x = true;
        boolean y = false;

        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x     : " + (!x));

        // ==============================
        // Increment & Decrement
        // ==============================

        System.out.println("\n----- Increment & Decrement -----");

        int count = 10;

        System.out.println("Original Value : " + count);

        count++;
        System.out.println("After ++       : " + count);

        count--;
        System.out.println("After --       : " + count);

    }
}
