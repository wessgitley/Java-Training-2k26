package Abstraction;

//Abstract classes cant be instantiated

public abstract class Vehicle {
  protected String model; // constructor variable
  protected int year; // constructor variable

  public Vehicle(String model, int year) { // constructor declaration
    this.model = model;
    this.year = year;
  }

  // concrete method
  public void displayInfo() {
    System.out.println(model + " " + year);
  }

  // abstract methods -no implementation, must be overidden in subclass
  public abstract void start();

  public abstract void stop();

  // Can have both concrete and abstract and concrete methods
  public void honk() { // concrete method
    System.out.println("Beep Beep!");
  }
}

// Create abtract class--constructor variables--constructor
// declaration--concrete methods or abstract methods(cant have a body)--you can
// also involve both concrete and abstract methods in the same class.
