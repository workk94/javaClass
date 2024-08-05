//3. 사용자로부터 수를 입력받아 입력받은 수까지의 합 구하기
package day03.hw;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		String input;
		
		// q:종료
		while(true) {
			input = sc.next();
			if(input.equals("q")) {
				System.out.println("quit");
				System.out.println("sum : " + sum);
				break;
			}
			sum += Integer.parseInt(input);
		}
		
		

	}

}
