package Assessments2.Question1;

public class Book {

  private String title;
  private String author;
  private String isbn;
  private int price;
  private boolean isAvailable = true;

  public Book(String title, String author, String isbn, int price, boolean isAvailable) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.price = price;
    this.isAvailable = isAvailable;
  }

  public void setTitle() {
    if (title == null) {
      System.out.println("Error: Title cannot be empty");
    }
    return;

  }

  public void setAuthor() {
    if (author == null) {
      System.out.println("Error: Author cannot be empty");
    }
    return;
  }

  public void setISBN() {
    if (isbn != null && isbn.trim().length() == 13) {
      this.isbn = isbn;
    } else {
      System.out.println("Error: Must be exactly 13 digits");
    }
  }

  @Override
  public String toString() {
    return "Title: " + title + "Author: " + author + "Isbn: " + isbn + "Price: " + price + "This is available: "
        + isAvailable;
  }

  public static void main(String[] args) {
    Book deslin = new Book("Dees What", "Banks", "123456789Abde", 999, true);
  }

}