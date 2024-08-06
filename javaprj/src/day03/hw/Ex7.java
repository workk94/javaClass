/**
 * 7. 수를입력받아서 짝수의 합을 구하세요 ( 10개의 수를 입력)
 */
package day03.hw;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			input = sc.nextInt();
			if(input %2 == 0) {
				sum += input;
			}
		}
		
		System.out.println(sum);

	}

}
