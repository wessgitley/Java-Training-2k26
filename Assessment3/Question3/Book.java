package Assessment3.Question3;

public class Book extends Product {
  private String author;
  private String genre;

  public Book(String name, double price, int stock, String author, String genre) throws IllegalArgumentException {
    super(name, price, stock);
    if (author == null || author.trim().isEmpty()) {
      throw new IllegalArgumentException("Author cannot be null or empty.");
    }
    if (genre == null || genre.trim().isEmpty()) {
      throw new IllegalArgumentException("Genre cannot be null or empty.");
    }
    this.author = author;
    this.genre = genre;
  }

  @Override
  public String getDetails() {
    return "Book - Name: " + name + ", Price: $" + price + ", Stock: " + stock +
        ", Author: " + author + ", Genre: " + genre;
  }

  @Override
  public String getProductType() {
    return "Book";
  }

  @Override
  public double calculateDiscount() {
    // Example: 10% discount for books
    return price * 0.10;
  }

  public String getAuthor() {
    return author;
  }

  public String getGenre() {
    return genre;
  }
}
