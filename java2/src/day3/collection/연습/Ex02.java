package day3.collection.연습;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("딸기");
		list.add("포도");
		list.add("바나나");
		
		list.forEach(e -> System.out.println(e));
		
		
		
	}
	
	
}
