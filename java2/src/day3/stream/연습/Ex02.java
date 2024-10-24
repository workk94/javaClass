package day3.stream.연습;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex02 {

	public static void main(String[] args) {
		
		// 
		int[] arr = {1,2,3,4,5};
		
		
		// 홀수만 filter로 처리해서 합을 구하기 
		int sum = Arrays.stream(arr).filter( n -> n % 2 == 1).sum();
		
		System.out.println(sum);
		
		int total = 0 ;
		
		for(int n : arr) {
			if(n % 2 == 1) {
				
				total += n;
			}
		}
		System.out.println(total);
	
	}

}
