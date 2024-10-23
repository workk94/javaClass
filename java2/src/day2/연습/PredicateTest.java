package day2.연습;

import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		/**
		 * 
		 * interface Predicate<T>{ Boolean test(T t ); }
		 * 
		 */

		// Predicate<String> p = (str) -> false;
		Predicate<String> p = (str) -> {
			return false;
		};

		boolean rtn = p.test("hello");

		System.out.println(rtn);
		
		
		Predicate<String> p2 = (str) -> {
			if(str.equals("stop")) {
				return true;
			} else {
				return false;
			}
		};
		
		
		boolean rtn2 = p2.test("stop!!!");
		
		}
}
