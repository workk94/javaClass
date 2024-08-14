package sample.ex;

public class Ex1 {

	public static void main(String[] args) {
		int sum = 0;
		int prefixSum = 0;
		
		for(int i = 1; i < 100; i++) {
			System.out.println(i + "번쨰 항 " + sum + " 누적합 "+ prefixSum);
			for(int j = 1 ; j <= i; j++) {
				sum += j;
			}
			prefixSum += sum;
		}
		System.out.println(prefixSum);

	}

}
