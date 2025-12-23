import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    Account() {
        dateCreated = new Date();
    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    void setAnnualInterestRate(double rate) {
        annualInterestRate = rate;
    }

    double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100;
    }

    double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void deposit(double amount) {
        balance += amount;
    }

    double getBalance() {
        return balance;
    }

    Date getDateCreated() {
        return dateCreated;
    }
}
