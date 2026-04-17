# Java Guide - Learn Java with SimpleApp 📚

This guide explains the Java code in `SimpleApp.java` and teaches you core Java concepts through practical examples.

## Table of Contents

1. [Basic Structure](#basic-structure)
2. [Packages and Imports](#packages-and-imports)
3. [Main Method](#main-method)
4. [Input/Output with Scanner](#input-output-with-scanner)
5. [Variables and Data Types](#variables-and-data-types)
6. [Control Flow](#control-flow)
7. [Methods](#methods)
8. [String Operations](#string-operations)
9. [Error Handling](#error-handling)
10. [Common Mistakes](#common-mistakes)

---

## Basic Structure

Every Java program needs these basic parts:

```java
public class SimpleApp {
    public static void main(String[] args) {
        // Your code here
    }
}
```

### Breaking it down:

| Part | Meaning |
|------|---------|
| `public` | Anyone can access this class |
| `class` | A blueprint for an object |
| `SimpleApp` | The class name (must match filename) |
| `main` | The entry point - runs when program starts |
| `String[] args` | Command line arguments (we don't use it here) |

---

## Packages and Imports

```java
package com.example;

import java.util.Scanner;
```

### Package
- `package com.example;` - Organizes code, prevents naming conflicts
- File location must match: `src/main/java/com/example/SimpleApp.java`

### Import
- `import java.util.Scanner;` - Brings in the Scanner class
- Scanner is in Java's standard library, allows us to read user input

---

## Main Method

```java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean running = true;
    while (running) {
        // Menu loop
    }
}
```

### What happens:
1. Create a Scanner to read input
2. Set `running = true` to keep the loop going
3. Loop until user chooses Exit

---

## Input/Output with Scanner

### Reading Input

```java
Scanner scanner = new Scanner(System.in);

// Read a line of text
String name = scanner.nextLine();

// Read and convert to integer
int num = Integer.parseInt(scanner.nextLine());
```

### Important Methods:

| Method | Returns | Example |
|--------|---------|---------|
| `nextLine()` | String | `"John"` |
| `nextInt()` | int | `42` |
| `nextDouble()` | double | `3.14` |

### Printing Output

```java
System.out.println("Hello");        // Prints with newline
System.out.print("No newline");     // Prints without newline
```

### Example:
```java
System.out.print("Enter your name: ");
String name = scanner.nextLine();
System.out.println("Hello, " + name + "!");
```

---

## Variables and Data Types

### Basic Data Types

```java
int number = 42;              // Whole numbers (-2 billion to 2 billion)
double price = 19.99;         // Decimal numbers
String name = "John";         // Text
boolean isActive = true;      // true or false
char grade = 'A';             // Single character
```

### String Operations

```java
String text = "Hello";

// Get length
int length = text.length();   // 5

// Combine strings
String message = text + " World";  // "Hello World"

// Check if empty
boolean empty = text.isEmpty();  // false

// Convert to lowercase
String lower = text.toLowerCase();  // "hello"

// Get first character
char first = text.charAt(0);   // 'H'
```

---

## Control Flow

### If/Else Statements

```java
if (age >= 18) {
    System.out.println("Adult");
} else if (age >= 13) {
    System.out.println("Teen");
} else {
    System.out.println("Child");
}
```

### Example from SimpleApp:
```java
if (num % 2 == 0) {
    System.out.println(num + " is EVEN");
} else {
    System.out.println(num + " is ODD");
}
```

### Switch Statement

```java
switch (choice) {
    case "1":
        greetUser(scanner);
        break;          // Important! Prevents falling through
    case "2":
        addNumbers(scanner);
        break;
    default:
        System.out.println("Invalid choice");
}
```

**Why `break;`?** Without it, code continues to the next case.

### While Loop

```java
boolean running = true;
while (running) {
    System.out.print("> ");
    String input = scanner.nextLine();
    
    if (input.equals("exit")) {
        running = false;    // Loop exits
    }
}
```

### For Loop

```java
// Print numbers 1 to 5
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

---

## Methods

### Why Methods?

Methods let you reuse code and organize it logically.

### Anatomy of a Method

```java
private static void greetUser(Scanner scanner) {
    System.out.print("Enter your name: ");
    String name = scanner.nextLine().trim();
    System.out.println("Hello, " + name + "!");
}
```

| Part | Meaning |
|------|---------|
| `private` | Only this class can call it |
| `static` | Can be called from main without creating an object |
| `void` | Returns nothing |
| `greetUser` | Method name |
| `Scanner scanner` | Parameter - input to method |

### Method with Return Value

```java
private static int add(int a, int b) {
    int sum = a + b;
    return sum;        // Returns value
}

// Use it:
int result = add(10, 20);  // result = 30
```

### Method Parameter Types

```java
// No parameters
private static void showMenu() { }

// Single parameter
private static void greet(String name) { }

// Multiple parameters
private static int multiply(int a, int b) { }

// Array parameter
private static void printArray(int[] numbers) { }
```

---

## String Operations

### Useful String Methods

```java
String text = "  Hello World  ";

text.trim();              // "Hello World" (removes spaces)
text.toUpperCase();       // "  HELLO WORLD  "
text.toLowerCase();       // "  hello world  "
text.length();            // 15
text.charAt(0);           // ' ' (first character, space)
text.substring(2);        // "Hello World  "
text.substring(2, 7);     // "Hello"
text.contains("World");   // true
text.startsWith("Hello"); // false (has spaces first)
text.replace("World", "Java");  // "  Hello Java  "
text.split(" ");          // Array: ["", "", "Hello", "World", "", ""]
```

### Comparing Strings

```java
String a = "hello";
String b = "hello";

// Correct way to compare strings
if (a.equals(b)) { }              // true
if (a.equalsIgnoreCase("HELLO")) { }  // true

// Wrong way (don't do this)
if (a == b) { }  // Might be false even if same content
```

### Converting Strings

```java
// String to Integer
int num = Integer.parseInt("42");     // 42
int num2 = Integer.parseInt("3.14");  // ERROR!

// String to Double
double price = Double.parseDouble("19.99");  // 19.99

// Integer to String
String text = String.valueOf(42);    // "42"
String text2 = 42 + "";              // "42"
```

---

## Error Handling

### Try-Catch Block

```java
try {
    System.out.print("Enter a number: ");
    int num = Integer.parseInt(scanner.nextLine());
    System.out.println("You entered: " + num);
} catch (NumberFormatException e) {
    System.out.println("Invalid input! Please enter a valid number.");
}
```

### How it works:

1. **Try block** - Code that might fail
2. **Catch block** - Code that runs if it fails
3. If user enters "hello" instead of a number:
   - `Integer.parseInt()` throws `NumberFormatException`
   - Catch block runs
   - Program continues (doesn't crash)

### Common Exceptions

| Exception | Cause | Example |
|-----------|-------|---------|
| `NumberFormatException` | Invalid number conversion | `Integer.parseInt("abc")` |
| `NullPointerException` | Using null object | `String s = null; s.length()` |
| `ArrayIndexOutOfBoundsException` | Array index too large | `arr[10]` when array has 5 items |

---

## Operators

### Arithmetic

```java
int a = 10;
int b = 3;

a + b;      // 13 (addition)
a - b;      // 7 (subtraction)
a * b;      // 30 (multiplication)
a / b;      // 3 (division, integer)
a % b;      // 1 (modulo - remainder)
a++;        // 11 (increment)
a--;        // 9 (decrement)
```

### Comparison

```java
a == b;     // false (equal)
a != b;     // true (not equal)
a > b;      // true (greater than)
a >= b;     // true (greater or equal)
a < b;      // false (less than)
a <= b;     // false (less or equal)
```

### Logical

```java
true && false;      // false (AND)
true || false;      // true (OR)
!true;              // false (NOT)
```

---

## Practical Examples

### Example 1: Even or Odd (from SimpleApp)

```java
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
        System.out.println("Invalid input!");
    }
}
```

**Key points:**
- `%` operator gets remainder
- If remainder is 0, it's even
- If remainder is 1, it's odd
- Try-catch handles non-numeric input

### Example 2: Add Two Numbers (from SimpleApp)

```java
private static void addNumbers(Scanner scanner) {
    try {
        System.out.print("Enter first number: ");
        int num1 = Integer.parseInt(scanner.nextLine().trim());
        
        System.out.print("Enter second number: ");
        int num2 = Integer.parseInt(scanner.nextLine().trim());
        
        int sum = num1 + num2;
        System.out.println("Result: " + num1 + " + " + num2 + " = " + sum);
    } catch (NumberFormatException e) {
        System.out.println("Invalid input!");
    }
}
```

**Key points:**
- `.trim()` removes spaces before/after input
- Parse both numbers separately
- Try-catch catches errors from either line

---

## Common Mistakes

### Mistake 1: Comparing Strings with ==

```java
// WRONG
String name = "John";
if (name == "John") {  // Usually works, but not reliable
}

// CORRECT
if (name.equals("John")) {  // Always works
}

// Case-insensitive comparison
if (name.equalsIgnoreCase("john")) {
}
```

### Mistake 2: Forgetting break; in Switch

```java
// WRONG - falls through to next case
switch (choice) {
    case "1":
        System.out.println("Choice 1");
        // Missing break!
    case "2":
        System.out.println("Choice 2");
        break;
}

// CORRECT
switch (choice) {
    case "1":
        System.out.println("Choice 1");
        break;
    case "2":
        System.out.println("Choice 2");
        break;
}
```

### Mistake 3: Not Closing Scanner

```java
// Not ideal
Scanner scanner = new Scanner(System.in);
// Use scanner...
// No close

// Better
Scanner scanner = new Scanner(System.in);
// Use scanner...
scanner.close();  // Always close when done
```

### Mistake 4: Integer Division

```java
int a = 10;
int b = 3;

a / b;      // 3 (not 3.33!)
a / b + 0.0;  // 3.0 (still not right)
(double)a / b;  // 3.3333... (correct)
```

### Mistake 5: Not Handling Invalid Input

```java
// WRONG - will crash if user enters text
int num = Integer.parseInt(scanner.nextLine());

// CORRECT - handles error gracefully
try {
    int num = Integer.parseInt(scanner.nextLine());
} catch (NumberFormatException e) {
    System.out.println("Please enter a valid number");
}
```

---

## Practice Exercises

### Exercise 1: Greet with Age
Modify `greetUser()` to also ask for age and print: "Hello [name], you are [age] years old!"

```java
private static void greetUser(Scanner scanner) {
    System.out.print("Enter your name: ");
    String name = scanner.nextLine().trim();
    System.out.print("Enter your age: ");
    int age = Integer.parseInt(scanner.nextLine().trim());
    System.out.println("Hello " + name + ", you are " + age + " years old!");
}
```

### Exercise 2: Calculate Area
Add a new menu option to calculate rectangle area (length × width)

```java
case "5":
    calculateArea(scanner);
    break;

private static void calculateArea(Scanner scanner) {
    try {
        System.out.print("Enter length: ");
        int length = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Enter width: ");
        int width = Integer.parseInt(scanner.nextLine().trim());
        int area = length * width;
        System.out.println("Area = " + area);
    } catch (NumberFormatException e) {
        System.out.println("Invalid input!");
    }
}
```

### Exercise 3: Grade Calculator
Add a menu option that takes a score (0-100) and prints the grade (A, B, C, D, F)

```java
private static void gradeCalculator(Scanner scanner) {
    try {
        System.out.print("Enter score (0-100): ");
        int score = Integer.parseInt(scanner.nextLine().trim());
        
        String grade;
        if (score >= 90) grade = "A";
        else if (score >= 80) grade = "B";
        else if (score >= 70) grade = "C";
        else if (score >= 60) grade = "D";
        else grade = "F";
        
        System.out.println("Your grade: " + grade);
    } catch (NumberFormatException e) {
        System.out.println("Invalid input!");
    }
}
```

---

## Next Steps

1. ✅ Read through SimpleApp.java
2. ✅ Complete the practice exercises
3. ✅ Add new features to the menu
4. ✅ Explore the [Java API Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/)

Happy coding! 🎉
