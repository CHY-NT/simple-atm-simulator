public class CheckingAccount extends Account {

    /* Constructor */ 
    public CheckingAccount(String accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance); 
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance() || amount < 0) {
            System.out.println("Invalid input"); 
        } else {
            deductBalance(amount);
        }
    }
}