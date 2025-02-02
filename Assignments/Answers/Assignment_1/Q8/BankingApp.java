package Assignments.Answers.Assignment_1.Q8;

abstract class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        double interest = (getBalance() + amount) * (interestRate / 100);
        setBalance(getBalance() + amount + interest);
        System.out.println("Deposited: " + amount + ", Interest: " + interest + ", New Balance: " + getBalance());
    }

    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew: " + amount + ", New Balance: " + getBalance());
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double overdraftLimit) {
        super(accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposited: " + amount + ", New Balance: " + getBalance());
    }

    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew: " + amount + ", New Balance: " + getBalance());
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Account savingsAccount = new SavingsAccount("SA123", 5.0);
        Account currentAccount = new CurrentAccount("CA456", 200.0);
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(200);
        savingsAccount.withdraw(900);
        System.out.println();
        currentAccount.deposit(500);
        currentAccount.withdraw(600);
        currentAccount.withdraw(200);
    }
}
