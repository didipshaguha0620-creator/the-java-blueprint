/*
 * Topic: User Input using Scanner
 *
 * This program demonstrates:
 * 1. Importing Scanner
 * 2. Creating a Scanner Object
 * 3. Reading different types of input
 * 4. Displaying user input
 */

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        // Scanner reads input from the keyboard
        Scanner sc = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Enter your name: ");

        // Read a full line of text
        String name = sc.nextLine();

        // Ask for age
        System.out.print("Enter your age: ");

        // Read an integer
        int age = sc.nextInt();

        // Ask for height
        System.out.print("Enter your height: ");

        // Read a decimal number
        double height = sc.nextDouble();

        // Display the entered information
        System.out.println("\n User Details ");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Height : " + height);

        // Close the Scanner to free system resources
        sc.close();

    }
}
