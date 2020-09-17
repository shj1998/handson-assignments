public class MainBank {
    public static void main(String[] args) {
        //pass the accountNo and amount to deposit from CLA
        //get the Account using the accountNo by calling getAccount(...)
        // if accountNo is wrong show the error message and must not perform any below
        // operation
        
        // show the account information before deposit
        //deposit the amount to that particular Account
        //show the account information after deposit
        long accountNumber1 = Long.parseLong(args[0]);
        long accountNumber2 = Long.parseLong(args[1]);
        double depositAmount = Double.parseDouble(args[2]);

        Account withdrawAccount = getAccount(accountNumber1);
        Account destAccount = getAccount(accountNumber2);
        if(withdrawAccount == null || destAccount == null){
            System.out.println("Account Number not valid");
        }
        else{
            withdrawAccount.accountInformation();
            destAccount.accountInformation();
            if(depositAmount > withdrawAccount.balance){
                System.out.println("Insufficient Amount");
            }
            else{
                withdrawAccount.withdraw(depositAmount);
                destAccount.deposit(depositAmount);
            }
            withdrawAccount.accountInformation();
            destAccount.accountInformation();
        }
    }

    // pass the accountNO and get the Account from Accounts[] 
    public static Account getAccount(long accountNo) {
        Account[] accounts = AccountsDB.getAccounts();
        
        Account account = null;
        // get the account from accounts using the accountNo

        for(int i=0; i < accounts.length; i++){
            if(accounts[i].accountNumber == accountNo){
                account = accounts[i];
            }

        }
        return account;
    }
}