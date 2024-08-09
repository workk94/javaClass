package day03;

import java.util.Scanner;

public class 제어문6_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 레이블
		loop:while(true) {	
			int menu; 
			menu = sc.nextInt();
			
			switch(menu) { // 1.등록, 2.조회, 3.변경, 4.삭제, 5.종료
			case 1:
				System.out.println("1.등록합니다");
				break;
			case 2:
				System.out.println("2.조회합니다");
				break;
			case 3:
				System.out.println("3.변경합니다");
				break;
			case 4: 
				System.out.println("4.삭제합니다");
				break;
			case 5:
				System.out.println("5. 종료");
				break loop; // loop 이름 가진 반복을 빠져나감
			default : // 그 밖의 모든 것 
				System.out.println("메뉴선택 잘못됨");
			}
			
		}
		System.out.println("bye ~");
	}
}
