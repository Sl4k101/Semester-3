package Lab2.Account;
/**
 * Matthew Cheung 2331037
 */
abstract class Account {
    int accountNumber = 0;
    double balance = 0;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public abstract void calculateInterest();

    public void printAccountInfo() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}
