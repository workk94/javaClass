package com.mybank.bank;

import com.mybank.user.User;
import java.util.ArrayList;

public abstract class Bank implements Transaction{
	
 	private String bankName; //은행 이름
	protected ArrayList<User> users; // 계좌 리스트 
	protected ArrayList<Account> accounts; //유저 리스트
	  
	public Bank() {
		super();
	}
	
	public Bank(String bankName) {
		this.bankName = bankName;
		this.accounts = new ArrayList<Account>();
		this.users = new ArrayList<User>();
	}
	
	public abstract void addAccount();
	public abstract void addAccount(Account account);
	public abstract Account[] getAccount();
	public abstract Account getAccount(String accountNumber);
	
	public String getBankName() {
		return bankName;
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}
}
