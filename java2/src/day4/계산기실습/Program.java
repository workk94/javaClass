package day4.계산기실습;

import java.util.Scanner;

public class Program {
	// 두수를 계산해주는 프로그램
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int su1, su2;
		
		System.out.println("두 수를 입력하세요.. 계산해 드릴께요");
		
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		
		//계산
		int total;
		total = su1 + su2;
		
		System.out.println("계산의 결과" + total);
	}
}
