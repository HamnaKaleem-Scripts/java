import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
	}
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Available balance: $" + balance);
        }
        balance -= amount;
        System.out.println(amount + " withdrawn. Total balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}
public class BankSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     
        System.out.print("enter account number: ");
        String acc = input.nextLine();
        BankAccount x = new BankAccount(acc, 0);      
        System.out.print("enter  amount to be deposited: ");
        double am = input.nextDouble();
        x.deposit(am);
        System.out.print("enter amount to withdraw: ");
        double amount = input.nextDouble();    
        try {
            x.withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
        }
    }
}