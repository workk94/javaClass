package day04;

public class _07_반복문01 {

	public static void main(String[] args) {
		System.out.println("안녕");

		//
		System.out.println("안녕");
		System.out.println("안녕");
		System.out.println("안녕");
		
		System.out.println("반복문");
		// 반복문
		for (int i = 1; i <= 3; i++) {
			System.out.println("안녕");

		}
		
		//2단출력
		System.out.println(2*1);
		System.out.println(2*2);
		System.out.println(2*3);
		System.out.println(2*4);
		System.out.println(2*5);
		System.out.println(2*6);
		System.out.println(2*7);
		System.out.println(2*8);
		System.out.println(2*9);

		System.out.println("반복문 2");
		for(int i=1; i<=9; i++) {
			System.out.println(2*i);
		}
		
		/**
		 * 반복문 안쓰고 어떻게 될지 예측해보기 
		 * i	2*i
		 * 
		 * 1	2*1
		 * 2	2*2
		 * 3	2*3
		 * 4	2*4
		 * 5	2*5
		 * 6	2*6
		 * 7	2*7
		 * 8	2*8
		 * 9	2*9
		 */
	}

}
