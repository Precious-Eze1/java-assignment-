import java.util.Scanner;

public class ATM {
    static double balance = 1000;
    static Scanner sc = new Scanner(System.in);

    public static void checkBalance() {
        System.out.println("Balance: $" + balance);
    }

    public static void deposit() {
        System.out.print("Amount to deposit: ");
        double amt = sc.nextDouble(); sc.nextLine();
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposited.");
        } else System.out.println("Invalid amount.");
    }

    public static void withdraw() {
        System.out.print("Amount to withdraw: ");
        double amt = sc.nextDouble(); sc.nextLine();
        if (amt <= balance && amt > 0) {
            balance -= amt;
            System.out.println("Withdrawn.");
        } else System.out.println("Insufficient funds or invalid.");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Check 2. Deposit 3. Withdraw 4. Exit");
            int choice = sc.nextInt(); sc.nextLine();
            switch (choice) {
                case 1 -> checkBalance();
                case 2 -> deposit();
                case 3 -> withdraw();
                case 4 -> System.exit(0);
            }
        }
    }
}