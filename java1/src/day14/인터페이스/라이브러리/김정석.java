package day14.인터페이스.라이브러리;

import java.util.ArrayList;

public class 김정석 implements MyRunnable{
	
	
	//선택정렬
	@Override
	public void run() {
		int[] arr = {4, 3, 2, 1, 5};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1 ; j < arr.length; j++) {
				int tmp;
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int num : arr) {
			System.out.print(num);
		}
	}
}
