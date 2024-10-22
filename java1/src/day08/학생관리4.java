package day08;

import java.util.Scanner;

public class 학생관리4 {
	static Scanner sc = new Scanner(System.in); // static 변수 : 전역변수 

	public static void main(String[] args) {
		// 5명 학생관리
		String[] arr = new String[5]; // 배열
		int index = 0;
		
		loop:while(true) {
			System.out.println("메뉴선택 1.등록, 2.조회, 3.변경, 4.종료");
			int menu = sc.nextInt();
			sc.nextLine(); // 버퍼지우기
			switch(menu) {
			case 1:
				index = register(arr, index);
				break;
			case 2:
				printArr(arr, index);
				break;
			case 3:
				update(arr);
				break;
			case 4:
				System.out.println("종료합니다");
				break loop;
			default:
				System.out.println("잘못된 메뉴");
			}
		
		}
	}
	
	// 등록하기					배열의정보,   배열의 index
	public static int register(String[] arr, int index) {
		System.out.println("등록합니다");
		String name = sc.nextLine();
		arr[index] = name;
		index++;
		return index;
	}
	
	
	// 조회하기 
	public static void printArr(String[] arr, int index) {
		for(int i = 0; i < index; i++) {
			System.out.println(arr[i]);
		}
	}
	
	//변경하기
	public static void update(String[] arr) {
		System.out.println("변경합니다");
		System.out.println("변경할 번호");
		int select = sc.nextInt() - 1;
		sc.nextLine();
		
		System.out.println("새로운 이름");
		String newName = sc.nextLine();
		arr[select] = newName;
	}
}
