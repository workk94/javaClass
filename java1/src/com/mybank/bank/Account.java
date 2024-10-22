package com.mybank.bank;

import java.io.Serializable;

public class Account implements Serializable{
	private String accountNumber; // 계좌번호
	private long accountBalance; // 계좌금액
	private String accountPassword; // 비밀번호
	
	public Account() {
		super();
	}

	@Override
	public String toString() {
		return " 계좌번호 : " + this.accountNumber + "\n계좌금액 : " + this.accountBalance + "\n";
	}

	
	public String getAccountNumber() {
		return accountNumber;
	}

	public long getAccountBalance() {
		return accountBalance;
	}

	public String getAccountPassword() {
		return accountPassword;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}


	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	
}
