package Methods;

//Using a method's return values as arguments to other methods
public class MethodChaining {
  public static void main(String[] args) {
    int result1 = add(5, 3);
    int result2 = multiply(result1, 2);
    printResult(result2);
    printResult(multiply(add(5, 3), 2));
    String formatted = formatResult(calculateFinalScore(85, 90, 78));
    System.out.println(formatted);
  }

  public static int add(int a, int b) {
    return a + b;
  }

  public static int multiply(int a, int b) {
    return a * b;
  }

  public static void printResult(int value) {
    System.out.println("Result: " + value);
  }

  public static double calculateFinalScore(double test1, double test2, double test3) {
    return (test1 + test2 + test3) / 3;
  }

  public static String formatResult(double score) {
    return String.format(
        "Final Score: %.2f", score);
  }

  // Method errors
  // 1. Missing return statement
  public static int badMethod(int x) {
    if (x > 0) {
      return x;
    }
    // What if x <= 0? No return value!
  }

  // 2.Wrong return type
  public static int calculate() {
    double result = 3.14;
    return result;
    // double cannot be returned as int
  }

  // BEST PRACTICES
  // 1.Use descriptive names
  // for example: public static double calculateCircleArea(double radius)
  // 2.Use single responsibility
  public static boolean isValidEmail(String email)
  // Avoid - doing too much
  public static void processUserDataAndSendEmail()
  //3.use appropriate parameters
  // Good - reasonable number of parameters
public static void createUser(String name, String email)
// Avoid - too many parameters
public static void updateProfile(String name, String email,int age, String address, String phone, boolean isActive)



}
