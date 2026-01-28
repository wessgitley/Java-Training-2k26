package Abstraction;

public abstract class DatabaseConnection {
  protected String url;
  protected String username;

  // common implementation
  protected void logConnection() {
    System.out.println("Connecting to: " + url);
  }

  // Template methods with common flow
  public final void connect() {
    logConnection();
    establishConnection();
    initialize();
  }

  // subclasses provide specific implementations
  protected abstract void establishConnection();

  protected abstract void initialize();

}
