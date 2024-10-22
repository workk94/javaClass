package day01.연습;

public class 숫자정렬하기 {
	public static void main(String[] args) {
		
		
		//
		
		int[] arr = {7, 15, 3, 9, 5};
		
		
		
		//정렬하기
		
		//선택정렬
		
		// i: 기준 j: 비교
		
		for(int i = 0; i < arr.length - 1 ; i++) {
			for(int j = i+1; j < arr.length; j++) {
				
				if(arr[i] > arr[j]) {  // 오름차순 
					//i번째 요소 j번째 요소 
					int tmp;
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int n : arr) {
			System.out.print(n + " ");
		}
	}
}
