package Assessment3.Question1;

public class LibraryItem {

  private int itemId;
  private String title;
  private String author;
  private boolean isAvailable;

  public void checkOut() {
    System.out.println("Item has been checked out.");
  }

  public void returnItem() {
    System.out.println("Item has been returned.");
  }

  public void displayDetails() {
    System.out.println("Item ID: " + itemId);
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Available: " + isAvailable);
  }

  // Getters and Setters for encapsulation
  public int getItemId() {
    return itemId;
  }

  public void setItemId(int itemId) {
    this.itemId = itemId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public boolean isAvailable() {
    return isAvailable;
  }

  public void setAvailable(boolean available) {
    isAvailable = available;
  }
}
