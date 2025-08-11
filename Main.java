import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account("John Doe", 1000.0);
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Bank Menu ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    myAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    myAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current Balance: $" + myAccount.getBalance());
                    break;
                case 4:
                    myAccount.printTransactionHistory();
                    break;
                case 5:
                    System.out.println("Exiting. Thank you!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
