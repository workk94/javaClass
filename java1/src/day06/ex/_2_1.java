// 2. 일정관리프로그램 1)하루일정을 관리하는 프로그램 작성하기 (일차원배열 사용하기)
package day06.ex;

import java.util.Scanner;

public class _2_1 {

	public static void main(String[] args) {
		// 1.일정생성, 2.일정조회, 3.일정수정, 4.일정삭제, 5.전체일정조회, 6.종료 (CRUD)
		String[] scheduleToday = new String[5];
		int idx = 0;

		Scanner sc = new Scanner(System.in);

		loop: while (true) {
//					System.out.println("현재 일정 개수 : " + idx);
			System.out.print("1.일정 생성, 2.일정 조회, 3.일정 수정, 4.일정 삭제, 5.전체 일정조회, 6.종료 : ");
			String selectedMenu = sc.next();
			switch (selectedMenu) {
			case "1":
				if (idx >= 5) {
					System.out.println("일정을 추가할 수 없습니다. \n");
					break;
				}
				System.out.print(idx + 1 + "번째 일정을 추가합니다 : ");
				String scheduleTmp = sc.next();
				scheduleToday[idx] = scheduleTmp;
				System.out.println("추가완료 : [" + (idx + 1) + "] " + scheduleTmp);
				idx++;
				break;
			case "2":
				System.out.print("조회할 일정번호 : ");
				int selectIdx = sc.nextInt() - 1;
				if (selectIdx < 0 || selectIdx >= idx) {
					System.out.println("조회할 일정번호가 올바르지 않습니다");
					break;
				}
				System.out.println("[" + (selectIdx + 1) + "] " + scheduleToday[selectIdx]);

				break;
			case "3":
				System.out.print("수정할 일정번호 : ");
				int updateIdx = sc.nextInt() - 1;
				if (updateIdx < 0 || updateIdx >= idx) {
					System.out.println("수정할 일정번호가 올바르지 않습니다");
					break;
				}
				System.out.print("수정 : ");
				String updateContent = sc.next();
				scheduleToday[updateIdx] = updateContent;
				System.out.println("변경완료");
				break;
			case "4":
				System.out.print("삭제할 일정번호 : ");
				int deleteIdx = sc.nextInt() - 1;
				if (deleteIdx < 0 || deleteIdx >= idx) {
					System.out.println("삭제할 일정번호가 올바르지 않습니다");
					break;
				}
				for (int i = deleteIdx; i < idx - 1; i++) {
					scheduleToday[i] = scheduleToday[i + 1];
				}
				scheduleToday[idx - 1] = null; // 맨뒤에거 null
				idx--;
				System.out.println("삭제되었습니다");
				break;
			case "5":
				if (idx == 0) {
					System.out.println("조회할 일정이 없습니다");
					break;
				}
				System.out.println("전체 일정을 조회합니다");
				for (int i = 0; i < idx; i++) {
					System.out.println("[" + (i + 1) + "] " + scheduleToday[i]);
				}
				break;
			case "6":
				System.out.println("종료합니다");
				break loop;
			default:
				System.out.println("잘못 입력했습니다");
				break;
			}
		}

	}

}
