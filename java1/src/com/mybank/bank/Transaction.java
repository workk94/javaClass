package com.mybank.bank;

public interface Transaction {
	
	//입금 
	public boolean deposit(String accountNumber, long amount);
	
	//출금 
	public boolean withdraw(String accountNumber, long amount);
	
	//송금 
	public boolean transfer(String fromAccount, String toAccount, long amount);
}
