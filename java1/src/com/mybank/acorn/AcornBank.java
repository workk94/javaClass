package com.mybank.acorn;

import java.util.ArrayList;
import java.util.Scanner;
import com.mybank.bank.Account;
import com.mybank.bank.Bank;
import com.mybank.exception.InvalidPasswordFormatException;
import com.mybank.exception.InvalidSSNFormatException;
import com.mybank.exception.Validator;
import com.mybank.user.User;

public class AcornBank extends Bank {

	private Scanner sc = new Scanner(System.in);
	private AcornLedger ledger;

	public AcornBank(String bankName) {
		super("에이콘은행" + " " + bankName);
		this.users = new ArrayList<User>();
		this.accounts = new ArrayList<Account>();
		this.ledger = new AcornLedger();
	}
	
	@Override
	public Account[] getAccount() {
		return null;
	}

	@Override
	public void addAccount(Account account) {
		return;
	}

	//입금 
	@Override
	public boolean deposit(String accountNumber, long amount) {

		Account a;
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getAccountNumber().equals(accountNumber)) {
				a = accounts.get(i);
				long money = a.getAccountBalance();
				money += amount;
				a.setAccountBalance(money);
				for (int j = 0; j < users.size(); j++) {
					for (int j2 = 0; j2 < users.get(j).getCnt(); j2++) {
						if (accountNumber.equals(users.get(j).getMyAccount()[j2].getAccountNumber())) {
							users.get(j).getMyAccount()[j2].setAccountBalance(money);
						}
					}
				}
				ledger.addTransaction(accountNumber, TransactionType.DEPOSIT, amount);
				System.out.println("입금 완료");
				System.out.println("> 잔액 : " + a.getAccountBalance());
				return true;
			}
		}

		System.out.println("입금 실패!!!");
		return false;
	}

	//출금 
	@Override
	public boolean withdraw(String accountNumber, long amount) {
		Account a;
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getAccountNumber().equals(accountNumber)) {
				a = accounts.get(i);
				long money = a.getAccountBalance();
				if (money >= amount) {
					money -= amount;
					a.setAccountBalance(money);
					for (int j = 0; j < users.size(); j++) {
						for (int j2 = 0; j2 < users.get(j).getCnt(); j2++) {
							if (accountNumber.equals(users.get(j).getMyAccount()[j2].getAccountNumber())) {
								users.get(j).getMyAccount()[j2].setAccountBalance(money);
							}
						}
					}
					ledger.addTransaction(accountNumber, TransactionType.WITHDRAW, amount);
					System.out.println("출금 완료");
					System.out.println("> 잔액 " + a.getAccountBalance());
					return true;
				} else {
					System.out.println("잔액 부족!!!");
					return false;
				}

			}
		}

		System.out.println("출금 실패!!!");
		return false;
	}
	
	
	//은행 내 송금 
	@Override
	public boolean transfer(String fromAccount, String toAccount, long amount) {

		Account a = null, b = null;

		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getAccountNumber().equals(fromAccount)) {
				a = accounts.get(i);
			}

			if (accounts.get(i).getAccountNumber().equals(toAccount)) {
				b = accounts.get(i);
			}
		}

		if (a == null || b == null) {
			System.out.println("존재하지 않는 계좌번호 입니다");
			return false;
		} else {

			long fromMoney = a.getAccountBalance();
			long toMoney = b.getAccountBalance();
			if (fromMoney >= amount) {
				fromMoney -= amount;
				toMoney += amount;
				a.setAccountBalance(fromMoney);
				for (int j = 0; j < users.size(); j++) {
					for (int j2 = 0; j2 < users.get(j).getCnt(); j2++) {
						if (fromAccount.equals(users.get(j).getMyAccount()[j2].getAccountNumber())) {
							users.get(j).getMyAccount()[j2].setAccountBalance(fromMoney);
						}
					}
				}
				b.setAccountBalance(toMoney);
				for (int j = 0; j < users.size(); j++) {
					for (int j2 = 0; j2 < users.get(j).getCnt(); j2++) {
						if (toAccount.equals(users.get(j).getMyAccount()[j2].getAccountNumber())) {
							users.get(j).getMyAccount()[j2].setAccountBalance(toMoney);
						}
					}
				}

				ledger.addTransaction(fromAccount, TransactionType.TRNASFER, amount);
				ledger.addTransaction(toAccount, TransactionType.TRNASFER, amount);
				System.out.println("송금 완료");
				return true;
			} else {
				System.out.println("잔액이 부족합니다");
				return false;
			}

		}
	}
	
	//신규 고객 계좌생성
	@Override
	public void addAccount() {
		
		try {
			System.out.println("[신규계좌 개설]");
			System.out.print("이름을 입력해주세요 : ");
			String userName = sc.nextLine();
			System.out.print("주민번호를 입력해주세요 : ");
			String ssn = sc.nextLine();
			
			// 주민번호 검증
			Validator.ssnValidator(ssn);
			
			boolean isUserExist = false;

			for (int i = 0; i < users.size(); i++) {
				String searchSSN = users.get(i).getSSN();
				if (ssn.equals(searchSSN)) {
					System.out.println("이미 존재하는 고객입니다(직원 창구 문의)");
					isUserExist = true;
				}
				if (isUserExist)
					return;
			}

			System.out.print("계좌비밀번호를 입력해주세요 : ");
			String password = sc.nextLine();
			
			Validator.passwordValidator(password);
			
			String newAccountNumber = AcornAccount.accountNumberGenerator();
			AcornAccount newAccount = new AcornAccount();
			newAccount.setAccountNumber(newAccountNumber);
			newAccount.setAccountPassword(password);

			User newUser = new User(userName, ssn);
			accounts.add(newAccount);
			users.add(newUser);

			newUser.getMyAccount()[newUser.getCnt()] = newAccount;
			newUser.setCnt(newUser.getCnt() + 1);

			System.out.println("가입을 환영합니다 \n신규 계좌번호는 " + newAccount.getAccountNumber() + " 입니다");
			// testPrintAllUser();
			return;
		} catch (InvalidSSNFormatException e) {
			System.out.println(e.getMessage());
		} catch (InvalidPasswordFormatException e) {
			System.out.println(e.getMessage());
		}
		

	}

	//기존 고객 계좌생성
	public void addAccountExistUser() {
	    try {
	        System.out.println("추가 계좌 개설을 진행합니다");
	        System.out.print("> 주민번호를 입력해주세요 : ");
	        String searchUserSSN = sc.nextLine();

	        // 주민번호 검증
	        Validator.ssnValidator(searchUserSSN);

	        boolean isUserExist = findUserBySSN(searchUserSSN);

	        if (isUserExist) {
	            int foundIdx = getIdxFromUserSSN(searchUserSSN);
	            if (foundIdx != -1) {
	                int cntUsrAccount = users.get(foundIdx).getCnt();
	                if (cntUsrAccount >= 3) {
	                    System.out.println("계좌 계설은 최대 3개까지 가능합니다 ");
	                    return;
	                }

	                User foundUser = users.get(foundIdx);

	                System.out.print("> 새로운 계좌의 비밀번호를 입력해주세요 (4자리 숫자) : ");
	                String password = sc.nextLine();

	                // 비밀번호 검증
	                Validator.passwordValidator(password);

	                AcornAccount newAccount = new AcornAccount();
	                String newAccountNumber = AcornAccount.accountNumberGenerator();
	                newAccount.setAccountNumber(newAccountNumber);
	                newAccount.setAccountPassword(password);
	                accounts.add(newAccount);

	                foundUser.getMyAccount()[foundUser.getCnt()] = newAccount;
	                foundUser.setCnt(foundUser.getCnt() + 1);

	                System.out.println("계좌개설이 완료되었습니다 \n계좌번호는 " + newAccount.getAccountNumber() + " 입니다");
	            }
	        } else {
	            System.out.println("주민번호가 일치하지 않습니다");
	        }
	    } catch (InvalidSSNFormatException e) {
	    	System.out.println(e.getMessage());
	    } catch (InvalidPasswordFormatException e) {
	        System.out.println(e.getMessage());
	    }
	}
	
	public void searchAll() {
		for (int i = 0; i < accounts.size(); i++) {
			System.out.println(accounts.get(i).toString());
		}
	}

	public Account getAccount(String accountNumber) {
		for (Account account : accounts) {
			if (account.getAccountNumber().equals(accountNumber)) {
				return account;
			}
		}
		return null;
	}

	public boolean findUserBySSN(String userSSN) {
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getSSN().equals(userSSN)) {
				return true;
			}
		}
		return false;
	}

	public int getIdxFromUserSSN(String userSSN) {
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getSSN().equals(userSSN)) {
				return i;
			}
		}
		return -1;
	}
	
	public User findUserByAccountNumber(String accountNumber) {
		for (User user : users) {
			if (user != null) {
				Account[] myAccountArr = user.getMyAccount();
				for (int i = 0; i < user.getCnt(); i++) {
					if (myAccountArr[i].getAccountNumber().equals(accountNumber)) {
						return user; // 계좌번호가 일치하는 사용자를 반환
					}
				}
			}
		}
		return null;
	}

	// 테스트 코드
	public void testPrintALlAccount() {
		for (Account account : accounts) {
			System.out.println(accounts.toString());
		}

	}

	public void testPrintAllUser() {
		for (User user : users) {
			System.out.println(user.toString());
		}
		System.out.println("총 사용자 수: " + users.size());
	}
	
	
	// getter, setter 
	public AcornLedger getLedger() {
		return this.ledger;
	}
	
	public ArrayList<User> getUsers() {
		return users;
	}
	
	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setUsers(ArrayList<User> list) {
		users = list;
	}
	
	public void setAccounts(ArrayList<Account> list) {
		accounts = list;
	}

	


}
