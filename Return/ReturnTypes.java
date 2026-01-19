package Return;

public class ReturnTypes {
  public static void main(String[] args) {

  }

  // void - no return value
  public static void displayInfo(String info) {
    System.out.println("Information: " + info);
    // No return statement needed
  }

  // Primitive return types
  public static int getMax(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  // Return statement rules
  // 1.Must match return type
  public static int getNumber() {
    return 42;
    // returns int
    // return 3.14;
    // cannot return double
  }

  // 2.Required for non-void methods
  public static int badMethod() {
    System.out.println(
        "This method is broken!");
    // Missing return statement
    return 0; // return statement
  }

  // 3.Return stops execution
  public static String checkNumber(int num) {
    if (num > 0) {
      return "Positive";
    } else if (num < 0) {
      return "Negative";
    }
    return "Zero";
    // This executes only if above conditions are false
  }

}
