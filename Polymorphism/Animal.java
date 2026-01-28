package Polymorphism;

class Animal {
  protected String name;

  public Animal(String name) { // constructor name is same as class name
    this.name = name;
  }

  public void makeSound() { // method
    System.out.println("Animal makes a sound");
  }

  public void sleep() {
    System.out.println(name + " is sleeping");
  }
}

class Dog extends Animal {
  public Dog(String name) { // declaration of constructor. Constructor name is same as class name
    super(name); // calls the constructor of the parent class
  }

  @Override // overriding the makeSound method
  public void makeSound() {
    System.out.println(name + " says woof woof");
  }
}

class Cat extends Animal {
  public Cat(String name) {
    super(name);
  }

  @Override // overriding the makeSound method
  public void makeSound() {
    System.out.println(name + " says meow meow");
  }
}

// Main class--variable--declare the constructor--method that prints the
// stmts--inheritance--declare the parent class constructor with the same class
// name and call it using the super keyword
// name as the child class--override the method of the parent class--inside the
// println, concatenate the constructor variable with the rest of the statement.