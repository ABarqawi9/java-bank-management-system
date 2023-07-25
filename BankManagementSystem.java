import java.time.LocalDate;
import java.util.*;

public class BankManagementSystem {
    private static Scanner input = new Scanner(System.in);
    private static double amount = 69.96;
    private static List<Transaction> transactionHistory = new ArrayList<>();
    private static Queue<CustomerRequest> customerQueue = new LinkedList<>();
    private static Stack<Transaction> transactionStack = new Stack<>();

    public static void main(String[] args) {
        int password = 0;
        while (password != 2120074) {
            System.out.println("Enter your user password: ");
            password = input.nextInt();
            if (password == 2120074) {
                System.out.println("Access Granted");
            }
        }
        boolean continueTransaction = true;
        while (continueTransaction) {
            System.out.println("---Welcome To Bank EL Barqawi---");
            System.out.println("[1] View amount");
            System.out.println("[2] Deposit");
            System.out.println("[3] Withdraw Money");
            int option = input.nextInt();

            if (option == 1) {
                viewAmount();
            } else if (option == 2) {
                deposit();
            } else if (option == 3) {
                recursiveWithdraw();
            }
            System.out.println("Do you want another transaction? (y/n)");
            String choice = input.next();
            if (choice.equalsIgnoreCase("n")) {
                continueTransaction = false;
                System.out.println("--Thank you for using Bank EL Barqawi---");
            }
        }
    }
    public static void viewAmount() {
        System.out.println("YOUR BANK DETAILS");
        System.out.println("Your Current Amount is " + amount);
        String[] accountType = {"Debit", "Credit"};
        System.out.println("Your Account Type is " + accountType[(int) (Math.random() * 2)]);
        System.out.println("Your Card Pin is " + ((int) (Math.random() * 1)) +
                (int) (Math.random() * 2) + (int) (Math.random() * 3) + (int) (Math.random() * 4));
    }
    public static void deposit() {
        double depositAmount = 1.0;
        while (depositAmount != 0) {
            System.out.println("- How much would you like to deposit?");
            System.out.println("- Enter 0 to quit.");
            depositAmount = input.nextDouble();
            amount += depositAmount;
            System.out.println("Your New Amount is " + amount);

            Transaction transaction = new Transaction("Deposit", depositAmount, LocalDate.now(), "Deposit transaction");
            transactionHistory.add(transaction);
            transactionStack.push(transaction);
        }
    }
    public static void recursiveWithdraw() {
        System.out.println("- How much would you like to withdraw?");
        System.out.println("- Enter 0 to quit.");
        double withdrawalAmount = input.nextDouble();

        if (withdrawalAmount == 0) {
            System.out.println("Withdrawal process terminated.");
        } else {
            if (amount < withdrawalAmount) {
                System.out.println("Insufficient funds. Withdrawal failed.");
            } else {
                amount -= withdrawalAmount;
                System.out.println("Your New Amount is " + amount);

                Transaction transaction = new Transaction("Withdrawal", withdrawalAmount, LocalDate.now(), "Withdrawal transaction");
                transactionHistory.add(transaction);
                transactionStack.push(transaction);

                recursiveWithdraw(); 
            }
        }
    }
    public static class Transaction {
        private String transactionType;
        private double amount;
        private LocalDate date;
        private String details;

        public Transaction(String transactionType, double amount, LocalDate date, String details) {
            this.transactionType = transactionType;
            this.amount = amount;
            this.date = date;
            this.details = details;
        }
        // Override
        public String toString() {
            return "Transaction{" +
                    "transactionType='" + transactionType + '\'' +
                    ", amount=" + amount +
                    ", date=" + date +
                    ", details='" + details + '\'' +
                    '}';
        }
    }
    public static class CustomerRequest {
        private String requestType;
        private String details;

        public CustomerRequest(String requestType, String details) {
            this.requestType = requestType;
            this.details = details;
        }
        public String toString() {
            return "CustomerRequest{" +
                    "requestType='" + requestType + '\'' +
                    ", details='" + details + '\'' +
                    '}';
        }
    }
}
