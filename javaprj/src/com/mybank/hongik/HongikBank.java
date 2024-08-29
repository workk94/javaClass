package com.mybank.hongik;

import java.io.Serializable;
import java.util.ArrayList;

import com.mybank.bank.Account;
import com.mybank.bank.*;


public class HongikBank extends Bank implements Serializable{

	private static final long serialVersionUID = 1L;
	private String bankName;
	private ArrayList<HongikUser> users; // User 동적배열
	// 현재 유저의 선택된 계좌의 인덱스값
	private int accountIndex;
	// 현재 유저의 인덱스위치
	private int userIndex;
	private String accountNum;
	
	public HongikBank() {
		this.bankName = "홍익";
		this.users = new ArrayList<HongikUser>();
	}
	
	public HongikBank(String bankName) {
		super(bankName);
		this.bankName = bankName;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean deposit(String accountNumber, long amount) {
		// TODO Auto-generated method stub
		// 현재 계좌에 있는 잔액
		long preBalance = users.get(userIndex).getMyAccount()[accountIndex].getAccountBalance();
		users.get(userIndex).getMyAccount()[accountIndex].setAccountBalance(amount + preBalance);
		return true;
	}

	@Override
	public boolean withdraw(String accountNumber, long amount) {
		// TODO Auto-generated method stub
		long preBalance = users.get(userIndex).getMyAccount()[accountIndex].getAccountBalance();
		if (preBalance < amount) {
			return false;
		} else {
			users.get(userIndex).getMyAccount()[accountIndex].setAccountBalance(preBalance - amount);
			return true;
		}
	}

	@Override
	public boolean transfer(String fromAccount, String toAccount, long amount) {
		// TODO Auto-generated method stub
		if (withdraw(fromAccount, amount)) {
			for (int i = 0; i < users.size(); i++) {
				for (int j = 0; j < users.get(i).getCnt(); j++) {
					if (users.get(i).getMyAccount()[j].getAccountNumber().equals(toAccount)) {
						long preBalance = users.get(i).getMyAccount()[j].getAccountBalance();
						users.get(i).getMyAccount()[j].setAccountBalance(preBalance + amount);
						return true;
					}
				}
			}
		}
		return false;
	}

	
	public void addAccount(Account account) {
		// TODO Auto-generated method stub
		users.get(userIndex).getMyAccount()[users.get(userIndex).cnt - 1] = account;
	}
	
	
	
	@Override
	// 계좌를 뽑아내면서 초기값도 동시에 설정
	public Account getAccount(String accountNumber) {
		// TODO Auto-generated method stub
		// 유저의 수만큼 반복
		for (int i = 0; i < users.size(); i++) {
			// 해당 유저의 계좌의 개수만큼 반복
			for (int j = 0; j < users.get(i).getCnt(); j++) {
				if (users.get(i).getMyAccount()[j].getAccountNumber().equals(accountNumber)) {
					userIndex = i;
					accountIndex = j;
					return users.get(i).getMyAccount()[j];
				}
			}
		}
		// 해당하는것이 없다면
		return null;
	}
	
	// 현재 포인팅된 계좌의 잔액 조회
	public long getBalance() {
		return users.get(userIndex).getMyAccount()[accountIndex].getAccountBalance();
	}
	
	
	public Account[] getAccount() {
		return users.get(userIndex).getMyAccount();
	}
	
	public void AccountReference() {
		for (Account i : this.getAccount()) {
			if (i != null) {
				System.out.println();
				System.out.println("----------------------------");
				System.out.println(" 계좌번호 : " + i.getAccountNumber());
				System.out.println(" 잔액 : " + i.getAccountBalance());
				System.out.println("----------------------------");
			}
		}
	}
	
	public void allAccountReference() {
		for (int i = 0; i < users.size(); i++) {
			for (Account j : users.get(i).getMyAccount()) {
				if (j != null) {
					System.out.println();
					System.out.println("----------------------------");
					System.out.println(" 이름 : " + users.get(i).getUserName());
					System.out.println(" 주민번호 : " + users.get(i).getSsn());
					System.out.println(" 계좌번호 : " + j.getAccountNumber());
					System.out.println(" 잔액 : " + j.getAccountBalance());
					System.out.println("----------------------------");
				}
			}
		}
	}
	
	// createAccount는 이미 user에 대한 유효성체크가 지난 시점이니 편하게 cnt값만 체크해주면 됨
	public Account createAccount(String passwd) {
		if (users.get(userIndex).cnt == 3) return null;
		else {
			Account account = new Account();
			// 랜덤숫자로 accountNumber 생성 (100000 ~ 999999)
			String accountNum = String.valueOf(999999 - (int)(Math.random() * 900000));
			this.accountNum = accountNum;
			account.setAccountNumber(accountNum);
			account.setAccountBalance(0);
			account.setAccountPassword(passwd);
			// 현재 계좌개수 증가
			users.get(userIndex).cnt++;
			return account;
		}
	}
	
	// 해당 유저가 이미 존재하는지 체크
	// 이걸 HongikApp에서 if, else문으로 써서 사용
	public boolean userCheck(String name, String ssn) {
		if (users == null || users.isEmpty()) return false;
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUserName().equals(name) && users.get(i).getSsn().equals(ssn)) {
				this.userIndex = i;
				return true;
			}
		}
		return false;
	}
	
	public String getAccountNum() {
		return accountNum;
	}

	public void createUser(String name, String ssn) {
		HongikUser user = new HongikUser(name, ssn);
		this.userIndex = users.size();
		users.add(user);
	}
	
	public void reset() {
		this.userIndex = 1000;
		this.accountIndex = 1000;
	}

	@Override
	public void addAccount() {
		// TODO Auto-generated method stub
		return;
		
	}

}
