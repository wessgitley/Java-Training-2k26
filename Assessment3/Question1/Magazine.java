package Assessment3.Question1;

public class Magazine extends LibraryItem {
  private int issueNumber;
  private String publicationDate;

  @Override
  public void displayDetails() {
    super.displayDetails();
    System.out.println("Issue Number: " + issueNumber);
    System.out.println("Publication Date: " + publicationDate);
  }

  // Getters and Setters
  public int getIssueNumber() {
    return issueNumber;
  }

  public void setIssueNumber(int issueNumber) {
    this.issueNumber = issueNumber;
  }

  public String getPublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(String publicationDate) {
    this.publicationDate = publicationDate;
  }
}
