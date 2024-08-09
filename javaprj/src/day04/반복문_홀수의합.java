//6
package day04;

public class 반복문_홀수의합 {

	public static void main(String[] args) {

		//홀수의 합
		// 1 2 3 4 5 6 7 8 9 10
		// 1 2 3 4 5 6 7 8 9 10
		int sum = 0;
		
		
		for(int i = 1; i<=10; i++) {
			if(i%2 !=0) { // 홀수이면 (i%2==1)
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
