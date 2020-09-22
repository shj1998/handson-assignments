package com.hsbc.model.service;


import com.hsbc.model.beans.Account;
import com.hsbc.model.beans.AccountNotFoundException;
import com.hsbc.model.beans.InsufficientBalanceException;
import com.hsbc.model.dao.AccountDao;
import com.hsbc.model.utility.Type;
import com.hsbc.model.utility.UserFactory;

public class AccountServiceImpl implements AccountService {
	
	private AccountDao dao;
	public AccountServiceImpl() {
		// this is the way you get different instance
		dao = (AccountDao)UserFactory.getInstance(Type.DAO);
	}
	@Override
	public Account createAccount(Account account) {
		
		Account createdAccount =  dao.store(account);
		return createdAccount;
	}
	
	@Override
	public Account[] getAllAccounts() {
		// no business validations
		return dao.fetchAccouts();
	}
	
	@Override
	public Account getAccountById(int accountNumber) throws AccountNotFoundException {
		Account account = dao.fetchAccountById(accountNumber);
		if(account == null) {
			throw new AccountNotFoundException("Sorry user with an id "+accountNumber+" not found");
		}
		return account;
	}
	@Override
	public Account transfer(int from, int to, double amount) throws AccountNotFoundException, InsufficientBalanceException {
		Account From = this.getAccountById(from);
		Account To = this.getAccountById(to);
		if(amount > From.getBalance()) {
			throw new InsufficientBalanceException("Sorry Account with id" + from + " does not have sufficient funds");
		}
		From.setBalance(From.getBalance() - amount);
		To.setBalance(To.getBalance() + amount);
		
		dao.updateAccount(to, To);
		return dao.updateAccount(from, From);
	}

}
