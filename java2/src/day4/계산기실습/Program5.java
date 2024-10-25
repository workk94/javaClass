package day4.계산기실습;

import java.util.Scanner;

public class Program5 {
	
	// 
	
	Calculator cal;
	
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수 입력하세요 계산해 드릴게요");
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();

		int total = cal.add(su1, su2); // NullPointerException 발생 
		System.out.println("두수의 결과 : " + total);
	}
	
	
	public static void main(String[] args) {
		Program5 p = new Program5();
		p.run();
	}
}
