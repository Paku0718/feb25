// Abstract class to demonstrate Abstraction
abstract class AccountOperations {
    public abstract boolean deposit(double amount);
    public abstract boolean withdraw(double amount);
    public abstract boolean withdraw(double amount, String passcode);
    public abstract void displayBalance();
}

// Main class that implements the abstract class
public class BankAccount extends AccountOperations {
    // Private instance variables for Encapsulation
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private final String securityPasscode;
    
    // Static member to track total accounts
    private static int totalAccounts = 0;
    
    // Default Constructor
    public BankAccount() {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = "Default User";
        this.balance = 0.0;
        this.securityPasscode = "1234"; // Default passcode
        totalAccounts++;
        System.out.println("New account created with default values.");
    }
    
    // Parameterized Constructor
    public BankAccount(String accountHolderName, double initialDeposit, String passcode) {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit;
        this.securityPasscode = passcode;
        totalAccounts++;
        System.out.println("New account created for " + accountHolderName + " with initial deposit of $" + initialDeposit);
    }
    
    // Copy Constructor
    public BankAccount(BankAccount otherAccount) {
        this.accountNumber = generateAccountNumber(); // Generate a new account number
        this.accountHolderName = otherAccount.getAccountHolderName();
        this.balance = otherAccount.getBalance();
        this.securityPasscode = otherAccount.securityPasscode;
        totalAccounts++;
        System.out.println("Account cloned for " + accountHolderName);
    }
    
    // Private method to generate a unique account number
    private String generateAccountNumber() {
        // Simple account number generation logic
        return "ACC" + System.currentTimeMillis() % 10000;
    }
    
    // Method to display the total number of accounts (Static Method)
    public static void displayTotalAccounts() {
        System.out.println("Total number of accounts: " + totalAccounts);
    }
    
    // Implementation of abstract methods
    @Override
    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
            return true;
        } else {
            System.out.println("Deposit amount must be positive.");
            return false;
        }
    }
    
    // Method Overloading for withdraw (Compile-time Polymorphism)
    @Override
    public boolean withdraw(double amount) {
        System.out.println("Security passcode required for withdrawals.");
        return false;
    }
    
    @Override
    public boolean withdraw(double amount, String passcode) {
        if (!this.securityPasscode.equals(passcode)) {
            System.out.println("Invalid security passcode.");
            return false;
        }
        
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        }
        
        if (amount > this.balance) {
            System.out.println("Insufficient funds.");
            return false;
        }
        
        this.balance -= amount;
        System.out.println("$" + amount + " withdrawn successfully.");
        return true;
    }
    
    @Override
    public void displayBalance() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder: " + this.accountHolderName);
        System.out.println("Current Balance: $" + this.balance);
    }
    
    // Getter methods for encapsulated fields
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public double getBalance() {
        return balance;
    }
    
    // Main method to test the implementation
    public static void main(String[] args) {
        // Creating accounts using different constructors
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount("John Doe", 1000.0, "5678");
        BankAccount account3 = new BankAccount(account2);
        
        // Testing operations
        System.out.println("\nTesting account operations:");
        account2.displayBalance();
        
        System.out.println("\nDepositing $500:");
        account2.deposit(500.0);
        account2.displayBalance();
        
        System.out.println("\nWithdrawing without passcode:");
        account2.withdraw(200.0);
        
        System.out.println("\nWithdrawing with incorrect passcode:");
        account2.withdraw(200.0, "1234");
        
        System.out.println("\nWithdrawing with correct passcode:");
        account2.withdraw(200.0, "5678");
        account2.displayBalance();
        
        // Displaying total number of accounts
        System.out.println("\nAccount statistics:");
        BankAccount.displayTotalAccounts();
    }
}

// Optional SavingsAccount subclass to demonstrate Inheritance and Method Overriding
class SavingsAccount extends BankAccount {
    private final double minimumBalance;
    
    public SavingsAccount(String accountHolderName, double initialDeposit, String passcode, double minimumBalance) {
        super(accountHolderName, initialDeposit, passcode);
        this.minimumBalance = minimumBalance;
        System.out.println("Savings account created with minimum balance requirement of $" + minimumBalance);
    }
    
    // Method Overriding (Runtime Polymorphism)
    @Override
    public boolean withdraw(double amount, String passcode) {
        // Check if withdrawal would bring balance below minimum
        if (getBalance() - amount < minimumBalance) {
            System.out.println("Cannot withdraw. Minimum balance of $" + minimumBalance + " must be maintained.");
            return false;
        }
        
        // If minimum balance is maintained, use parent class method
        return super.withdraw(amount, passcode);
    }
    
    // Main method to test the SavingsAccount subclass
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("Jane Doe", 1000.0, "9876", 500.0);
        
        System.out.println("\nTesting savings account operations:");
        savingsAccount.displayBalance();
        
        System.out.println("\nTrying to withdraw $600 (would break minimum balance):");
        savingsAccount.withdraw(600.0, "9876");
        
        System.out.println("\nTrying to withdraw $400 (maintains minimum balance):");
        savingsAccount.withdraw(400.0, "9876");
        savingsAccount.displayBalance();
        
        // Displaying total number of accounts
        System.out.println("\nAccount statistics:");
        BankAccount.displayTotalAccounts();
    }