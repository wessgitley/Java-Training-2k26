package Methods;

public class OverloadingDemo {
  public static void main(String[] args) {
    System.out.println(add(5, 3));
    // Calls add(int, int)
    System.out.println(add(5.5, 3.2));
    // Calls add(double, double)
    System.out.println(add(1, 2, 3));
    // Calls add(int, int, int)
  }

  // Method 1: Two integers
  public static int add(int a, int b) {
    return a + b;
  }

  // Method 2: Two doubles
  public static double add(double a, double b) {
    return a + b;
  }

  // Method 3: Three integers
  public static int add(int a, int b, int c) {
    return a + b + c;
  }
}
