package Assessment3.Question2;

class InsufficientFundsException extends Exception {
  public InsufficientFundsException(String message) {
    super(message);
  }
}

class InvalidTransactionException extends RuntimeException {
  public InvalidTransactionException(String message) {
    super(message);
  }
}

class AccountNotFoundException extends Exception {
  public AccountNotFoundException(String message) {
    super(message);
  }
}

public class BankAccount {
  String accountNumber;
  String accountHolder;
  double balance;

  public BankAccount(String accountNumber, String accountHolder, double balance) {
    if (accountNumber == null || accountNumber.trim().isEmpty()) {
      throw new InvalidTransactionException("Invalid account number");
    }
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.balance = balance;
  }

  public void deposit(double amount) {
    if (amount <= 0) {
      throw new InvalidTransactionException("Deposit amount must be positive");
    }
    balance += amount;
  }

  public void withdraw(double amount) throws InsufficientFundsException {
    if (amount <= 0) {
      throw new InvalidTransactionException("Withdrawal amount must be positive");
    }
    if (amount > balance) {
      throw new InsufficientFundsException("Insufficient funds for withdrawal");
    }
    balance -= amount;
  }

  public void transfer(BankAccount toAccount, double amount)
      throws InsufficientFundsException, AccountNotFoundException {
    if (toAccount == null) {
      throw new AccountNotFoundException("Target account not found");
    }
    this.withdraw(amount);
    toAccount.deposit(amount);
  }

}
