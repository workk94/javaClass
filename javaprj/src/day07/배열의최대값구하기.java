package day07;

public class 배열의최대값구하기 {

	public static void main(String[] args) {
		
		//출력 : 가장 큰 값  : max
		//처리 (준비) : 국어점수 배열 kors(6)
		//반복제어변수 i (반복제어 + 배열의 index)
		
		//max를 가장 작은값 배열의 값의 범위 중에서 가장 작은 값으로 초기화 한다.
		
		
		/**
		 * 0.max를 가장 작은 값으로 준다
		 * 1.반복
		 * 		1.1 배열의 요소와 max 비교(배열의 요소가 max보다 크면)
		 * 			max값을 배열의 요소로 변경한다 
		 * 2.max출력
		 */
		
		int[] kors = new int[] {90, 89, 80, 75, 99, 56};
		int max = 0; // 성적 0 ~ 100
		for(int i = 0; i < kors.length; i++) {
			if(max < kors[i]) {
				max = kors[i];
			}
		}
		
		/**
		 * i	kors[i]		max
		 * 0	90			90
		 * 1	89
		 * 2	80
		 * 3	75
		 * 4	99			99
		 * 5	56
		 */

	}

}
