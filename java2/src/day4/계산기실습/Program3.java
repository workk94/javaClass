package day4.계산기실습;

import java.util.Scanner;

public class Program3 {
	
	
	// 실행해 주는 매서드
	
	

	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.. 계산해드립니다 ver3");


		int su1, su2;
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		
		// 계산
		AcornCalculator cal = new AcornCalculator();
		int total = cal.add(su1, su2);
		
		System.out.println("결과 : " + total);
	}
	
	public static void main(String[] args) {
		Program3 p = new Program3();

		p.run();
	}
}
