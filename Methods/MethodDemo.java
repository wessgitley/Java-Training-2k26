package Methods;

public class MethodDemo {
  public static void main(String[] args) {
    // Call method without parameters
    displayWelcome();
    // Call method with parameters
    printMessage(
        "Hello Java!", 3);
    // Call method and use return value
    int result = addNumbers(5, 7);
    System.out.println("Sum: " + result);
  }

  public static void displayWelcome() {
    System.out.println("Welcome!");
  }

  public static void printMessage(String msg,
      int count) {
    for (int i = 0; i < count; i++) {
      System.out.println(msg);
    }
  }

  public static int addNumbers(
      int a,
      int b) {
    return a + b;
  }
}
