import java.util.ArrayList;
import java.util.List;

public class BankDemo {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("SAVINGS-1003526718", 450.00, 100.00));
        accounts.add(new CurrentAccount("CURRENT-1004526629", 200.00, 300.00));
        accounts.add(new SavingsAccount("SAVINGS-1003526719", 1100.00, 200.00));
        accounts.add(new CurrentAccount("CURRENT-1004526630", 65.00, 100.00));

        System.out.println("Deposits");
        accounts.get(0).deposit(100.00);
        accounts.get(1).deposit(-30.00);

        System.out.println("\n Withdraw");
        for (Account a : accounts) {
            a.withdraw(450.00);
        }

        System.out.println("\n endOfMonth");
        for (Account a : accounts) {
            a.endOfMonth();
        }

        System.out.println("\n Edge cases");
        System.out.println("-- Savings withdrawal rejected (would go below minimum):");
        accounts.get(2).withdraw(800.00);   
        System.out.println("-- Current account overdraft within limit:");
        accounts.get(3).withdraw(110.00);   

        System.out.println("\n Final balances ");
        for (Account a : accounts) {
            System.out.printf("%s: %.2f%n", a.getAccountNumber(), a.getBalance());
        }
    }
}