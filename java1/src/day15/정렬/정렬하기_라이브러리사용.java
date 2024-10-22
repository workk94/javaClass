package day15.정렬;

import java.util.Arrays;

public class 정렬하기_라이브러리사용 {
	public static void main(String[] args) {
		
		String[] names = {"aaa", "bbb", "ccc"};
		
		//배열정렬
		Arrays.sort(names);
		String resultNames = Arrays.toString(names);
		System.out.println(resultNames);
		
			
		//배열요소가 Comparable 구현
		Score[] arr = new Score[3];

		arr[0] = new Score("aaa", 90, 71);
		arr[1] = new Score("bbb", 70, 99);
		arr[2] = new Score("ccc", 90, 89);

		for (Score score : arr) {
			System.out.println(score); // score.toString()
		}
		
		
		Arrays.sort(arr);
	}
}
