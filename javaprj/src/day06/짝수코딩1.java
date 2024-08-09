//1
package day06;

import java.util.Scanner;

public class 짝수코딩1 {

	public static void main(String[] args) {
		// 수가 입력되면 짝수만 출력하는 프로그램을 작성하시오
		// 단 모두 짝수가 한번에 출력될 수 있도록 하시오
		// 배열을 사용
		
		int[] even_arr = new int[10]; //출력
		int input; // 입력변수 
		
		
		/*1. 반복
		 * - 수입력
		 * - 수판단(짝수)
		 * - 배열의 요소에 저장 
		 * 2. 배열출력
		*/
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) { // i => 10번 반복제어, 배열의 첨자 사용
			input = sc.nextInt();
			if(input % 2 == 0) {
				even_arr[i] = input;
			}
		}
		
		//배열출력
		for(int i = 0; i < even_arr.length; i++) { 
			System.out.println(even_arr[i]);
		}
		
	}

}
