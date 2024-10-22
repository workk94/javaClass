package com.mybank;

import java.util.Scanner;

import com.mybank.acorn.AcornBankApp;
import com.mybank.hongik.HongikApp;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AcornBankApp app1 = new AcornBankApp();
		HongikApp app2 = new HongikApp();
		while(true) {
			System.out.println("접속할 은행을 선택해주세요");
			System.out.println();
			System.out.println("[1]에이콘은행\n[2]홍대은행\n[3]종료\n" );
			System.out.println("------------------------------------------");
			String selectMenu = sc.nextLine();
			switch(selectMenu) {
			case "1" : 
				System.out.println("에이콘 은행에 접속합니다...");
				app1.run();
				break;
			case "2" :
				System.out.println("홍대 은행에 접속합니다...");
				app2.run();
				break;
			case "3" :
				System.err.println("프로그램을 종료합니다");
				System.exit(0);
				break;
				default : 
					System.out.println("잘못입력하셨습니다");
			}
		}
	}
}
