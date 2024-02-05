
public class BankTest {
    public static void main(String[] args) {

        Bank bank1 = new Bank();
        System.out.println("Num Accounts: " + bank1.getNumAccounts());
        System.out.println("Account Balance: " + bank1.getAccountNumber());
        System.out.println("Total Balance: " + bank1.getTotalBalance());
        System.out.println("Checking Balance: " + bank1.getCheckingBalance());
        System.out.println("Saving Balance: " + bank1.getSavingBalance());
        System.out.println();

        System.out.println("Deposit to Saving 1500: " + bank1.deposit(1500, "saving"));
        System.out.println("Total Balance: " + bank1.getTotalBalance());
        System.out.println("Checking Balance: " + bank1.getCheckingBalance());
        System.out.println("Saving Balance: " + bank1.getSavingBalance());
        System.out.println();

        System.out.println("Deposit to Checking 2500: " + bank1.deposit(2500, "checking"));
        System.out.println("Total Balance: " + bank1.getTotalBalance());
        System.out.println("Checking Balance: " + bank1.getCheckingBalance());
        System.out.println("Saving Balance: " + bank1.getSavingBalance());
        System.out.println();

        System.out.println("Withdraw from Saving 500: " + bank1.withdraw(500, "saving"));
        System.out.println("Total Balance: " + bank1.getTotalBalance());
        System.out.println("Checking Balance: " + bank1.getCheckingBalance());
        System.out.println("Saving Balance: " + bank1.getSavingBalance());
        System.out.println();

        System.out.println("Withdraw from Checking 1000: " + bank1.withdraw(1000, "checking"));
        System.out.println("Total Balance: " + bank1.getTotalBalance());
        System.out.println("Checking Balance: " + bank1.getCheckingBalance());
        System.out.println("Saving Balance: " + bank1.getSavingBalance());
        System.out.println();

        Bank bank2 = new Bank();
        System.out.println("Num Accounts: " + bank1.getNumAccounts());
        System.out.println("Account Balance: " + bank2.getAccountNumber());
        System.out.println();

        Bank bank3 = new Bank();
        System.out.println("Num Accounts: " + bank1.getNumAccounts());
        System.out.println("Account Balance: " + bank2.getAccountNumber());
    }
}