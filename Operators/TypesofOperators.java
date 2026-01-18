package Operators;

public class TypesofOperators {

  public void operatortypes() {

  }

  public static void main(String[] args) {
    add(5, 10);
  }

  public static int add(int firtsnumber, int secondnumber) {
    return firtsnumber + secondnumber;
  }

  public static void arithmeticOperators(String[] args) {
    int a = 15;
    int b = 9;
    System.out.println("a+b= " + (a + b));
    System.out.println("a-b= " + (a - b));
  }

  public static void assignmentOperators(String[] args) {
    System.out.println();
    int balance = 20000;
    balance += 5000;
    System.out.println("Current balance" + balance);
    balance -= 8102;
    System.out.println("Current balance after withdrawal" + balance);
    double disbursement = (double) balance / 3.0;
    System.out.println("Amount to be disbursed: " + balance);
  }

  public static void comparisonoperators(String[] args) {
    int a = 10, b = 5, c = 10;

    System.out.println("a == c: " + (a == c));
    System.out.println("a != b: " + (a != b));
    System.out.println("a > b: " + (a > b));
    System.out.println("a < b: " + (a < b));
    System.out.println("a >= c: " + (a >= c));
    System.out.println("b <= a: " + (b <= a));
  }

  // For objects, use .equals() instead of ==
  public static void objectOperators(String[] args) {
    String s1 = "hello";
    String s2 = "hello";
    System.out.println("Strings equal: " + s1.equals(s2));
  }

  public static void logicalOperators(String[] args) {
    boolean isSunny = true;
    boolean isWeekend = false;
    int temperature = 25;

    // AND (&&) - both must be true
    System.out.println("Good Weather: " + (isSunny && temperature > 20)); // true
    // OR((|) -either must be true
    System.out.println("Outdoor day: " + (isSunny || isWeekend)); // true
    // NOT(!) -reverses the value
    System.out.println("Not sunny: " + !isSunny); // false
    // Complex condition
    System.out.println("Perfect day: " + (isSunny && temperature > 20 && !isWeekend)); // true
  }

}
