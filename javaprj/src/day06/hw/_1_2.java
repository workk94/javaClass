package day06.hw;

import java.util.Scanner;

public class _1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// [0]		[1]		[2]		[3]		[4]	[5]	[6]	[7]
		// 50000	10000	5000	1000	500	100	50	10 
		int[] money = new int[8];
		int remain;
		
		while(true) {
			System.out.print("사원이름(종료:stop) : ");
			String nameEmployee = sc.next();
			if(nameEmployee.equals("stop")) break;
			System.out.print("출장비 : ");
			int expense = sc.nextInt();
			
			money[0] = expense / 50000;
			remain = expense % 50000;
			money[1] = remain / 10000;
			remain = remain % 10000;
			money[2] = remain / 5000;
			remain = remain % 5000;
			money[3] = remain / 1000;
			remain = remain % 1000;
			money[4] = remain / 500;
			remain = remain % 500;
			money[5] = remain / 100;
			remain = remain % 100;
			money[6] = remain / 50;
			remain = remain % 50;
			money[7] = remain / 10;
			remain = remain % 10;
			
			System.out.println("5만원권 : " + money[0]);
			System.out.println("1만원권 : " + money[1]);
			System.out.println("5천원권 : " + money[2]);
			System.out.println("1천원권 : " + money[3]);
			System.out.println("500원 : " + money[4]);
			System.out.println("100원 : " + money[5]);
			System.out.println("50원 : " + money[6]);
			System.out.println("10원 : " + money[7]);
		}

	}

}
