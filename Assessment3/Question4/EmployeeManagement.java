package Assessment3.Question4;

public class EmployeeManagement {
  private static String companyName;
  private String employeeName;
  private double salary;

  public EmployeeManagement(String name) throws IllegalArgumentException {
    if (name == null || name.trim().isEmpty()) {
      throw new IllegalArgumentException("Employee name cannot be null or empty");
    }
    this.employeeName = name;
    this.salary = 0.0; // Initialize salary to 0
  }

  public static String getCompanyName() {
    return companyName;
  }

  public static void setCompanyName(String companyName) {
    EmployeeManagement.companyName = companyName;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) throws IllegalArgumentException {
    if (salary < 0) {
      throw new IllegalArgumentException("Salary cannot be negative");
    }
    this.salary = salary;
  }

  public double calculateBonus() {
    return this.salary * 0.1;
  }
}
