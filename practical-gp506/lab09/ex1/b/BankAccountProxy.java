package b;
public class BankAccountProxy implements BankAccount {
    private BankAccount bankAccount;

    public BankAccountProxy(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void deposit(double amount) {
        bankAccount.deposit(amount);
    }

    @Override
    public boolean withdraw(double amount) {
        if (Company.user == User.OWNER) {
            return bankAccount.withdraw(amount);
        } else {
            System.out.println("You don't have permission to withdraw money.");
            return false;
        }
    }

    @Override
    public double balance() {
        if (Company.user == User.OWNER) {
            return bankAccount.balance();
        } else {
            System.out.println("You don't have permission to check the balance.");
            return 0;
        }
    }
}