package bankapp;

public class Account {
    
    private String number;
    private double balance;
    
    public Account(String newNumber) {
        this.number = newNumber;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }
    
    public void withdraw(double amount) {
        balance -= amount;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    
}
