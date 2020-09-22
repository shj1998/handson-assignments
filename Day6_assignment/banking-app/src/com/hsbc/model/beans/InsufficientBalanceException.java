package com.hsbc.model.beans;

public class InsufficientBalanceException extends Exception {
	

	public InsufficientBalanceException() {
		super("Sorry Balance Insufficient");
	}
	
	public InsufficientBalanceException(String msg) {
		super(msg);
	}

}
