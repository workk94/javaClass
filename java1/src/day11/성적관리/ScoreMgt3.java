package day11.성적관리;

import java.util.Scanner;

public class ScoreMgt3 {

	Score2[] scores = new Score2[5];
	int index = 0;
	Scanner sc = new Scanner(System.in);

	public void run() {
		while (true) {
			System.out.println("메뉴선택 1.등록, 2.조회, 3.변경, 4.종료, 5.성적처리");

			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				register();
				break;
			case 2:
				printInfo();
				break;
			case 3:
				updateScoreName();
				break;
			case 4:
				System.out.println("종료");
				System.exit(0);
			case 5:
				calcScore();
				break;

			default:
				System.out.println("잘못된 메뉴");
			}
		}
	}

	public void register() {
		System.out.println("등록");
		System.out.println("성적 : 이름, 국어, 영어");
		String name = sc.nextLine();
		int kor = sc.nextInt();
		int eng = sc.nextInt();

		if (index >= 5) {
			System.out.println("추가할 수 없습니다");
			return;
		}
		Score2 s = new Score2(name, kor, eng);
		scores[index++] = s;
	}

	public void printInfo() {
		System.out.println("조회");
		for (int i = 0; i < index; i++) {
			System.out.println(scores[i].toString());
		}
	}

	public void calcScore() {
		System.out.println("성적 처리중 !!");
		for (int i = 0; i < index; i++) {
			scores[i].calc();
		}
	}

	public void updateScoreName() {
		System.out.println("변경");
		System.out.println("학생번호 입력");
		int select = sc.nextInt() - 1;

		sc.nextLine();
		System.out.println("새로운 이름");
		String newName = sc.nextLine();
		scores[select].setName(newName);
		System.out.println("변경되었음");
	}

	public static void main(String[] args) {

		ScoreMgt3 mgt = new ScoreMgt3();
		mgt.run();

	}
}
