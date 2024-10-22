package day07;

import java.util.Scanner;

public class _01_함수만나기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		loop: while (true) {
			System.out.println("메뉴: 1.등록, 2.조회, 3.변경, 4.종료");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				등록하기(); // 등록하기 메서드 호출
				break;
			case 2:
				조회하기(); // 조회하기 메서드 호출
				break;
			case 3:
				조회하기();
				변경하기(); 
				조회하기();
				break;
			case 4:
				System.out.println("종료");
				break loop;
			default:
				System.out.println("메뉴 선택 잘못됨");
			}

		}

	}

	private static void 변경하기() {
		System.out.println("변경합니다");
	}

	private static void 조회하기() {
		System.out.println("***조회합니다");
	}

	// 메서드 만들기
	private static void 등록하기() {
		System.out.println("등록합니다");
	}

	/**
	 * 함수사용 목적(함수 사용 잇점)
	 * : 중복된 코드를 제거할 수 있다.
	 * : 코드의 재사용 
	 */
	
}
