//5
package day04;

public class 반복문_건너뛰기 {

	public static void main(String[] args) {

		// continue: 반복문 건너뛰기 

		// 홀수의 합 1~10의 합

		// 1 2 3 4 5 6 7 8 9 10
		// 1 3 5 7 9 
		
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue; // 다음반복으로 진행함, continue 아래의 코드가 수행되지 않고 다음 반복으로 진행함
			}
			sum += i; // => 짝수일 때는 이 코드가 수행되지 않도록 건너뛰기
		}
		System.out.println("홀수의 합 : " + sum);
	}

}
