/**
 * 13. 연산자와 두 수가 입력되면  사칙연산하는 프로그램을 작성하시오
 */
package day03.hw;

import java.util.Scanner;

public class Ex13 {
	private static double addTwo(double a, double b) {
		return a + b;
	}

	private static double subTwo(double a, double b) {
		return a - b;
	}

	private static double mulTwo(double a, double b) {
		return a * b;
	}

	private static double divTwo(double a, double b) {
		double result = a / b;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		loop: while (true) {
			int num1;
			int num2;
			
			System.out.println("계산선택(1:덧셈 2:뺄셈 3:곱셈 4:나눗셈 q:종료)");
			String sel = sc.next();
			
			if(sel.equals("q")) break loop;

			System.out.println("두 수 입력");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			switch (sel) {
			case "1":
				System.out.println(addTwo(num1, num2));
				break;
			case "2":
				System.out.println(subTwo(num1, num2));
				break;
			case "3":
				System.out.println(mulTwo(num1, num2));
				break;
			case "4":
				System.out.println(divTwo(num1, num2));
				break;
			default:
				System.out.println("잘못입력");
				break;
			}
		}
	}

}
