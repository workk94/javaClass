package day04;

import java.util.Scanner;

public class _04_반복문_break {

	public static void main(String[] args) {
		
		
		//반복문 - 탈출하기 break문
		
		Scanner sc = new Scanner(System.in);
		
		while(true) { //무한 loop, 탈출조건을 줘야 한다 
			//수를 입력
			//수를 출력
			//수가 0이면 종료되게 함
			
			int su = sc.nextInt();
			if(su == 0) { //break는 자신이 속한 반복문을 나가게 함 
				break; 
			}
			System.out.println(su);
		}
		System.out.println("bye");
	}

}
