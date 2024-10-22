package day07;
 
import java.util.Scanner;

public class 일정관리샘플1 {

    public static void main(String[] args) {
        String[][] july = new String[31][5]; // 31일, 각 날짜에 최대 5개의 일정
        int[] dayIndex = new int[31]; // 각 날짜별 일정 개수를 추적하는 배열
        Scanner sc = new Scanner(System.in);
        int menu;

        loop: while (true) {
            System.out.println("7월 일정 관리 프로그램");
            System.out.print("메뉴 선택: 1.등록, 2.조회, 3.변경, 4.삭제, 5.종료  ");
            String menu_ = sc.nextLine();
            menu = Integer.parseInt(menu_);

            switch (menu) {
                case 1:
                    // 일정 등록
                    System.out.print("날짜를 입력하세요 (1~31): ");
                    int insertDate = Integer.parseInt(sc.nextLine()) - 1; // 배열 인덱스는 0부터 시작
                    

                    if (dayIndex[insertDate] >= 5) {
                        System.out.println("해당 날짜의 일정이 꽉 찼습니다.");
                        break;
                    }

                    System.out.print("일정을 입력하세요: ");
                    String insertDay = sc.nextLine();
                    july[insertDate][dayIndex[insertDate]] = insertDay;
                    dayIndex[insertDate]++;
                    break;

                case 2:
                    // 일정 조회
                    System.out.print("날짜를 입력하세요 (1~31): ");
                    int selectDate = Integer.parseInt(sc.nextLine()) - 1; // 배열 인덱스는 0부터 시작
                    

                    System.out.println("일정을 조회합니다.");
                    for (int i = 0; i < dayIndex[selectDate]; i++) {
                        System.out.println((i + 1) + ". " + july[selectDate][i]);
                    }
                    break;

                case 3:
                    // 일정 변경
                    System.out.print("날짜를 입력하세요 (1~31): ");
                    int updateDate = Integer.parseInt(sc.nextLine()) - 1; // 배열 인덱스는 0부터 시작
                    

                    System.out.print("변경할 번호를 입력하세요: ");
                    int updateIndex = Integer.parseInt(sc.nextLine()) - 1; // 0부터 시작
                    

                    System.out.print("변경할 내용을 입력하세요: ");
                    String updateDay = sc.nextLine();
                    july[updateDate][updateIndex] = updateDay;
                    break;

                case 4:
                    // 일정 삭제
                    System.out.print("날짜를 입력하세요 (1~31): ");
                    int deleteDate = Integer.parseInt(sc.nextLine()) - 1; // 배열 인덱스는 0부터 시작
                    
                    if (dayIndex[deleteDate] < 1) {
                        System.out.println("삭제할 일정이 없습니다.");
                        break;
                    }

                    System.out.println("삭제할 일정을 선택하세요:");
                    for (int i = 0; i < dayIndex[deleteDate]; i++) {
                        System.out.println((i + 1) + ". " + july[deleteDate][i]);
                    }

                    int deleteIndex = Integer.parseInt(sc.nextLine()) - 1; // 0부터 시작
                   

                    for (int i = deleteIndex; i < dayIndex[deleteDate] - 1; i++) {
                        july[deleteDate][i] = july[deleteDate][i + 1];
                    }
                    july[deleteDate][dayIndex[deleteDate] - 1] = ""; // 마지막 요소 비우기
                    dayIndex[deleteDate]--;
                    break;

                case 5:
                    // 종료
                    System.out.println("종료");
                    break loop;

                default:
                    System.out.println("잘못된 입력");
            }
        }
        System.out.println("bye");
        sc.close();
    }
}
