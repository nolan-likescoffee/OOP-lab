class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        if(balance >= 0)
            this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class EncapsulationBank {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.setAccountNumber(1001);
        acc.setAccountHolder("Cherry");
        acc.setBalance(10000);

        acc.deposit(2000);
        acc.withdraw(5000);

        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Balance: " + acc.getBalance());
    }
}