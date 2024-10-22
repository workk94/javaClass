package com.mybank.hongik;

import java.io.Serializable;

import com.mybank.bank.*;
import com.mybank.user.*;

public class HongikUser extends User implements Serializable{

	//field
	private static final long serialVersionUID = 1L;
	private String userName; // 이름 
	private String ssn; // 주민번호
	public int cnt; // 계좌개수 체크
	private Account[] myAccount;
	
	
	
	public HongikUser(String userName, String ssn) {
		// 주의하것
		super(userName, ssn);
		this.userName = userName;
		this.ssn = ssn;
		this.cnt = 0;
		this.myAccount = new Account[3];
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
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
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
