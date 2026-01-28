package Abstraction;

public class AbstractionDemo {
  public static void main(String[] args) {
    // cannot instantiate an abstract class but you can use polymorphic references
    Vehicle car = new Car("Maybach S680", 2024, 4);
    Vehicle motorcycle = new Motorcycle("S 1000 RR", 2024);
    // polymorphic behaviour
    car.start();
    car.stop();
    car.displayInfo();
    motorcycle.start();
    motorcycle.displayInfo();

    // call the static method on abstract class
    Vehicle.vehicleInfo(); // if such a method existed

    // Array of vehicles -polymorphism in action
    Vehicle[] vehicle = { car, motorcycle };
    for (Vehicle v : vehicles) {
      v.start(); // different behaviours based on the object type
    }
  }
}
