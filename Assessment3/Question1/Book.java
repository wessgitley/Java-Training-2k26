package Assessment3.Question1;

public class Book extends LibraryItem {
  private int isbn;
  private String genre;

  @Override
  public void displayDetails() {
    super.displayDetails();
    System.out.println("ISBN: " + isbn);
    System.out.println("Genre: " + genre);
  }

  // Getters and Setters
  public int getIsbn() {
    return isbn;
  }

  public void setIsbn(int isbn) {
    this.isbn = isbn;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }
}
