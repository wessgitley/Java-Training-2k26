package Abstraction;

public class Car extends Vehicle {
  private int doors; // child class constructor variable

  public Car(String model, int year, int doors) { // constructors declaration
    super(model, year);
    this.doors = doors;
  }

  @Override
  public void start() {
    System.out.println(model + "is starting with a push button");
  }

  @Override
  public void stop() {
    System.out.println(model + "is stopping with brakes");
  }

  // you can add other methods specific to Car class
  public void openTrunk() {
    System.out.println("Trunk is open");
  }

}

// Inherit the abstract class--constructor variables if need be--call the super
// class constructor--declare child class constructors if there are
// any--override the abstract methods each using its own override
// keyword--concatenate the constructor variable in the println statements with
// the rest of the statement--you can add other methods specific to the child
// class.
