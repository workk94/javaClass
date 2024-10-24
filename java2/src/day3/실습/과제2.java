package day3.실습;

import java.util.Random;
import java.util.stream.IntStream;

public class 과제2 {
	public static void main(String[] args) {
		
		// 난수 스트림을 만들고 짝수의 합 구하기 
		IntStream is = new Random().ints(1,10).limit(10);
		
		int result = is.filter(n -> n % 2 == 0).sum();
		System.out.println(result);
	}
}
