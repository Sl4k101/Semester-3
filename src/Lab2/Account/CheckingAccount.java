package Lab2.Account;
/**
 * Matthew Cheung 2331037
 */
class CheckingAccount extends Account {

    public CheckingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void calculateInterest() {
        balance += balance * 0.02; // Apply 2% interest
    }
}
