package Lab2.Account;
/**
 * Matthew Cheung 2331037
 */
public class BankSystem {
    public static void main(String[] args) {
        Account[] accounts = new Account[4];
        accounts[0] = new CheckingAccount(11, 1000);
        accounts[1] = new CheckingAccount(12, 2000);
        accounts[2] = new SavingAccount(13, 3000);
        accounts[3] = new SavingAccount(14, 4000);

        System.out.println("Initial Account Information:");
        for (Account account : accounts) {
            account.printAccountInfo();
        }

        System.out.println("\nCalculated Interest:");
        for (Account account : accounts) {
            account.calculateInterest();
        }

        System.out.println("\nAccount Information After Interest Calculation:");
        for (Account account : accounts) {
            account.printAccountInfo();
        }
    }
}

