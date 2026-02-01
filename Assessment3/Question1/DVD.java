package Assessment3.Question1;

public class DVD extends LibraryItem {
  private int duration;
  private int rating;

  @Override
  public void displayDetails() {
    super.displayDetails();
    System.out.println("Duration: " + duration + " minutes");
    System.out.println("Rating: " + rating);
  }

  // Getters and Setters
  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }
}
