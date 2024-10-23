package day2.prac;

import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		
		
		//Consumer<T> : T -> void
		Consumer<Integer> c = (money) -> {
			
			
			money -= 10000;
			System.out.println("당근구입");
			
			money -= 10000;
			System.out.println("대파구입");
			
			System.out.println(money);
		};
		
		c.accept(30000);
	}
	
}
