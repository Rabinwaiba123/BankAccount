public class Main {
    public static void main(String[] args) {
        // Creating bank account objects
        BankAccount account1 = new BankAccount("Alice", 1500.00);
        BankAccount account2 = new BankAccount("Bob", 3000.00);
        BankAccount account3 = new BankAccount("Charlie", 500.00);

        // Displaying account information
        account1.displayAccountInfo();
        account2.displayAccountInfo();
        account3.displayAccountInfo();

        // Performing some transactions
        account1.deposit(200.00); // Alice deposits $200
        account2.withdraw(1000.00); // Bob withdraws $1000
        account3.deposit(300.00); // Charlie deposits $300

        // Displaying updated account information
        System.out.println("\nUpdated Account Information:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();
        account3.displayAccountInfo();

        // Displaying total number of accounts
        BankAccount.displayTotalAccounts();
    }
}
