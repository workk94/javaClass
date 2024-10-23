package day2.prac;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		
		
		// 수의 제곱 반환
		Function<Integer,Integer> f = (t) -> {
			
			return t * t ;
		};
		
		
		int result1 = f.apply(10);
		
		System.out.println(result1);
		
		
		//수 범위 안의 난수
		
		BiFunction<Integer, Integer, Integer> f2 = (max, min) -> {
			return (int)(Math.random() * (max-min + 1)) + min;
		};
		
		
		int result2 = f2.apply(1, 13);
		
		System.out.println(result2);
		//금액에 대한 화폐매수
		
		
		Function<Integer, Integer> f3 = (t ) -> {
			return 0;
		};
	}
}
