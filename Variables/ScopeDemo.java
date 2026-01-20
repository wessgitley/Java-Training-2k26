package Variables;

public class ScopeDemo {
  static int classVariable = 100;

  // Class-level variable
  public static void main(String[] args) {
    int mainVar = 50; // Local to main method
    if (true) {
      int blockVar = 25; // Only exists in this block
      System.out.println(blockVar);
      System.out.println(mainVar);
    }
    // System.out.println(blockVar); // Error - out of scope
  }

  public static void anotherMethod() {
    // System.out.println(mainVar); // Error - different method
    System.out.println(classVariable); // Class variables accessible everywhere
  }
}
