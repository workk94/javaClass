package com.mybank.acorn;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Scanner;

import com.mybank.bank.Account;
import com.mybank.user.Admin;
import com.mybank.user.User;

public class AcornBankApp {
	private AcornBank b = new AcornBank("본점");
	private Scanner sc = new Scanner(System.in);
	private AcornLedger l = b.getLedger();
	private DataStorage ds;

    public AcornBankApp() {
        this.ds = new DataStorage(b,l); // AcornBank 객체를 DataStorage에 전달
    }
	public void run() {
		
		try {
			ds.loadData();
		} catch (EOFException e) {
			e.getMessage();
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			e.getMessage();
			System.out.println(e.getMessage());
		} 
		
		printBankLogo();
		
		System.out.println("에이콘 은행에 방문해주셔서 감사합니다");
		
		loop:while (true) {
			System.out.println("[1]관리자 \n[2]은행 로그인 \n[3]신규계좌 개설 \n[4]종료");
			System.out.println("-----------------------------------------------------------------");
			String select = sc.nextLine();

			switch (select) {
			case "1":
				adminLogin();
				break;
			case "2":
				userLogin();
				break;
			case "3" :
				b.addAccount();
				break;
			case "4" : 
				System.out.println("종료합니다 안녕히가세요");
				try {
					ds.saveData();
				} catch (EOFException e) {
					e.getMessage();
					System.out.println(e.getMessage());
				}
				break loop;
			default:
				System.out.println("잘못된 입력입니다");
			}
		}
		
		
	}

	
	//리펙토링 해야됨
	public void clientMenu(String account) {
		while (true) {
			User currentUser = b.findUserByAccountNumber(account);
			String currentUserName = currentUser.getUserName();
			System.out.println("\""+currentUserName + "\"" + "님 방문해주셔서 감사드립니다");
			System.out.println("> 접속 계좌번호 :" + account);
			
			//long totalBalance = b.getAccount(account).getAccountBalance();
			
			long totalBalance = 0;
			
			Account [] currentUserAccountArr = currentUser.getMyAccount();
			
			for(int i = 0; i < currentUser.getCnt(); i++) {
				totalBalance += currentUserAccountArr[i].getAccountBalance();
			}
			System.out.println("> 총 계좌 잔액 : " + totalBalance);
			
			System.out.println("[1]계좌 추가개설 \n[2]입금 \n[3]출금 \n[4]송금 \n[5]계좌거래내역 \n[6]다른계좌로 전환 \n[5]이전단계");
			System.out.println("-----------------------------------------------------------------");
			String select = sc.nextLine();
			switch (select) {
			case "1":
				System.out.println("[추가 계좌개설 진행]");
				b.addAccountExistUser();
				break;
			case "2":
				try {
					System.out.print("> 입금하실 금액을 입력해주세요 : ");
					long amount1 = sc.nextLong();
					b.deposit(account, amount1);
				} catch (RuntimeException e) {
					System.out.println("[err] : 잘못된 입력입니다");
				} finally {
					sc.nextLine();
				}
				break;
			case "3":
				try {
					System.out.print("> 출금하실 금액을 입력해주세요 : ");
					long amount2 = sc.nextLong();
					b.withdraw(account, amount2);
				} catch (RuntimeException e) {
					System.out.println("[err] : 잘못된 입력입니다");
				} finally {
					sc.nextLine();
				}
				break;
			case "4":
				System.out.print("> 송금하실 계좌를 입력해주세요 : ");
				String account1 = sc.nextLine();
				
				if(account.equals(account1)) {
					System.out.println("타인계좌로만 송금이 가능합니다!!!");
					return;
				}
				
				boolean accountFound = false;
				for (int i = 0; i < b.getAccounts().size(); i++) {
					if (account1.equals(b.getAccounts().get(i).getAccountNumber())) {
						accountFound = true;
						try {

							System.out.print("> 송금하실 금액을 입력해주세요 : ");
							long amount3 = sc.nextLong();
							b.transfer(account, account1, amount3);
						} catch (RuntimeException e) {
							System.out.println("err : 잘못된 입력입니다");
						} finally {
							sc.nextLine();
						}
					} 
				}
				
				if(!accountFound) System.out.println("계좌번호를 찾지 못하였습니다");
				break;
			case "5":
				l.printTransactionHistory(account);
				break;
			case "6":
				System.out.println("전단계로 이동");
				break;
			case "7":
				System.out.println("전단계로 이동");
				return;
			default:
				System.out.println("잘못된 입력입니다");
			}
		}
	}
	
	public void adminMenu() {
		while (true) {
			System.out.println("[1]거래내역조회\n[2]전체고객조회\n[3]이전단계");
			System.out.println("-----------------------------------------------------------------");
			String select = sc.nextLine();
			switch (select) {
			case "1":			
				l.printAllTransactionHistory();
				break;
			case "2":
				printAllUsers();
				break;
			case "3":
				System.out.println("전단계로 이동");
				return;
			default:
				System.out.println("잘못된 입력입니다");
			}
		}
	}
	
	// 은행 로고
	public void printBankLogo() {
		
		String[] logo = {
	            "  ___   _____  _____ ______  _   _  ______   ___   _   _  _   __",
	            " / _ \\ /  __ \\|  _  || ___ \\| \\ | | | ___ \\ / _ \\ | \\ | || | / /",
	            "/ /_\\ \\| /  \\/| | | || |_/ /|  \\| | | |_/ // /_\\ \\|  \\| || |/ / ",
	            "|  _  || |    | | | ||    / | . ` | | ___ \\|  _  || . ` ||    \\ ",
	            "| | | || \\__/\\\\ \\_/ /| |\\ \\ | |\\  | | |_/ /| | | || |\\  || |\\  \\",
	            "\\_| |_/ \\____/ \\___/ \\_| \\_|\\_| \\_/ \\____/ \\_| |_/\\_| \\_/\\_| \\_/"
	        };
			
	        for (String line : logo) {
	            System.out.println(line);
	        }
	        System.out.println("-----------------------------------------------------------------");
	}

	public void printAllUsers() {
		ArrayList<User> userList = b.getUsers();
		
		if (!userList.isEmpty()) {
			System.out.println("[전체 고객조회]");
			for (int i = 0; i < userList.size(); i++) {
				System.out.println("-----------------------------------------------------------------");				
				System.out.print("[" + (i + 1) + "] ");
				System.out.println("[고객정보]");
				System.out.println("> 고객이름 : " + userList.get(i).getUserName());
				System.out.println("> 주민번호 : " + userList.get(i).getSSN());
				System.out.println("[고객계좌 목록]");
				Account[] userAccounts = userList.get(i).getMyAccount();

				int numOfAccounts = userList.get(i).getCnt();
				System.out.println("> "+numOfAccounts + "개 계좌 조회되었습니다");
				int idx = 0;
				for (Account account : userAccounts) {
					if (account == null)
						break;
					System.out.print("[" + (idx++ + 1) + "] ");
					String accountNumber = account.getAccountNumber();
					long accountBalance = account.getAccountBalance();
					System.out.println("계좌번호 : " + accountNumber + " 계좌잔액 : " + accountBalance);
				}
			}
		} else {

			System.out.println("고객정보가 존재하지 않습니다");
		}
	}
	
	
	public void adminLogin() {
		System.out.println("[관리자 페이지 로그인]");
		System.out.println("-----------------------------------------------------------------");
		System.out.print("아이디 > ");
		String id = sc.nextLine();
		System.out.print("비밀번호 > ");
		String pw = sc.nextLine();
		if (id.equals(new Admin().getId()) && pw.equals(new Admin().getPassword())) {
			adminMenu();
		}else {
			System.out.println("아이디 혹은 비밀번호가 틀렸습니다");
		}
	}

	public void userLogin() {
		System.out.println("[로그인]");
		System.out.print("> 계좌번호 : ");
		String checkid = sc.nextLine();
		for (int i = 0; i < b.getAccounts().size(); i++) {
			if (checkid.equals(b.getAccounts().get(i).getAccountNumber())) {
				System.out.print("> 비밀번호 : ");
				String checkpw = sc.nextLine();
				if (checkpw.equals(b.getAccounts().get(i).getAccountPassword())) {
					clientMenu(checkid);
					checkid = null;
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다");
					checkid = null;
					break;
				}
			}
			
		}
		if (checkid != null) {
			System.out.println("계좌번호를 잘못 입력하셨습니다");
		}
	}
}
