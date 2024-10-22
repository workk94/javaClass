package com.mybank.hongik;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.mybank.bank.*;
import com.mybank.user.*;

public class HongikApp {
	
	private HongikBank bank;
	private String accountNum;
	final private String FILE_NAME = "HongikUserData";
	
	Scanner sc = new Scanner(System.in);
	public void run() {
		this.loadingData();
		while (true) {			
			// 시작 메뉴창
			displayMenu1();
			int input = sc.nextInt();
			sc.nextLine();
			
			switch(input) {
			case 1:
				System.out.println();
				managerLogin();
				System.out.println();
				break;
			case 2:
				System.out.println();
				clientLogin();
				System.out.println();
				break;
			case 3:
				System.out.println();
				createAccount();
				System.out.println();
				break;
			case 0:
				this.savingData();
				System.exit(0);
				break;
			}
		}
	}
	
	public void loadingData() {
		try {
			FileInputStream fis = new FileInputStream(FILE_NAME);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			bank = (HongikBank) ois.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			bank = new HongikBank();
		} catch (IOException ie) {
			ie.printStackTrace();
		} catch (ClassNotFoundException cfe) {
			cfe.printStackTrace();
		}
	}
	
	public void savingData() {
		try {
			FileOutputStream fos = new FileOutputStream(FILE_NAME);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(bank);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
	
	public void createAccount() {
		System.out.print(" 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		System.out.print(" 주민번호를 입력해주세요 : ");
		String ssn = sc.nextLine();
		// true -> 이미 있는 고객, false -> 없는 고객
		if (bank.userCheck(name, ssn)) {
			System.out.print(" 설정할 비밀번호를 입력해주세요 : ");
			String passwd = sc.nextLine();
			Account account = bank.createAccount(passwd);
			if (account != null) {
			    bank.addAccount(account);
			    System.out.println();
			    System.out.println(" 계좌가 성공적으로 생성되었습니다");
			    System.out.println(" 계좌번호는 "  + bank.getAccountNum() + "입니다.");
			} else {
			    // null이 반환된 경우 처리 로직
				System.out.println();
			    System.out.println(" 계좌가 이미 최대로 존재합니다");
			    System.out.println(" 개설이 취소되었습니다.");
			}
		} else {
			bank.createUser(name, ssn);
			System.out.print(" 설정할 비밀번호를 입력해주세요 : ");
			String passwd = sc.nextLine();
			bank.addAccount(bank.createAccount(passwd));
		    System.out.println(" 계좌가 성공적으로 생성되었습니다");
		    System.out.println(" 계좌번호는 "  + bank.getAccountNum() + "입니다.");
		}
	}
	
	public void displayMenu1() {
		System.out.println("----------------------------");
		System.out.println(" 1. 관리자 로그인");
		System.out.println(" 2. 사용자 로그인");
		System.out.println(" 3. 신규 계좌 개설");
		System.out.println(" 0. 종료");
		System.out.println("----------------------------");
		System.out.print(" >>> ");
	}
	
	public void displayMenu2() {
		System.out.println("----------------------------");
		System.out.println(" 1. 전체 계좌 조회");
		System.out.println(" 0. 종료");
		System.out.println("----------------------------");
		System.out.print(" >>> ");
	}
	
	public void displayMenu3() {
		System.out.println("----------------------------");
		System.out.println(" 1. 입금");
		System.out.println(" 2. 출금");
		System.out.println(" 3. 송금");
		System.out.println(" 4. 잔액 조회");
		System.out.println(" 5. 계좌 조회");
		System.out.println(" 0. 종료");
		System.out.println("----------------------------");
		System.out.print(" >>> ");
	}
	
	public void managerDisplay() {
		loop : while (true) {
			// 메뉴창
			displayMenu2();
			int input = sc.nextInt();
			sc.nextLine();
			
			switch (input) {
			case 1:
				bank.allAccountReference();
				break;
			case 0:
				break loop;
			}
		}
	}
	
	public void clientDisplay() {
		loop : while (true) {
			// 메뉴창
			displayMenu3();
			int input = 0;
				input = sc.nextInt();
				
				sc.nextLine();
				
				switch (input) {
				case 1:
					System.out.println();
					System.out.print("입금하실 금액을 입력해주세요 : ");
					try {
						long balance = sc.nextLong();
						sc.nextLine();
						System.out.println();
						if (balance <= 0) {
							System.out.println("0 초과의 금액을 입력해주세요");
						} else {
							if (bank.deposit(this.accountNum, balance)) {
								System.out.println("정상적으로 입금 완료되었습니다.");
								System.out.println("입금 후 잔액 : " + bank.getBalance());
							} else {
								System.out.println("비정상 오류");
							}
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						sc.nextLine();
					}
					break;
				case 2:
					System.out.println();
					System.out.print("출금하실 금액을 입력해주세요 : ");
					long balance1;
					try {
						balance1 = sc.nextLong();
						sc.nextLine();
						System.out.println();
						if (balance1 <= 0) {
							System.out.println("0 초과의 금액을 입력해주세요");
						}else {
							if (bank.withdraw(this.accountNum, balance1)) {
								System.out.println("정상적으로 출금 완료되었습니다.");
								System.out.println("출금 후 잔액 : " + bank.getBalance());
							}else {
								System.out.println("잔액이 부족합니다.");
							}
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println("잘못된 값을 입력하셨습니다");
					}
					break;
				case 3:
					System.out.println();
					System.out.print("송금하실 계좌를 입력해주세요 : ");
					String toAccountNum = sc.nextLine();
					System.out.print("송금하실 금액을 입력해주세요 : ");
					long balance3;
					try {
						balance3 = sc.nextLong();
						sc.nextLine();
						System.out.println();
						if (bank.transfer(this.accountNum, toAccountNum, balance3)) {
							System.out.println("정상적으로 송금 완료되었습니다.");
							System.out.println("송금 후 잔액 : " + bank.getBalance());
						} else {
							System.out.println("송금할 계좌가 없거나 잔액이 부족합니다.");
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println("잘못된 값을 입력하셨습니다.");
					}
					break;
				case 4:
					System.out.println();
					System.out.println("현재 계좌의 잔액은 " + bank.getBalance() + "원입니다.");
					break;
				case 5:
					bank.AccountReference();
					break;
				case 0:
					break loop;
				}
					
				
			}
			System.out.println();
		}


	public void managerLogin() {
		System.out.println("----------------------------");
		System.out.print(" 아이디 입력 : ");
		String id = sc.nextLine();
		System.out.print(" 비밀번호 입력 : ");
		String passwd = sc.nextLine();
		
		System.out.println("----------------------------");
		
		Admin admin = new Admin();
		
		if (id.equals(admin.getId()) && passwd.equals(admin.getPassword())) {
			System.out.println();
			managerDisplay();
		} else {
			System.out.println();
			System.out.println(" 잘못된 접근입니다.");
		}
	}
	
	public void clientLogin() {
		
		int check = 0;
		
		System.out.println("----------------------------");
		System.out.print(" 계좌번호 입력 : ");
		String id = sc.nextLine();
		System.out.print(" 비밀번호 입력 : ");
		String passwd = sc.nextLine();
		
		System.out.println("----------------------------");
		
		if (!(bank.getAccount(id) == null)) {
			if (bank.getAccount(id).getAccountPassword().equals(passwd)) {
				check = 2;
			}
			else check = 1;
		} else {
			check = 0;
		}
		
		switch (check) {
		case 0:
			System.out.println();
			System.out.println(" 일치하는 계좌가 존재하지 않습니다.");
			break;
		case 1:
			System.out.println();
			System.out.println(" 계좌 비밀번호가 틀렸습니다.");
			break;
		case 2:
			System.out.println();
			System.out.println(" 로그인 성공");
			System.out.println();
			this.accountNum = id;
			clientDisplay();
			break;
		}
	}
}
