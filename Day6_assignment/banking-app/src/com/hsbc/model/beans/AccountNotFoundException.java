package com.hsbc.model.beans;

// Add constructors inside AccountNotFoundException
public class AccountNotFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AccountNotFoundException() {
		super("Sorry Acoount not found");
	}
	
	public AccountNotFoundException(String msg) {
		super(msg);
	}

}
