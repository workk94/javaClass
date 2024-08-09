package day06;

import java.util.Scanner;

public class _09_학생관리프로그램 {

	public static void main(String[] args) {
		// 5명 학생관리하는 프로그램
		// 1차원 배열

		// 메뉴 1.등록, 2.조회, 3.변경, 4.삭제, 5.전체조회 6.종료

		Scanner sc = new Scanner(System.in);

		loop: while (true) {
			System.out.println("1.등록, 2.조회, 3.변경, 4.삭제, 5.전체조회 6.종료");
			int menu = sc.nextInt();

//			sc.nextLine();

			switch (menu) {
			case 1:
				System.out.println("등록합니다");
				break;
			case 2:
				System.out.println("조회합니다");
				break;
			case 3:
				System.out.println("변경합니다");
				break;
			case 4:
				System.out.println("삭제합니다");
				break;
			case 5:
				System.out.println("전체조회");
				break; // while을 종료할 수 있도록
			case 6:
				System.out.println("종료합니다");
				break loop;
			default:
				System.out.println("메뉴 잘못 선택");
			}

		}
	}

}
