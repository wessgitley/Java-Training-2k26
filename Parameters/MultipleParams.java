package Parameters;

public class MultipleParams {
  public static void main(String[] args) {
    printStudentInfo("John Doe", 0, 203.8, true);
    double total = calculateTotal(25.99, 8.50, 0.08);
    System.out.println("Total cost: $" + total);
  }

  public static void printStudentInfo(String name, int age, double gpa, boolean isEnrolled) {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("GPA: " + gpa);
    System.out.println("Enrolled: " + isEnrolled);
  }

  public static double calculateTotal(double price, double tax, double discount) {
    return price + tax - discount;
  }
}
