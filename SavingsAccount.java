class SavingsAccount {
    long accNo;
    double balance;
    String name; 
    String state; 
    String city;
    String ifsc;
    int pin;
    
    SavingsAccount(long a, String n, String s, String c){
        accNo = a;
        name = n;
        state = s;
        city = c;
        ifsc = "HSBC001";
        balance = 0.00;
    }

    SavingsAccount(long a, String n, String s, String c, double b){
        accNo = a;
        name = n;
        state = s;
        city = c;
        ifsc = "HSBC001";
        balance = b;
    }

    void deposit(long amt){
        balance = balance + amt;
        System.out.println("Deposited Amount = " + amt + " new Balance = " + balance);

    }

    void withdraw(long amt){
        if(amt > balance){
            System.out.println("Insuficient Funds");
        }
        else{
            balance = balance - amt;
            System.out.println("Withdrawn Amount = " + amt + " new Balance = " + balance);
        }
    }

    void display(){
        System.out.println("Name = " + name + ", Account no = " + accNo + " Balance = " + balance +" State = " + state + " City = "+ city + " ifsc code = " + ifsc);
        System.out.println("-------------------------------");
    }
}