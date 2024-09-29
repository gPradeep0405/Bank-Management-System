package java_practice;
import java.util.*;

public class BankAccount {
    private int password=12;
    private double balance;  // Changed to double to handle decimal deposits/withdrawals
    
    public BankAccount(double balance, int password) {
        this.balance = balance;
        this.password = password;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("The withdrawal amount exceeds the balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
    public boolean validatePassword(int inputPassword) {
        return this.password == inputPassword;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("                                               Hello Sir Or Mam ");
        System.out.print("                                 Enter a name :   "); 
        String name=sc.nextLine();
        System.out.print("How can I Help you !   "+name);
        System.out.println();
        System.out.print("Enter the initial password to set up the account: ");
        int password = sc.nextInt();
        
        System.out.print("Enter an initial balance: ");
        double balance = sc.nextDouble();
        
        BankAccount account = new BankAccount(balance, password);
        
        System.out.print("Enter the password to access the account: ");
        int inputPassword = sc.nextInt();
        
        if (account.validatePassword(inputPassword)) {
            System.out.print("Enter deposit amount: ");
            double depositAmount = sc.nextDouble();
            account.deposit(depositAmount);
            
            System.out.print("Enter withdrawal amount: ");
            double withdrawAmount = sc.nextDouble();
            account.withdraw(withdrawAmount);
            
            System.out.println("Current balance: " + account.getBalance());
        } else {
        	for (int i=0;i<100;i++){
            System.out.println("Incorrect password.");
            continue ;
        	}
        }
        System.out.println("Thank you sir Have a good day.... "+name);
    }
}
