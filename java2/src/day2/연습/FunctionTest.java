package day2.연습;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		/**
		 * 
		 * interface Function<T,R> {
		 * R apply (T t)
		 * }
		 */
		
		
		//매개변수 한개 
		//반환 o 
		Function<Integer, String> f = (su) -> {
			int result = su*2;
			String result2 = result + "수고했습니다";
			
			return result2;
			
		};
		
		
		String result1 = f.apply(2000);
		System.out.println(result1);
		
		
		Function<Integer, int[] > f2 = (amt) -> {
			int [] arr = {8,1,10,10,5,7};
			
			return arr;
		};
		
		int[] result2 =f2.apply(352100);
		
		System.out.println(Arrays.toString(result2));
		
		
		Function<Integer, Integer> f3 = new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t*3;
			}
		};
		
		
		int result3 = f3.apply(1000);
		
		System.out.println(result3);
	}
}
