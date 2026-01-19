package Methods;

public class myOwnMethods {
  public static void main(String[] args) {

  }

  public static void withoutMethods() {
    // area of a circle

    final double PI = 3.14159;

    double radius = 5.0;
    double area1 = 3.14159 * radius * radius;
    System.out.println("Area: " + area1);

    // ANd again
    double radius2 = 7.0;
    double area2 = PI * 7.0 * 7.0;
    System.out.println("Area2: " + area2);
  }

  public static void reusableAreaCalculation() {
    // accessModifier static returnType methodName(parameterType parameterName)
    // method body - code to execute
    // return value; if return is not void
    // accessModifier -> public protected packagePrivate, private
    // static -> optional, only needed when u dont want to create an object of the
    // class before you can access the method
    // returnType -> data types(primitive, reference types) -> determines the kind
    // of value that is going to be returned by the method
    // methodName -> name of the method
    // (arguments) -> parameters that are set dynamically when calling the method
    // {...statements to execute...}
    System.out.println("The area is: " + calculateCircleArea(5.0));
    System.out.println("The area is: " +
        calculateCircleArea(7.0));
  }

  public static double calculateCircleArea(double radius) {
    final double PI = 3.14159;

    double result = PI * radius * radius;
    return result;
  }

}