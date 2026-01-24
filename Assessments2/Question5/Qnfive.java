package Assessments2.Question5;

public class Qnfive {
  public static void main(String[] args) {

    // Question 1: What is the difference between method overloading and method
    // overriding?

    // Overloading a method means creating a different method with the same name in
    // the same class, but with a different parameter list.

    // e.g public class Calculator
    // public int sum(int a, int b) {
    // return a + b;
    // public double sum(double a, double b) {
    // return a + b;
    // }

    // Overriding means redefining a method in a subclass that already exists in the
    // superclass.
    // public class Vehicle {
    // public void move() {
    // System.out.println("The vehicle is moving");
    // }
    // }

    // pubic class Car extends Vehicle {
    // @Override
    // public void move() {
    // System.out.println("The car is moving");
    // }

    // Question 2: Why should fields be declared as private in a class?

    // Fields should be declared as private to protect data from unauthorized access
    // e.g private String accountType;

    // Question 3: When should you use the super keyword?

    // The super keyword is used to refer to the immediate parent class object.
    // e.g public class Dog extends Animal {
    // public Dog() {
    // super(); // Calls the constructor of the parent class Animal

    // Question 4:What is the purpose of @override annotation in Java?
    // @Override annotation indicates that a method is intended to override a method
    // in a superclass.

    // e.g public class Animal {
    // public void sound() {
    // System.out.println("Animal makes a sound");
    // }
    // }
    // public class Cat extends Animal {
    // @Override
    // public void sound() {
    // System.out.println("Cat meows");
    // }

    // Question 5: How does encapsulation improve code maintainability?
    // It ensures data integrity by managing how data is accessed and modified.
    // It allows changes to be made to the internal implementation without affecting
    // external code.
  }

}
