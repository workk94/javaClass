package sample.hw;

public class Test {

	public static void main(String[] args) {
		int n = 10;
		int answer = 0; // n이하 홀수인 모든 양의 정수의 합

		if (n % 2 != 0) {
			for (int i = 1; i <= n; i++) {
				if (i % 2 == 1) {
					answer += i;
				}
			}
		} else {
			for (int i = 1; i <= n; i++) {
				if (i % 2 == 0) {
					answer += (int)Math.pow(i, 2);
				}
			}
		}
		
		System.out.println(answer);

	}
}
