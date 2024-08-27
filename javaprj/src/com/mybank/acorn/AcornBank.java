package com.mybank.acorn;

import java.util.ArrayList;
import java.util.Scanner;
import com.mybank.bank.Account;
import com.mybank.bank.Bank;
import com.mybank.user.User;

public class AcornBank extends Bank {
	
	private Scanner sc = new Scanner(System.in);
	
	public AcornBank(String bankName) {
		super("에이콘은행" + " " + bankName);
		this.users = new ArrayList<User>();
		this.accounts = new ArrayList<Account>();
	}


	@Override
	public void addAccount() {
		System.out.print("이름을 입력해주세요 : ");
		String userName = sc.nextLine();
		System.out.print("주민번호를 입력해주세요 : ");
		String ssn = sc.nextLine();
		System.out.print("계좌비밀번호를 입력해주세요 : ");
		String password = sc.nextLine();

		String newAccountNumber = AcornAccount.accountNumberGenerator();		
		AcornAccount newAccount = new AcornAccount();
		
		newAccount.setAccountNumber(newAccountNumber);
		newAccount.setAccountPassword(password);
		
		User newUser = new User(userName, ssn, null);
		accounts.add(newAccount);
		users.add(newUser);
		
		System.out.println("가입을 환영합니다 당신의 계좌번호는 " + newAccount.getAccountNumber() + " 입니다"); 
		return;
		
	}
	
	
	
	public void addAccountExistUser() {
		
	}
	
	public void searchAll() {
		for(int i = 0; i < accounts.size(); i++) {
			System.out.println(accounts.get(i).toString());
		}
	}
	
	@Override
	public Account getAccount() {
		System.out.println("계좌번호 입력 : ");
		String accountNumber = sc.nextLine();
		accountNumber = accountNumber.trim();
		for(int i = 0; i < accounts.size(); i++) {
			if(accounts.get(i).getAccountNumber().equals(accountNumber)) {
				System.out.println("계좌존재");
				return accounts.get(0);
			}
		}
		return null;
	}
	
	
	@Override
	public boolean deposit(String accountNumber, long amount) {
		
		Account a;
		for(int i = 0; i < accounts.size(); i++) {
			if(accounts.get(i).getAccountNumber().equals(accountNumber)) {
				a = accounts.get(i);
				a.setAccountBalance(amount);
				System.out.println("입금성공");
				System.out.println("잔액 " + a.getAccountBalance());
				return true;
			}
		}
		
		System.out.println("입금실패");
		return false;
	}

	@Override
	public boolean withdraw(String accountNumber, long amount) {
		Account a;
		for(int i = 0; i < accounts.size(); i++) {
			if(accounts.get(i).getAccountNumber().equals(accountNumber)) {
				a = accounts.get(i);
				a.setAccountBalance(amount);
				System.out.println("출금성공");
				System.out.println("잔액 " + a.getAccountBalance());
				return true;
			}
		}
		
		System.out.println("출금실패");
		return false;
	}

	@Override
	public boolean transfer(String fromAccount, String toAccount, long amount) {
		
		Account a = null, b = null;
		
		for(int i = 0; i < accounts.size(); i++) {
			if(accounts.get(i).getAccountNumber().equals(fromAccount)) {
				a = accounts.get(i);
			}
			
			if(accounts.get(i).getAccountNumber().equals(toAccount)) {
				b = accounts.get(i);			
			}
		}
		
		if(a == null || b == null) {
			System.out.println("존재하지 않는 계좌");
			return false;
		} else {
			
			a.setAccountBalance(-amount);
			b.setAccountBalance(amount);
			System.out.println("송금완료");
			
			return true;
		}
	}
	
}
