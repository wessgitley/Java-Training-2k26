package GettingUserInput;

import java.util.Scanner;

public class userinput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Integer: ");
    int num = scanner.nextInt();

    System.out.println("Enter double: ");
    double decimal = scanner.nextDouble();

    System.out.println("Enter boolean(true/false): ");
    boolean flag = scanner.nextBoolean();

    scanner.nextLine(); // clears buffer

    System.out.println("Enter text here: ");
    String text = scanner.nextLine();

    System.out.println("You entered: " + num + "," + decimal + "," + flag + "and" + text);
  }
}
