import java.util.ArrayList; 

public class Bank {
    
    /* Declare fields */ 
    private ArrayList<Account> accounts = new ArrayList<>(); 

    /* Constructor */ 
    public Bank() {
        
    }

    /* Mutator Methods */ 
    public void addAccount(Account account) {
        accounts.add(account); 
    }

    public Account findAccount(String accountNumber) {

        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account; 
            } 
        }
        return null; 
    }
}