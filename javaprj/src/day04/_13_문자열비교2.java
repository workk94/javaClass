package day04;

import java.util.Scanner;

public class _13_문자열비교2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String input = sc.nextLine();
			
			if(input.equals("stop")) break;
			System.out.println(input);
		}
	}

}
