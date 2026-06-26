import java.util.Scanner; 

public class ATM {
    
    /* Declare fields */ 
    private Bank bank;
    private Account currentAccount = null; 

    private Scanner scanner = new Scanner(System.in); 

    /* Constructor */ 
    public ATM(Bank bank) {
        this.bank = bank; 
    }

    /* Mutator Methods */ 
    public void start() {

        do { 
            System.out.print("Enter an account number: "); 
            String accountNumber = scanner.next(); 
            currentAccount = bank.findAccount(accountNumber); 
            if (currentAccount == null) {
                System.out.println("Account not found"); 
            }
        } while (currentAccount == null);

        showMenu(); 
    }

    public void showMenu() {

        int choice = 0; 

        do {
            System.out.println("Please select a menu option: "); 
            System.out.println("1. Check balance ");
            System.out.println("2. Deposit "); 
            System.out.println("3. Withdraw "); 
            System.out.println("4. View transaction history "); 
            System.out.println("5. Log out "); 
            choice = scanner.nextInt(); 
            switch(choice) {
                case 1: System.out.printf("Balance: $%.2f%n", currentAccount.getBalance()); 
                        break; 
                case 2: System.out.print("Enter the amount to deposit: $");
                        double amount = scanner.nextDouble(); 
                        currentAccount.deposit(amount); 
                        break; 
                case 3: System.out.print("Enter the amount to withdraw: $");
                        double withdrawalAmount = scanner.nextDouble(); 
                        currentAccount.withdraw(withdrawalAmount);
                        break; 
                case 4: System.out.println("Transaction history coming soon"); 
                        break; 
                case 5: System.out.println("Exiting the program"); 
                        currentAccount = null; 
                        break; 
                default: System.out.print("Invalid input");
                        break; 
            }
        } while (choice != 5);
    }
}