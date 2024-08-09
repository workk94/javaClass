//2
package day05;

public class 변수와배열2 {

	public static void main(String[] args) {

		// 국어점수 5개에 대한 총점과 평균구하기
		int kor1 = 90, kor2 = 80, kor3 = 70, kor4 = 88, kor5 = 100;
		int total;
		double avg;

		total = kor1 + kor2 + kor3 + kor4 + kor5;
		avg = (double) total / 5; // 정수 + 정수 => 정수연산, 결과도 정수이다
		System.out.println(total);
		System.out.println(avg); // 실수형의 연산으로 되려면 실수형으로 형변환 해야한다

		
		//국어점수 => 배열로 다루기
		
		int[] kors = new int[5];
		kors[0] = 90;
		kors[1] = 80;
		kors[2] = 70;
		kors[3] = 88;
		kors[4] = 100;
		
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
