package day4.계산기실습;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("두 수를 입력하세요.. 계산해 드립니다 ver2");

		int su1, su2;
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		int total;

		// total = su1 + su2;
		AcornCalculator cal = new AcornCalculator(); // 라이브러리, 의존성(dependency)
		total = cal.add(su1, su2);

		System.out.println("두수의 결과 : " + total);
	}
}
