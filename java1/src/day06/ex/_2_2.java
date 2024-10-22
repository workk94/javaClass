// 2. 일정관리프로그램 2) 일주일 일정을 관리하는 프로그램 작성하기 (2차원배열 사용하기 )

package day06.ex;

import java.util.Scanner;

public class _2_2 {
	public static void main(String[] args) {
		String[][] scheduleWeek = new String[7][5];
		int[] indexes = new int[7]; // 각 날짜의 인덱스를 저장하는 배열 
		String[] weekArr = new String[] { "일", "월", "화", "수", "목", "금", "토" };
		Scanner sc = new Scanner(System.in);

		loop: while (true) {
			System.out.print("1.일정 생성, 2.일정 조회, 3.일정 수정, 4.일정 삭제, 5.전체 일정조회, 6.종료 : ");
			String selectedMenu = sc.next();

			switch (selectedMenu) {
			case "1":
				// 일정 생성
				System.out.print("날짜를 선택해주세요(0: 일요일 ~ 6: 토요일) : ");
//				String input = sc.next();
				int selectedDay = sc.nextInt();
				if(selectedDay < 0 || selectedDay > 6) {
					System.out.println("잘못된 입력입니다");
					break;
				}
				if (indexes[selectedDay] >= 5) {
					System.out.println("일정을 추가할 수 없습니다");
					break;
				}
				System.out.print(weekArr[selectedDay] + "요일의 " + (indexes[selectedDay] + 1) + "번째 일정을 추가합니다 : ");
				String scheduleTmp = sc.next();
				scheduleWeek[selectedDay][indexes[selectedDay]] = scheduleTmp;
				System.out.println(scheduleWeek[selectedDay][indexes[selectedDay]]);
				indexes[selectedDay]++;
				break;
			case "2":
				// 일정 조회
				System.out.print("조회할 날짜(0: 일요일 ~ 6: 토요일) : ");
				int selectDay = sc.nextInt();
				System.out.print("조회할 일정번호 : ");
				int selectIdx = sc.nextInt() - 1;
				System.out.println(
						weekArr[selectDay] + "요일 [" + (selectIdx + 1) + "] " + scheduleWeek[selectDay][selectIdx]);
				break;
			case "3":
				// 일정 수정
				System.out.print("수정할 날짜(0: 일요일 ~ 6: 토요일) : ");
				int updateDay = sc.nextInt();
				System.out.print("수정할 일정번호 : ");
				int updateIdx = sc.nextInt() - 1;
				System.out.print("수정 내용 : ");
				String updateContent = sc.next();
				scheduleWeek[updateDay][updateIdx] = updateContent;
				System.out.println("수정완료");
				break;
			case "4":
				// 일정 삭제
				System.out.print("삭제할 날짜(0: 일요일 ~ 6: 토요일) : ");
				int deleteDay = sc.nextInt();
				System.out.print("삭제할 일정번호 : ");
				int deleteIdx = sc.nextInt() - 1;
				for (int i = deleteIdx; i < indexes[deleteDay] - 1; i++) {
					scheduleWeek[deleteDay][i] = scheduleWeek[deleteDay][i + 1];
				}
				scheduleWeek[deleteDay][indexes[deleteDay] - 1] = null;
				indexes[deleteDay]--;
				System.out.println(indexes[deleteDay]);
				System.out.println("삭제완료");
				break;
			case "5":
				// 전체일정 조회
				System.out.println("전체 일정을 조회합니다");
				for (int i = 0; i < scheduleWeek.length; i++) {
					System.out.println(weekArr[i]);
					if(scheduleWeek[i][0] == null) {
						System.out.println("일정이 없습니다");
						continue;
					}
					
					for (int j = 0; j < indexes[i]; j++) {
						
						System.out.println("[" + (j + 1) + "]" + scheduleWeek[i][j]);
					}
				}
				break;
			case "6":
				System.out.println("종료합니다");
				break loop;
			default:
				System.out.println("잘못 입력했습니다 다시 입력해주세요");
				break;
			}
		}
	}
}
