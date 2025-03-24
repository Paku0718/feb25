package defaultt;

//Abstract class to enforce account operations
abstract class AccountOperations {
 public abstract void deposit(double amount);
 public abstract void withdraw(double amount);
 public abstract void withdraw(double amount, String passcode);
 public abstract void displayBalance();
}

//BankAccount class implementing all OOP concepts
class BankAccount extends AccountOperations {
 private static int accountCounter = 1000; // Static counter for account numbers
 
 private String accountNumber;
 private String accountHolderName;
 private double balance;

 // Default Constructor
 public BankAccount() {
     this.accountNumber = generateAccountNumber();
     this.accountHolderName = "Default User";
     this.balance = 0.0;
 }

 // Parameterized Constructor
 public BankAccount(String accountHolderName, double initialDeposit) {
     this.accountNumber = generateAccountNumber();
     this.accountHolderName = accountHolderName;
     this.balance = initialDeposit;
 }

 // Copy Constructor
 public BankAccount(BankAccount existingAccount) {
     this.accountNumber = generateAccountNumber();
     this.accountHolderName = existingAccount.accountHolderName;
     this.balance = existingAccount.balance;
 }

 // Private synchronized method to generate a unique account number
 private synchronized String generateAccountNumber() {
     return "BA" + (accountCounter++);
 }

 // Getters for Encapsulation
 public String getAccountNumber() {
     return accountNumber;
 }

 public String getAccountHolderName() {
     return accountHolderName;
 }

 public double getBalance() {
     return balance;
 }

 // Static method to display total number of accounts
 public static int getTotalAccounts() {
     return accountCounter - 1000;
 }

 // Deposit money
 @Override
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println(amount + " deposited successfully.");
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 // Overloaded Withdraw method: Withdraw without passcode
 @Override
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println(amount + " withdrawn successfully.");
     } else {
         System.out.println("Insufficient funds or invalid amount.");
     }
 }

 // Overloaded Withdraw method: Withdraw with passcode
 @Override
 public void withdraw(double amount, String passcode) {
     if (passcode.equals("1234")) { // Dummy security check
         withdraw(amount);
     } else {
         System.out.println("Incorrect passcode. Withdrawal failed.");
     }
 }

 // Display balance
 @Override
 public void displayBalance() {
     System.out.println("Account Holder: " + accountHolderName);
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Current Balance: " + balance);
 }
}

//Optional SavingsAccount subclass demonstrating method overriding
class SavingsAccount extends BankAccount {
 private final double minimumBalance = 500.0;

 public SavingsAccount(String accountHolderName, double initialDeposit) {
     super(accountHolderName, initialDeposit);
 }

 @Override
 public void withdraw(double amount) {
     if (getBalance() - amount >= minimumBalance) {
         super.withdraw(amount);
     } else {
         System.out.println("Withdrawal denied! Minimum balance requirement not met.");
     }
 }
}

//Test class
public class BankSimulation {
 public static void main(String[] args) {
     BankAccount acc1 = new BankAccount("John Doe", 1000);
     BankAccount acc2 = new BankAccount("Alice Smith", 500);
     BankAccount acc3 = new BankAccount(acc1); // Copy constructor

     acc1.deposit(500);
     acc1.withdraw(200);
     acc1.withdraw(500, "1234");
     acc1.withdraw(1000, "wrongpass");

     System.out.println("\nAccount Details:");
     acc1.displayBalance();
     acc2.displayBalance();
     acc3.displayBalance();

     System.out.println("\nTotal Accounts Created: " + BankAccount.getTotalAccounts());

     // Testing SavingsAccount
     System.out.println("\nSavings Account Testing:");
     SavingsAccount savings = new SavingsAccount("Emily Davis", 1000);
     savings.withdraw(600);
     savings.withdraw(400); // Should fail due to minimum balance constraint
     savings.displayBalance();
 }
}
