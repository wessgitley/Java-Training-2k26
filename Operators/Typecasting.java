package Operators;

public class Typecasting {
  public static void main(String[] args) {
    // implicit casting (widening) - automatic
    int myInt = 10;
    double myDouble = myInt;
    // explicit casting
    double anotherDouble = 9.78;
    int anotherInt = (int) anotherDouble; // double -> int (truncates)
    System.out.println("Original double: " + anotherDouble); // 9.78
    System.out.println("Casted to int: " + anotherInt); // 9
    // string to number
    String numberStr = "123";
    int parsedInt = Integer.parseInt(numberStr);
    double parsedDouble = Double.parseDouble("45.67");
  }
}
