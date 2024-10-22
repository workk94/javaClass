package day01.연습;

public class 문자열정렬하기 {
	public static void main(String[] args) {

		String str = "hello";

		
		  
		String[] a = new String[5]; // 기본자료형으로 초기화 참조형의 기본자료형은 null 
		a[0] = "아이스 아메리카노"; a[1] = "딸기 스무디"; a[2] = "망고주스"; a[3] = "라떼"; a[4] = "모카";
		 
		String[] arr = {"bbb", "bbc" , "ddd", "ccc", "aaa"}; // 사전상 정렬

		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i+1 ; j < arr.length; j++) {
				
				// 기준이 크면 양수, 작으면 음수, 같으면 0 
				if(arr[i].compareTo(arr[j]) > 0) { // 양수, 음수, 0
					
					// 
					String tmp;
					
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		
		for(String s : arr) {
			System.out.println(s);
		}
	}
}
