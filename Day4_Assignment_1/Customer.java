public class Customer extends Register {
    private long accountNumber;
    private double balance;

    public Customer (String name,String dob,String gender,long phone,Address add,long accountNumber,double balance){
        super(name,dob,gender,phone,add);
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    
    public void updateBalance(double amount){
        this.balance = this.balance + amount;
        System.out.println("Amount deposited = " + amount);
    }

    /*public void withdraw(double amount){
        if(amount > getBalance()){
            System.out.println("Insufficient Funds");
        }
        else {
            System.out.println(" Account withrawn is = "+ amount);
            setBalance(getBalance() - amount);
        }
    }*/

    @Override
    public void displayInformation(){
        System.out.println("Account Number = " + accountNumber + " Balance = " + balance + " Name = " + name + " Dob = " + dob + " gender = " +  gender + " phone = " + phone);
        System.out.println("State = " + add.state + "City = " + add.city + "Pin = " + add.pin);
    }

}