//3
package day06;

public class 배열1차원생성및메모리구조 {

	public static void main(String[] args) {
		
	
		int[] arr = new int[5]; //배열은 자료형의 기본값으로 초기화한다
		int[] arr2 = {1, 90, 5, 9, 7}; //배열의 초기화
		
		int[] arr3;
		arr3 = new int[5];
		
		
		int[] arr4 = new int[] {1, 90, 5, 9, 7};
		
		
		//출력
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int i = 0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		for(int i = 0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		for(int i = 0; i<arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		
		
		
	}

}
