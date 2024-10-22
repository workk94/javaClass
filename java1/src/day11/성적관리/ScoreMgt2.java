package day11.성적관리;

import java.util.Scanner;

public class ScoreMgt2 {

	public static void main(String[] args) {
		Score2[] scores = new Score2[5]; // 배열을 생성시 크기가 있어야 한다
		Scanner sc = new Scanner(System.in);

		int index = 0;

		loop: while (true) {
			System.out.println("메뉴 1.등록, 2.조회, 3.변경, 4.종료, 5.성적처리");
			int menu = sc.nextInt();
			
			sc.nextLine(); // 남아 있는 엔터 읽어오기
			
			switch (menu) {
			case 1:
				System.out.println("등록");
				System.out.println("성적 : 이름, 국어, 영어");
				String name = sc.nextLine();
				int kor = sc.nextInt();
				int eng = sc.nextInt();
				
				if(index >= 5) {
					System.out.println("추가할 수 없습니다");
					break;
				}
				Score2 s = new Score2(name, kor, eng);
				scores[index++] = s;
				break;
			case 2:
				System.out.println("조회");
				for(int i = 0; i < index; i++) {
					System.out.println(scores[i].toString());
				}
				break;
			case 3:
				System.out.println("변경");
				System.out.println("학생번호 입력");
				int select = sc.nextInt() - 1;
				
				sc.nextLine();
				System.out.println("새로운 이름");
				String newName = sc.nextLine();
				scores[select].setName(newName);
				System.out.println("변경되었음");
				break;
			case 4:
				System.out.println("종료");
				break loop; // System.exit(0);
				
			case 5: 
				System.out.println("성적 처리중 !!");
				for(int i= 0; i < index; i++) {
					scores[i].calc();
				}
				break;
			default:
				System.out.println("잘못 입력했습니다");
				break;
			}
		}
	}
}