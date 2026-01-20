//Name: Wesley Mutisya

package Assessments;

import java.util.Scanner;

public class Assessment1_Wesley_Mutisya {

  public static void main(String[] args) {

    // Quiz problem 1: Variable Operations

    int a = 15, b = 4, c = 7;
    System.out.println("Sum: " + (a + b + c));
    System.out.println("Product: " + (a * b));
    System.out.println("Expression result: " + ((a + b) * c));
    System.out.println("Remainder: " + (a % b));

    // Quiz problem 2: Grade Calculator

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter student score: ");
    int myScore = scanner.nextInt();

    if (myScore < 0 || myScore > 100) {
      System.out.println("Error: Score must be between 0 and 100");
    } else if (myScore >= 90) {
      System.out.println("Grade: A");
    } else if (myScore >= 80) {
      System.out.println("Grade: B");
    } else if (myScore >= 70) {
      System.out.println("Grade: C");
    } else if (myScore >= 60) {
      System.out.println("Grade: D");
    } else {
      System.out.println("Cannot compute grade");
    }
    scanner.close();

    // Quiz problem 3: Number Sequence

    for (int i = 1; i < 21; i++) {
      if (i % 2 == 0 && i < 21) {
        System.out.println(i + "- Even");
      }
      if (i % 2 == 1 && i < 21) {
        System.out.println(i + "- Odd");
      }
      if (i % 5 == 0 && i < 21) {
        System.out.println(i + " Is a multiple of 5");
      }

      // Quiz problem 4: Input Validation

      int fact = 1;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a positive integer: ");
      int number = scanner.nextInt();

      while (number <= 0) {
        System.out.println("Invalid! Please enter a positive integer: " + number);
      }
      for (int i = 1; i <= number; i++) {
        fact *= i;
        System.out.println("The factorial is: " + fact);
      }

      // Quiz problem 5: Pattern printing

      for (int p = 1; p <= 5; p++) {
        for (int q = 1; q <= p; q++) {
          System.out.println("*");
        }
        System.out.println();
      }

    }

  }

}
