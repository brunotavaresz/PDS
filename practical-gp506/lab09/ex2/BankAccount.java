package lab09.ex2;

public interface BankAccount {
    
    void deposit(double amount);

    boolean withdraw(double amount);

    double balance();
}