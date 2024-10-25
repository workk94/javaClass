package day4.계산기실습;

import java.util.Scanner;

public class Program4 {

	// 실행해 주는 매서드
	//AcornCalculator cal = new AcornCalculator();  // 변경되는부분
	
	//KakaoCalculator로 변경할시 변경할 것이 많아진다 !!!
	KakaoCalculator cal = new KakaoCalculator();

	public void run() {

		System.out.println("두 수를 입력하세요.. 계산해드립니다 ver3");

		Scanner sc = new Scanner(System.in);

		int su1, su2;
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		
		// 계산
//		int total = cal.add(su1, su2); // 변경되는부분
		int total = cal.addKakao(su1, su2);
		
		System.out.println("결과 : " + total);
	}

	public static void main(String[] args) {
		Program4 p = new Program4();

		p.run();
	}
}
