package com.examples.hello;

import java.util.Scanner;

// Here we demonstrate various Scanner methods

public class ReadEmployee {
    public static void main(String[] args) {
        String name; // To hold the employee's name
        int age ; // To hold the employee's age
        char gender; // A single character for the gender
        double salary; // To hold the emplyee's salary

        // Create a Scanner object to read input
        Scanner console = new Scanner(System.in);

        // Get the Employee's Name
        System.out.println("Enter name   ");
        name = console.nextLine();

        // Get the Employee's Age
        System.out.println("Enter Age  ");
        age = console.nextInt();

        // Get the Employee's Gender
        System.out.println("Enter Gender");
        gender = console.next().charAt(0);

        // Get the Employee's salary
        System.out.println("Enter Salary ");
        salary = console.nextDouble();


        // Display the information
        System.out.println(" Name : " + name  +  "\nAge : " + age + "\nGender : " + gender + "\nSalary : " + salary);

    }
}
