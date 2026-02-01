package Assessment3.Question3;

public abstract class Product {
  protected String name;
  protected double price;
  protected int stock;

  public Product(String name, double price, int stock) throws IllegalArgumentException {
    if (name == null || name.trim().isEmpty()) {
      throw new IllegalArgumentException("Product name cannot be null or empty.");
    }
    if (price < 0) {
      throw new IllegalArgumentException("Product price cannot be negative.");
    }
    if (stock < 0) {
      throw new IllegalArgumentException("Stock level cannot be negative.");
    }
    this.name = name;
    this.price = price;
    this.stock = stock;
  }

  public abstract String getDetails();

  public abstract String getProductType();

  public abstract double calculateDiscount();

  public void updateStock(int quantity) throws OutOfStockException {
    if (stock + quantity < 0) {
      throw new OutOfStockException("Insufficient stock for product: " + name);
    }
    stock += quantity;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public int getStock() {
    return stock;
  }
}
