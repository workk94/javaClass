package day10.staticEx;

import java.util.Random;

public class Math_Random {

	public static void main(String[] args) {
		int result = Math.max(5, 3);
		System.out.println(result);
		
		//
		Random r = new Random();
		int result2 = r.nextInt(10);
		
		System.out.println(result2);
	}

}
