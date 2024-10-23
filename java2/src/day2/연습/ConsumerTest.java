package day2.연습;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		
		
		/**
		 * interface Consumer<T>{
		 * 	void accept(T t)
		 * }
		 */
		
		
		
		//매개변수가 있고 반환이 없는 것
		
		//정수형타입을 입력으로 받고 사용하는 것이다
		
		Consumer<Integer> c = su -> System.out.println(su);
		
		c.accept(10);
		
		Consumer<Integer> c2 = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				
				System.out.println(t * 2);
				
			}
		};
		
		
		c2.accept(1000);
		
		
		Consumer<Integer> c3 = (amt) -> {
			
			System.out.println("받은 금액 " + amt);
			amt -= 1000;
			
			System.out.println(amt);
		};
		
		
		c3.accept(100000);
		
		
		//
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		list.forEach(item -> System.out.println(item));
		
		
		/*
		 * list.forEach(new Consumer<Object>() {
		 * 
		 * @Override public void accept(Object t) { // TODO Auto-generated method stub
		 * System.out.println(t);
		 * 
		 * }
		 * 
		 * 
		 * });
		 */
		
		
		
		list.forEach(new Consumer<String> () {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
			
		});
		
		
		// 1.8
		
		list.forEach(t -> System.out.println(t));
	}

}
