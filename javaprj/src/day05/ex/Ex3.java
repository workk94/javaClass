package day05.ex;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int[] temperatures = { 33, 35, 32, 35, 36, 35, 34 };
		int[] numbers = new int[20];
		int[] divisor = new int[20];
		double sum = 0;
		double avg = 0;
		int cnt = 0; 
		
		Scanner sc = new Scanner(System.in);

		// 1) 수가 입력될 때 짝수만 배열에 담기 ( 0이 입력되면 그만한다)
		int idx = 0;
		while(true) {
			if(idx > 19) break;
			int input = sc.nextInt();
			if(input == 0) {
				break;
			}
			if(input % 2 == 0) {
				numbers[idx] = input;
				idx++;
			}
		}
		
		for(int i = 0; i<numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		// 2) 배열의 평균값보다 큰 요소의 개수 구하기
		for(int i = 0; i < temperatures.length; i++) {
			sum += temperatures[i];
		}
		avg = sum / temperatures.length; // 평균값 구하기
		
		for(int i = 0; i < temperatures.length; i++) {
			if(temperatures[i] > avg) {
				cnt++;
			}
		}
		
		System.out.println();
		System.out.println(avg);
		System.out.println(cnt);
		
		
		/**
		 * 3) 임의의 수가 입력되고 입력한 수에 대한 약수를 배열에 저장하고 출력하기 
		 * 배열사용하지 않기 
		 * 배열을 사용하여 약수를 모두 구한 후 한꺼번에 출력하기
		 */
		
//		// 배열사용 x 
//		int n = sc.nextInt();
//		for(int i = 1; i <= n; i++) {
//			if(n % (double)i == 0) {
//				System.out.print(i + " ");
//			}
//		}
		
		// 배열 사용 
		int n = sc.nextInt();
		idx = 0;
		for(int i = 1; i <= n; i++) {
			if(n % (double)i == 0) {
				divisor[idx++] = i;
			}
		}
		
		for(int i = 0 ; i < divisor.length; i++) {
			System.out.print(divisor[i] + " ");
		}
	}

}
