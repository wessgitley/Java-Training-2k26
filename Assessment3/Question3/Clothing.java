package Assessment3.Question3;

public class Clothing extends Product {
  private String size;
  private String material;

  public Clothing(String name, double price, int stock, String size, String material) throws IllegalArgumentException {
    super(name, price, stock);
    if (size == null || size.trim().isEmpty()) {
      throw new IllegalArgumentException("Size cannot be null or empty.");
    }
    if (material == null || material.trim().isEmpty()) {
      throw new IllegalArgumentException("Material cannot be null or empty.");
    }
    this.size = size;
    this.material = material;
  }

  @Override
  public String getDetails() {
    return "Clothing - Name: " + name + ", Price: $" + price + ", Stock: " + stock +
        ", Size: " + size + ", Material: " + material;
  }

  @Override
  public String getProductType() {
    return "Clothing";
  }

  @Override
  public double calculateDiscount() {
    // Example: 15% discount for clothing
    return price * 0.15;
  }

  public String getSize() {
    return size;
  }

  public String getMaterial() {
    return material;
  }
}
