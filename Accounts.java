class Accounts {
    public static void main(String[] args) {
        SavingsAccount a1 = new SavingsAccount(53664736,"sam","TN","chennai");
        SavingsAccount a2 = new SavingsAccount(67284938,"tom","AP","Hyderabad",55);
        SavingsAccount a3 = new SavingsAccount(64736584,"max","MH","Mumbai");
        SavingsAccount a4 = new SavingsAccount(63729473,"kyle","Goa","Panji",110);
        SavingsAccount a5 = new SavingsAccount(94554545,"carl","MP","Indore",200 );

        a1.deposit(100);
        a1.withdraw(20);
        a1.display();
        a2.withdraw(200);
        a2.display();
        a3.deposit(150);
        a3.withdraw(80);
        a3.display();
        a4.deposit(100);
        a4.withdraw(120);
        a4.display();
        a5.deposit(100);
        a5.withdraw(200);
        a5.display();


    }
}