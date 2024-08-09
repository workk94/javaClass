package day05;

import java.util.Scanner;

public class _03_국어점수배열 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 배열은 자료형의 기본값으로 초기화 해준다
		int[] kors = new int[5];

		kors[0] = sc.nextInt();
		kors[1] = sc.nextInt();
		kors[2] = sc.nextInt();
		kors[3] = sc.nextInt();
		kors[4] = sc.nextInt();

		/*
		 * for(int i = 0; i<5; i++) { kors[i] = sc.nextInt(); }
		 */

		int total2 = 0;
		double avg2;

		/*
		 * for(int i = 0; i<5; i++) { total2 += kors[i]; }
		 */

		total2 = total2 + kors[0]; // 0 + 90 => 90
		total2 = total2 + kors[1]; // 90 + 80 => 170
		total2 = total2 + kors[2]; // 170 + 70 => 240
		total2 = total2 + kors[3]; // 240 + 88 => 328
		total2 = total2 + kors[4]; // 328 + 100 => 428

		avg2 = total2 / 5.0;
		System.out.println(total2);
		System.out.println(avg2);

	}

}
