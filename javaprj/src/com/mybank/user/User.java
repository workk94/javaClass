package com.mybank.user;

import java.io.Serializable;
import java.util.Arrays;

import com.mybank.bank.Account;

public class User implements Serializable{
	
	//field

	private String userName; 
	private String ssn;
	private int cnt = 0;
	private Account[] myAccount; 
	
	public User(String userName, String ssn) {
		this.userName = userName;
		this.ssn = ssn;
		this.myAccount = new Account[3];
	}
	
	public String getUserName() {
		return userName;
	}
	public String getSSN() {
		return ssn;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public Account[] getMyAccount() {
		return myAccount;
	}

	public void setMyAccount(Account[] myAccount) {
		this.myAccount = myAccount;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", ssn=" + ssn + ", cnt=" + cnt + ", myAccount="
				+ Arrays.toString(myAccount) + "]";
	}	
	
}
