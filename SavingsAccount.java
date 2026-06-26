public class SavingsAccount extends Account {
    
    /* Declare fields */ 
    private int withdrawalCount = 0; 

    /* Constructor */ 
    public SavingsAccount(String accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }

    /* Mutator Method */ 
    @Override
    public void withdraw(double amount) {
        if (amount > getBalance() || amount < 0) {
            System.out.println("Invalid input"); 
        } else if (withdrawalCount == 3) {
            System.out.println("Withdrawal limit reached. Maximum 3 withdrawals per session."); 
        } else {
            deductBalance(amount);
            withdrawalCount++; 
        }
    }
}