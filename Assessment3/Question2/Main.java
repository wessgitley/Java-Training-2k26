package Assessment3.Question2;

public class Main {
  public static void main(String[] args) {
    try { // Test invalid account number
      System.out.println("Testing invalid account number:");
      BankAccount invalidAccount = new BankAccount("", "John Doe", 100.0);
    } catch (InvalidTransactionException e) {
      System.out.println("Caught: " + e.getMessage());
    }

    try { // Create valid account
      BankAccount account = new BankAccount("12345", "John Doe", 100.0);
      System.out.println("Account created successfully: " + account.accountNumber);

      // Test negative deposit
      System.out.println("Testing negative deposit:");
      account.deposit(-50.0);
    } catch (InvalidTransactionException e) {
      System.out.println("Caught: " + e.getMessage());
    }

    try { // Test withdrawal with insufficient funds
      BankAccount account = new BankAccount("12345", "John Doe", 100.0);
      System.out.println("Testing insufficient funds for withdrawal:");
      account.withdraw(150.0);
    } catch (InsufficientFundsException e) {
      System.out.println("Caught: " + e.getMessage());
    }

    try { // Test transfer to null account
      BankAccount account = new BankAccount("12345", "John Doe", 100.0);
      System.out.println("Testing transfer to null account:");
      account.transfer(null, 50.0);
    } catch (AccountNotFoundException | InsufficientFundsException e) {
      System.out.println("Caught: " + e.getMessage());
    }

    try { // Test successful operations
      BankAccount account1 = new BankAccount("12345", "John Doe", 100.0);
      BankAccount account2 = new BankAccount("67890", "Jane Doe", 50.0);
      System.out.println(
          "Before transfer: Account1 balance = " + account1.balance + ", Account2 balance = " + account2.balance);
      account1.transfer(account2, 30.0);
      System.out.println(
          "After transfer: Account1 balance = " + account1.balance + ", Account2 balance = " + account2.balance);
    } catch (Exception e) {
      System.out.println("Unexpected error: " + e.getMessage());
    }
  }
}
