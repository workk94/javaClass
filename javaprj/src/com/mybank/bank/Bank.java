package com.mybank.bank;

import com.mybank.user.User;
import java.util.ArrayList;

public abstract class Bank implements Transaction{
	
	//field
	private String bankName;
	protected ArrayList<Account> accounts;
	protected ArrayList<User> users;
	
	//constructor
	public Bank(String bankName) {
		this.bankName = bankName;
		this.accounts = new ArrayList<Account>();
		this.users = new ArrayList<User>();
	}
	
	//method
	public abstract void addAccount();
	public abstract Account getAccount();
	
	public String getBankName() {
		return bankName;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public ArrayList<User> getUsers() {
		return users;
	}
	
	

	
}
