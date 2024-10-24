package day3.collection.연습;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {
	
	
	public static void main(String[] args) {
		
		// 중복허용 x, 
		Set<String> set  = new HashSet<>();
		
		set.add("딸기");
		set.add("딸기");
		set.add("딸기");
		set.add("딸기");
		set.add("포도");
		set.add("딸기");
		set.add("딸기");
		set.add("딸기");
		
		//set.forEach(e -> System.out.println(e));
		
		for(String item : set) {
			System.out.println(item);
		}
		
		
		
		
	}
}
