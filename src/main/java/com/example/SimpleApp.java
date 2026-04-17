package com.example;

import java.util.Scanner;

public class SimpleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║  Welcome to Simple Java Docker App  ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.println();
        
        boolean running = true;
        while (running) {
            System.out.println("Choose an option:");
            System.out.println("1. Greet me");
            System.out.println("2. Add two numbers");
            System.out.println("3. Check if number is even/odd");
            System.out.println("4. Exit");
            System.out.print("> ");
            
            String choice = scanner.nextLine().trim();
            
            switch (choice) {
                case "1":
                    greetUser(scanner);
                    break;
                case "2":
                    addNumbers(scanner);
                    break;
                case "3":
                    checkEvenOdd(scanner);
                    break;
                case "4":
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
            System.out.println();
        }
        
        scanner.close();
    }
    
    private static void greetUser(Scanner scanner) {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();
        System.out.println("Hello, " + name + "! Welcome to Docker learning!");
    }
    
    private static void addNumbers(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            int num1 = Integer.parseInt(scanner.nextLine().trim());
            
            System.out.print("Enter second number: ");
            int num2 = Integer.parseInt(scanner.nextLine().trim());
            
            int sum = num1 + num2;
            System.out.println("Result: " + num1 + " + " + num2 + " = " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter valid numbers.");
        }
    }
    
    private static void checkEvenOdd(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            int num = Integer.parseInt(scanner.nextLine().trim());
            
            if (num % 2 == 0) {
                System.out.println(num + " is EVEN");
            } else {
                System.out.println(num + " is ODD");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        }
    }
}
