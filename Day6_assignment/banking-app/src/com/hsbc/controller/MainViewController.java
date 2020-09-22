package com.hsbc.controller;

import java.util.Scanner;
import com.hsbc.model.beans.InsufficientBalanceException;
import com.hsbc.model.beans.AccountNotFoundException;
import com.hsbc.model.beans.Account;
import com.hsbc.model.service.AccountService;
import com.hsbc.model.utility.Type;
import com.hsbc.model.utility.UserFactory;

public class MainViewController {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		// This is getting service object
		AccountService service = (AccountService) UserFactory.getInstance(Type.SERVICE);
		int option = 0;
		do {
			System.out.println("*****************************************************************************************");
			System.out.println("1: Store 2: Fetch All 3: Find Account by id 4: Transfer 5: Exit");
			System.out.println("*****************************************************************************************");
			option = scanner.nextInt();
			switch(option) {
			case 1: 
				Account account = new Account();
				System.out.println("Enter customer name");		
				account.setCustomerName(scanner.next());
//				String name = scanner.next();
//				user.setName(name);
				
				System.out.println("Enter Account number");	
				account.setAccountNumber(scanner.nextInt());
				System.out.println("Enter phone no");	
				account.setContactNumber(scanner.nextLong());
				System.out.println("Enter Balance ");
				account.setBalance(scanner.nextDouble());
				Account createdAccount = service.createAccount(account);
				System.out.println("User created with an account number: "+createdAccount.getAccountNumber());
				break;
			case 2: 
				Account[] accounts = service.getAllAccounts();
				for(Account temp : accounts) {
					if(temp!=null)
					System.out.println(temp);
				}
				break;
			case 3:
				System.out.println("Enter Account number");
				try {
					Account userFound = service.getAccountById(scanner.nextInt());
					// print on different device
					System.out.println(userFound);
				} catch (AccountNotFoundException e) {
					// print error on different device
					System.err.println("Error:"+e.getMessage());
				}
				break;
			case 4:
				System.out.println("Enter account Number from , account number to and the amount you want to tranfer");
				int from = scanner.nextInt();
				int to = scanner.nextInt();
				double amount = scanner.nextDouble();
				try {
					Account tranferFunds = service.transfer(from, to, amount);
					System.out.println(tranferFunds);
				} catch(InsufficientBalanceException e) {
					System.err.println("Error: "+e.getMessage());
				}
				catch(AccountNotFoundException e) {
					System.err.println("Error: "+e.getMessage());
				break;
				}
			} 
		}while(option != 6);
		
		scanner.close();
	}

}

