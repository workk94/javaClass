package day06;

import java.util.Scanner;

public class _02_짝수코딩2 {

	public static void main(String[] args) {
		
		
		/*1. 반복
		 * - 수입력
		 * - 수판단(짝수)
		 * - 배열의 요소에 저장 (짝수배열의 첨자로 사용함)
		 * - 배열요소에 저장
		 * 2. 배열출력
		*/
		
		
		int[] even_arr = new int[10];
		int input; //입력
		int cnt = 0; //짝수배열의 인덱스로 사용
		
		Scanner sc = new Scanner(System.in);
		
		for(int i =1; i<=10; i++) { // i => 반복을 제어할 용도로 사용함
			input = sc.nextInt();
			if(input % 2 ==0) { // 짝수발견
				even_arr[cnt++]=input;
			}
		}
		
		//배열출력
		
		for(int i = 0; i < cnt; i++) {
			System.out.println(even_arr[i]);
		}
	}

}
