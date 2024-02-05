import java.util.Random;

public class Bank {
    private static int numAccounts = 0;
    private static int totalAmountOfMoney = 0;

    private double checkingBalance;
    private double savingBalance;
    private String accountNumber;

    public Bank(){
        this.numAccounts++;
        this.accountNumber = getRandomAccountNumber();
    }

    public Bank(String accountNumber){
        this.numAccounts++;
        this.accountNumber = accountNumber;
    }

    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingBalance(){
        return this.savingBalance;
    }

    public int getNumAccounts() {
        return numAccounts;
    }

    public boolean deposit(double moneyAmount, String accountName) {
        if(accountName == "saving") {
            this.savingBalance += moneyAmount;
        } else if(accountName == "checking") {
            this.checkingBalance += moneyAmount;
        } else {
            System.out.println("No account found!");
            return false;
        }
        this.totalAmountOfMoney += moneyAmount;
        return true;
    }

    public boolean withdraw(double moneyAmount, String accountName) {
        if(accountName == "saving" && this.savingBalance >= moneyAmount) {
            this.savingBalance -= moneyAmount;
        } else if(accountName == "checking" && this.checkingBalance >= moneyAmount) {
            this.checkingBalance -= moneyAmount;
        } else {
            System.out.println("Not enough money!");
            return false;
        }
        this.totalAmountOfMoney -= moneyAmount;
        return true;
    }

    public double getTotalBalance() {
        return this.totalAmountOfMoney;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    private String getRandomAccountNumber() {
        String accountNumber = "";
        for (var i = 0 ;i <= 7; i++) {
            accountNumber = accountNumber + getRandomLetter();
        }
        return accountNumber;
    }

    private char getRandomLetter(){
        Random random = new Random();
        char [] letters = {'a', 'b', 'c', 'd', 'e','f', 'g', 'h', 'i', 'j','k', 'l', 'm', 'n', 'o','p', 'q', 'r', 's', 't','u', 'v', 'w', 'x', 'y','z','1','2','3','4','5','6','7','8','9','0'}; 
        int val = random.nextInt(36);  
        char randomchar = letters[val];
        return  randomchar;
    }
}