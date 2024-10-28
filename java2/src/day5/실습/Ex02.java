package day5.실습;

import java.util.Scanner;

public class Ex02 {
	enum Status {
		NORMAL, ATTACK, DEFENCE, DEATH;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Status status = null;

		while (true) {

			System.out.println("캐릭터의 상태를 입력하세요(normal, attack, defence, death)");
			String select = scanner.nextLine().toUpperCase();

			try {
				status = Status.valueOf(select);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("잘못된 선택입니다");
				continue;
			}

			switch (status) {
			case ATTACK:
				System.out.println("공격 상태입니다");
				break;
			case NORMAL:
				System.out.println("일반 상태입니다");
				break;
			case DEFENCE:
				System.out.println("방어 상태입니다");
				break;
			case DEATH:
				System.out.println("캐릭터가 죽었습니다 game over");
				scanner.close();
				return;
			}

		}

	}
}
