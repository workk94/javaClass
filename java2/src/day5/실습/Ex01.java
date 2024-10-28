package day5.실습;

public class Ex01 {
	public static void main(String[] args) {
		
		// 별 5개 재귀 
		printStarRec(5);
	}
	
	
	private static void printStarRec(int n) {
		// 종료조건
		if(n == 1) {
			System.out.println("*");
		} else {
			for(int i = 0; i < n; i++) {
				System.out.print("*");
			}
			System.out.println();
			printStarRec(n-1); // 재귀 
		}
	}
}

