public abstract class Account {
    
    /* Declare fields */ 
    private String accountNumber;
    private String ownerName;
    private double balance; 

    /* Constructor */ 
    public Account(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber; 
        this.ownerName = ownerName; 
        this.balance = balance; 
    }

    /* Getter Methods */ 
    public String getAccountNumber() {
        return accountNumber; 
    }

    public String getOwnerName() {
        return ownerName; 
    }

    public double getBalance() {
        return balance; 
    }

    /* Mutator Method */ 
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
        } else {
            balance += amount; 
        }
    }

    protected void deductBalance(double amount) {
        balance -= amount; 
    }

    /* Abstract Method */ 
    public abstract void withdraw(double amount); 
}