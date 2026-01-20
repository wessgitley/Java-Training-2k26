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

  // Method Overloading rules
  // VALID OVERLOADING
  // 1.Different number of parameters
  public static void print(String message) {
  }

  public static void print(String message, int times) {
  }

  // 2.Different parameter types
  public static void process(int number) {
  }

  public static void process(String text) {
  }

  // 3. Different parameter order
  public static void create(int id, String name) {
  }

  public static void create(String name, int id) {

  }

  // INVALID OVERLOADING -> these are not allowed
  public static int calculate(int a, int b) {
    return a + b;
  }

  public static double calculate(int a, int b) {
    return a + b;
  }

}
