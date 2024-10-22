package day14.인터페이스.계산기;

import java.util.Scanner;

public class 계산프로그램 {

	// SMCalculator cal;

	LGCalculator cal;

	// public void setCal(SMCalculator cal) {
	public void setCal(LGCalculator cal) {
		this.cal = cal;
	}

	public void run() {
		// 시작
		Scanner sc = new Scanner(System.in);
		System.out.println(" 두수 입력하세요");
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();

		sc.nextLine();

		System.out.println("연산자를 입력하세요");

		String op = sc.nextLine();

		switch (op) {
		case "+":
			//int result = cal.add(su1, su2);
			int result = cal.addLg(su1, su2);
			System.out.println(result);
			break;
		case "-":
			//int result2 = cal.sub(su1, su2);
			int result2 = cal.subLg(su1, su2);
			System.out.println(result2);
		}
	}

	public static void main(String[] args) {
		계산프로그램 p = new 계산프로그램();
		//p.setCal(new SMCalculator());
		p.setCal(new LGCalculator());
		p.run();

	}

}
