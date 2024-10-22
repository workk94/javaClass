package day08;

import java.util.Scanner;

public class 학생관리2 {

	public static void main(String[] args) {
		// 5명 학생관리
		
		String[] arr = new String[5]; // 배열
		int index = 0;
		
		Scanner sc = new Scanner(System.in);
		
		loop:while(true) {
			System.out.println("메뉴선택 1.등록, 2.조회, 3.변경, 4.종료");
		
			int menu = sc.nextInt();
			
			sc.nextLine(); // 버퍼지우기
			
			switch(menu) {
			case 1:
				System.out.println("등록합니다");
				String name = sc.nextLine();
				arr[index] = name;
				index++;
				break;
			case 2:
				System.out.println("조회합니다");
				for(int i = 0; i < index; i++) {
					System.out.println(arr[i]);
				}
				break;
			case 3:
				System.out.println("변경합니다");
				break;
			case 4:
				System.out.println("종료합니다");
				break loop;
			default:
				System.out.println("잘못된 메뉴");
			}
		
		}
	}

}
