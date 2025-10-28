public class BankAccount {
    // Instance variables for account details
    private String accountHolder;
    private double balance;

    // Static variable to track the total number of bank account
    static int totalAccounts = 0;

    // Constructor to initialize the account with an account holder and an initial balance
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        totalAccounts++; // Increment the static variable each time a new account is created
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into " + accountHolder + "'s account.");
        }else{
            System.out.println("Deposit amount must be positive");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from " + accountHolder + "'s account.");
        }else{
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

    // Static method to display the total number of accounts
    public static void displayTotalAccounts() {
        System.out.println("Total Accounts Created: " + totalAccounts);
    }
}