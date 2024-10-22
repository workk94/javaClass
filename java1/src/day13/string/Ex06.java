package day13.string;

import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) {
		String str = "apple";
		String str2 = "banana";
		
		//문자열의 비교
		
		int result = str.compareTo(str2); // 음수
		System.out.println(result);
		
		
		String[] arr = {"banana", "apple", "tomato"};
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i].compareTo(arr[j]) > 0) { //0보다 크다(양수면) 
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));;
		
		
		
		//정렬연습(선택정렬)
		int[] arr2 = {80, 60, 77, 55, 97};
		
		for(int i = 0; i < arr2.length-1; i++) {
			for(int j = i+1; j < arr2.length; j++) {
				if(arr2[i] > arr2[j]) {
					int temp;
					temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr2));
		
		//두 값 교환 
		int a = 10;
		int b = 7;
		int tmp;
		tmp = a;
		a = b; 
		b = tmp;
		
		System.out.println(a);
		System.out.println(b);
		
	}
}
