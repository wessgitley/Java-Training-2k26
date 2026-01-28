package Polymorphism;

public class OverloadingDemo {
  public static void main(String[] args) {
    MathOperations math = new MathOperations();
    System.out.println(math.add(6, 7)); // calls method with two integer parameters
    System.out.println(math.add(14.2, 17.8, 28.4));

    int[] numbers = { 18, 36, 54, 72 };
    System.out.println(math.add(numbers)); // calls method with array parameter

  }
}
