package day03;

import java.util.Scanner;

public class 제어문1_if {

	public static void main(String[] args) {
		// 제어문 (분기, 반복)
		// 프로그램의 흐름을 바꾸는 명령문이다
		// 분기문 : 조건에 따라 수행할 코드가 달라진다
		
		Scanner sc = new Scanner(System.in);
		
		
		int kor = 90; // 성적에 따른, A, B, C, F
		
		kor = sc.nextInt();
		
		// 조건에 만족하는 블럭을 수행하고 종료됨
		
		if(kor >= 90) {
			System.out.println("A");
		} else if(kor >= 80) {
			System.out.println("B");
		} else if(kor >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
	}

}
