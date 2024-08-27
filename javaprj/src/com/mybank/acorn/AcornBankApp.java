package com.mybank.acorn;

import java.util.ArrayList;
import java.util.Scanner;

import com.mybank.bank.Account;
import com.mybank.user.Admin;
import com.mybank.user.User;

public class AcornBankApp {
	private Scanner sc = new Scanner(System.in);
	
	private AcornBank b = new AcornBank("본점");
	ArrayList <Account> accounts = new ArrayList<>();
	ArrayList <User> users = new ArrayList<>();
	
	public void run() {

	      while (true) {
	         System.out.println(b.getBankName() + "에 오신것을 환영합니다");
	         System.out.println("메뉴선택 [1]관리자용 [2]고객용 [3]신규계좌 개설 [4]종료: ");

	         String select = sc.nextLine();

	         switch (select) {
	         case "1":
	            System.out.println("관리자용");
	            System.out.print("아이디 : ");
	            String id = sc.nextLine();
	            System.out.println("비밀번호 : ");
	            String pw = sc.nextLine();
	            if (id.equals(new Admin().getId()) && pw.equals(new Admin().getPassword())) {
	               adminMenu();
	            }else {
	               System.out.println("아이디 혹은 비밀번호가 틀렸습니다");
	            }
	            break;
	         case "2":
	            System.out.println("고객용");
	            System.out.print("계좌번호 : ");
	            String checkid = sc.nextLine();
	            for (int i = 0; i < users.size(); i++) {
	               if (checkid.equals(accounts.get(i).getAccountNumber())) {
	                  System.out.print("비밀번호 : ");
	                  String checkpw = sc.nextLine();
	                  if (checkpw.equals(accounts.get(i).getAccountPassword())) {
	                     clientMenu(checkid);
	                  }else {
	                     System.out.println("비밀번호가 일치하지 않습니다");
	                     break;
	                  }
	               }
	               
	            }
	            
	            break;
	         case "3" :
	            b.addAccount();
	            break;
	         case "4" : 
	            System.out.println("종료합니다 안녕히가세요");
	            
	            System.exit(0);
	         default:
	            System.out.println("잘못된 입력입니다");
	         }
	      }
	   }
	public void clientMenu(String account) {
	      while (true) {
	         System.out.println("메뉴를 선택해주세요 [1]기존계좌 개설, [2]입금, [3]출금, [4]송금, [5]전단계");
	         String select = sc.nextLine();
	         switch (select) {
	         case "1":
	            System.out.println("계좌개설");
	            break;
	         case "2":
	            System.out.print("입금하실 금액을 입력해주세요 : ");
	            double amount1 = sc.nextDouble();
	            b.deposit(account, amount1);
	            break;
	         case "3":
	            System.out.println("종료");
	            System.exit(0);
	         case "5":
	            System.out.println("전단계로 이동");
	            return;
	         default:
	            System.out.println("잘못된 입력입니다");
	         }
	      }
	   }
	
	public boolean login() {
		String accountNumber = null;
		boolean result = false;
		try {
			System.out.print("계좌번호 입력 : ");
			accountNumber = sc.nextLine();
			System.out.print("계좌비밀번호 입력 : ");
			sc.nextLine();
			String password = sc.nextLine();
			b.getAccount();
			
		} catch(Exception e) {
			
		}
		
		//null인 경우 
		if(b.getAccount() == null) {
			System.out.println("비밀번호가 일치하지 않습니다");
			return true;
		}
		
		return true;
		
	}
	
	
	public void loginSuccessMenu() {
		while (true) {
			System.out.println("메뉴를 선택해주세요 [1]입금, [3]출금, [4]송금, [4]전단계");
			String select = sc.nextLine();
			switch (select) {
			case "1":
				boolean result = login();
				if(result) {
					
				}
				
				System.out.println("로그인");
				break;
			case "3":
				System.out.println("종료");
				System.exit(0);
			case "4":
				System.out.println("전단계로 이동");
				return;
			default:
				System.out.println("잘못된 입력입니다");
			}
		}
	}

	public void adminMenu() {
		while (true) {
			System.out.println("메뉴를 선택해주세요 [1]전체계좌조회, [2]직원정보조회, [3]종료, [4]전단계");
			String select = sc.nextLine();
			switch (select) {
			case "1":
				System.out.println("전체계좌조회");
				break;
			case "2":
				System.out.println("로그인");
				break;
			case "3":
				System.out.println("종료");
				System.exit(0);
			case "4":
				System.out.println("전단계로 이동");
				return;
			default:
				System.out.println("잘못된 입력입니다");
			}
		}
	}

}
