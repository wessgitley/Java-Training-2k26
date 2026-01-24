package Encapsulation;

import javax.management.RuntimeErrorException;

public class BankAccount {

  private String accountNumber;
  private double balance;
  private boolean active = false;

  // normal method ->has no return type
  public BankAccount(double balance, String accountNumber) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public void printInfo() {
    System.out.println(accountNumber + "->" + balance);
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    if (balance >= 0) {
      this.balance = balance;
    } else {
      throw new RuntimeException("Balance cannot be negative");
    }
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public boolean setActive(boolean active) {

  }
}