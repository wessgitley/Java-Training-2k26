package Assessment3.Question3;

public class Electronics extends Product {
  private int warrantyPeriod;
  private String powerConsumption;

  public Electronics(String name, double price, int stock, int warrantyPeriod, String powerConsumption)
      throws IllegalArgumentException {
    super(name, price, stock);
    if (warrantyPeriod < 0) {
      throw new IllegalArgumentException("Warranty period cannot be negative.");
    }
    if (powerConsumption == null || powerConsumption.trim().isEmpty()) {
      throw new IllegalArgumentException("Power consumption cannot be null or empty.");
    }
    this.warrantyPeriod = warrantyPeriod;
    this.powerConsumption = powerConsumption;
  }

  @Override
  public String getDetails() {
    return "Electronics - Name: " + name + ", Price: $" + price + ", Stock: " + stock +
        ", Warranty: " + warrantyPeriod + " months, Power Consumption: " + powerConsumption;
  }

  @Override
  public String getProductType() {
    return "Electronics";
  }

  @Override
  public double calculateDiscount() {
    // Example: 20% discount for electronics
    return price * 0.20;
  }

  public int getWarrantyPeriod() {
    return warrantyPeriod;
  }

  public String getPowerConsumption() {
    return powerConsumption;
  }
}
