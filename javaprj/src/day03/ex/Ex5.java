//5. 일정을 관리프로그램 만들기 (1번) (1.등록, 2.조회, 3.변경, 4.삭제)
package day03.ex;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일정관리(1.등록 2.조회 3.변경 4.삭제) : ");
		String input = sc.next();
		if(input.equals("1")) {
			System.out.println("일정을 등록함");
		} else if(input.equals("2")) {
			System.out.println("일정을 조회함");
		} else if(input.equals("3")) {
			System.out.println("일정을 변경함");
		} else if(input.equals("4")) {
			System.out.println("일정을 삭제함");
		} else {
			System.out.println("잘못입력");
		}

	}

}
