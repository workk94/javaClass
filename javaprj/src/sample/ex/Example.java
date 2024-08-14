package sample.ex;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int randomSu = 0;
		int input = 0;
		randomSu = (int)(Math.random()*100)+1;
		
		
		while(true) {
			System.out.print("숫자를 입력해주세여 : ");
			input = sc.nextInt();
			
			if(randomSu > input) {
				System.out.println("큰수를 입력해주세요");
			} else if(randomSu < input) {
				System.out.println("작은 수를 입력해주세요");
			} else {
				System.out.println("정답입니다");
				return;
			}
			
		}
		
	}
}
