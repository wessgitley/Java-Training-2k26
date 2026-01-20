package Assessments;

import java.util.Scanner;

public class CalculatorProgram {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int firstValue = scanner.nextInt();
    System.out.println("Enter second number: ");
    int secondValue = scanner.nextInt();
    int sum = firstValue + secondValue;
    System.out.println("The sum is: " + sum);
    int sub = firstValue - secondValue;
    System.out.println("The difference is: " + sub);
    double div = (double) (firstValue / secondValue);
    System.out.println("The result for the division is: " + div);
    int mul = firstValue * secondValue;
    System.out.println("The product is: " + mul);
    int modul = firstValue % secondValue;
    System.out.println("The result of the modulus is: " + modul);
    scanner.close();
  }
}
