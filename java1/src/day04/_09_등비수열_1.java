package day04;

public class _09_등비수열_1 {

	public static void main(String[] args) {
		//변수선언
		int commonRatio = 3;
		int firstTerm = 2;
		int currentTerm = firstTerm;
		int sum = 2;
		
		// 2 6 18 54 162 486 1458
		for(int i=2; i<=7; i++) {
			currentTerm = currentTerm * commonRatio;
			sum += currentTerm;
			System.out.print(currentTerm + ",");
		}
		
		System.out.println();
		System.out.println(sum);
	}

}
