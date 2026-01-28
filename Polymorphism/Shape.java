package Polymorphism;

class Shape {
  protected String name;

  public Shape(String color) {
    this.name = name;
  }

  public void draw() {
    System.out.println("This is the shape");
  }
}

class Circle extends Shape {
  public Circle(String name) {
    super(name);
  }

  @Override
  public void draw() {
    System.out.println(name + "has been drawn");
  }
}
