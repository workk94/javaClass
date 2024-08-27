package com.mybank.user;

import java.io.Serializable;
import java.util.Arrays;

import com.mybank.bank.Account;

public class User implements Serializable{
	
	//field
	private String userName; // 이름 
	private String ssn; // 주민번호
	private int cnt = 0;
	private Account[] myAccount = new Account[3]; 
	
	public User(String userName, String ssn, Account[] myAccount) {
		this.userName = userName;
		this.ssn = ssn;
		this.myAccount = myAccount;
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
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", ssn=" + ssn + ", cnt=" + cnt + ", myAccount="
				+ Arrays.toString(myAccount) + "]";
	}	
	
}
