public class SavingsAccount extends Account {
    String ifscCode;

    SavingsAccount(long accountNumber, double balance, String ifscCode) {
        super(accountNumber,balance);
        //this.accountNumber = accountNumber;
        //this.balance = balance;
        this.ifscCode = ifscCode;
        System.out.println("SavingsAccount(long,double)");
    }

    void minBalance() {
        System.out.println("You must have min 5000 balance");
    }

    void deposit(double amount){
        //Deposit to your account
        this.balance = this.balance + amount;
    }

    /*void deposit(double amount,long accountNumber){
        System.out.println("deposit(long,double) called");
    }*/
    void withdrawLimit(){
        System.out.println("Withdraw limit in savings is 50000");
    }
    @Override
    void accountInformation(){
        super.accountInformation();
        minBalance();
        withdrawLimit();    
    }
}