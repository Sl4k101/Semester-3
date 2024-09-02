package Lab2.Account;
/**
 * Matthew Cheung 2331037
 */
class SavingAccount extends Account {

    public SavingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void calculateInterest() {
        balance += balance * 0.05; // Apply 5% interest
    }
}
