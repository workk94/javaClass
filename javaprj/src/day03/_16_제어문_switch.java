package day03;

import java.util.Scanner;

public class _16_제어문_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//switch, break;
		int menu = 5; // 1.등록, 2.조회, 3.변경, 4.삭제
		//메뉴를 입력
		menu = sc.nextInt();
		
		switch(menu) {
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
		default : // 그 밖의 모든 것 
			System.out.println("메뉴선택 잘못됨");
		}
	}

}
