package Assessments2.Question2;

public class Employee {
  private String name;
  private int id;
  private double salary;

  public Employee(String name, int id, double salary) {
    this.name = name;
    this.id = id;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public double getSalary() {
    return salary;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setSalary(double salary) {
    this.salary = salary;

  }

  public void calculateAnnualSalary() {
    double bonus = this.salary * 0.05;
    System.out.println("Annual Salary of " + this.name + " (ID: " + this.id + ") is: " + bonus);
    System.out.println("Total Annual Salary including bonus is: " + (this.salary * 12 + bonus));
  }

  public void displayInfo() {
    System.out.println("Employee Name: " + this.name);
    System.out.println("Employee ID: " + this.id);
    System.out.println("Monthly Salary: " + this.salary);
  }

  public static void main(String[] args) {
    Employee employee = new Employee("Don T", 391, 3000.0);
    employee.displayInfo();
    employee.calculateAnnualSalary();
  }
}
