public class Main {
    public static void main (String[] args) {
        
        Bank bank = new Bank(); 

        CheckingAccount cAccount1 = new CheckingAccount("CHA001", "Joe Mamah", 1000.00); 
        SavingsAccount sAccount1 = new SavingsAccount("SAA001", "Mamah Joe", 500.00);

        bank.addAccount(cAccount1);
        bank.addAccount(sAccount1); 

        ATM atm = new ATM(bank);

        atm.start(); 
    }
}
