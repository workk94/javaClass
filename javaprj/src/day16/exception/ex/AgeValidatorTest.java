package day16.exception.ex;

import java.util.Scanner;

public class AgeValidatorTest {
	public static void main(String[] args) {
		AgeValidator ac = new AgeValidator();
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("나이 입력 : ");
			int age = sc.nextInt();
			
			boolean result = ac.isAudult(age);
		} catch (AgeOutOfRangeException e) {
			String m = e.getMessage();
			System.out.println(m);
		}
		
		
		System.out.println("프로그램 종료");
	}
}
