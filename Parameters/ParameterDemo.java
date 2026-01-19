package Parameters;

public class ParameterDemo {
  public static void main(String[] args) {
    // Arguments: 5, 3
    int sum = add(5, 3);
    System.out.println("Sum: " + sum);
    // Arguments: "Alice", 25
    greetPerson("Alice", 25);
  }

  // Parameters: a, b
  public static int add(int a, int b) {
    return a + b;
  }

  // Parameters: name, age
  public static void greetPerson(String name,
      int age) {
    System.out.println("Hello " + name + ", you are " + age + " years old.");
  }
}
