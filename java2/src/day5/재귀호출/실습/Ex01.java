package day5.재귀호출.실습;

public class Ex01 {
	public static void main(String[] args) {
		int result = getTotal(5);
		
		System.out.println(result);
		
		
		result = getTotalRec(5);
		System.out.println(result);
	}

	// 1 ~ su까지 합
	static int getTotal(int su) { // su = 5
		int sum = 0;
		for (int i = 1; i <= su; i++) {
			sum += i; // i = 1, 2,3,4,5
		}
		return sum;
	}
	

	// 1 ~ su까지의 합
	// 재귀 함수를 이용해서 풀어보기
	
	/**
	 * 1 2 3 4 5 
	 * 
	 * 
	 * 5까지의 합 => 5+(4까지의 합)
	 * 4까지의 합 => 4+(3까지의 합)
	 * 3까지의 합 => 3+(2까지의 합)
	 * 2까지의 합 => 2+(1까지의 합)
	 * 1까지의 합 => 1 
	 */
	
	
	static int getTotalRec(int su) {
		// 종료조건 
		
		if(su == 1) {
			return 1;
		} else {
			return su + getTotalRec(su -1);
		}
	}
}
