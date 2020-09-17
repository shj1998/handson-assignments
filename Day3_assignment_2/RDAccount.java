public class RDAccount extends Account {
    String[] schedules = {"Monthly", "Quarterly", "Yearly"};

    RDAccount(long accountNumber,double balance){
        super(accountNumber, balance);
        //this.accountNumber = accountNumber;
        //this.balance = balance;
        //System.out.println("RDAccount(long,double)");
    }
    void interestRate(){
        System.out.println("7.5% interest in a year");
    }

    void deposit(double amount){
        //Deposit to your account
        this.balance = this.balance + amount;
    }
    
    void withdraw(double amount){
        if(amount > this.balance){
            System.out.println("Insufficient Funds");
        }
        else{
            this.balance = this.balance - amount;
        }
    }

    void schedulesList() {
        System.out.print("Schedule ");
        for(String s : schedules){
            System.out.print(s + " ");
        }
        System.out.println();
    }

    /*@Override
    void accountInformation(){
        super.accountInformation();
        schedulesList();
    }*/
}