package Encapsulation;

public class Main {
  BankAccount bankAccount = new BankAccount(1000.0, "001")

 //  bankAccount.balance = -1000;
  bankAccount.setBalance(1000.0);
  bankAccount.printInfo();
  bankAccount.setActive(true);

  System.out.println(bankAccount.getBalance());

}
