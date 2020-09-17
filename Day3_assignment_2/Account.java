public class Account {
    long accountNumber;
    double balance;

    Account(){
        /*balance = 0.0;
        System.out.println("Account() Initialized");*/
    }
    
    Account(long accountNumber , double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        //System.out.println("Account() Initialize");
    }

    void withdraw(double amount) {
        System.out.println("withdraws amount");
    }

    void deposit(double amount) {
        System.out.println("deposits amount");
    }

    void accountInformation(){
        System.out.println("Account Number = " + accountNumber);
        System.out.println("Balance = " + balance);
    }
}