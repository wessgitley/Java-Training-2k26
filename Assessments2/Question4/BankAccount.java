package Assessments2.Question4;

public class BankAccount {
  private String accountNumber;
  private double balance;
  private String accountHolder;

  public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.balance = initialBalance;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public double myBalance() {
    return balance;
  }

  public String getAccountHolder() {
    return accountHolder;
  }

  public void setAccountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
  }

  public void accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public void balance(double balance) {
    this.balance = balance;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposited: " + amount);
    } else {
      System.out.println("Deposit amount must be positive.");
    }
  }

  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdrew: " + amount);
    } else {
      System.out.println("Insufficient funds or invalid amount.");
    }
  }

  public void getBalance() {
    System.out.println("Current balance: " + balance);
  }

}
