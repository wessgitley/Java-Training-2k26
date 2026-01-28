package Polymorphism;

public class MathOperations {
  public int add(int a, int b) { // method
    System.out.println("Adding two integers:");
    return a + b; // returns the operation to be performed
  }

  public double add(double k, double l, double m) { // same method different parameters
    System.out.println("Adding three integers:");
    return k + l + m;
  }

  public int add(int[] numbers) { // same method different parameters
    System.out.println("Adding an array of integers:");
    int sum = 0; // variable declaration and initialization
    for (int num : numbers) { // enhanced for loop. Iterates through each element in the array
      sum += num;
    }
    return sum;
  }
}
