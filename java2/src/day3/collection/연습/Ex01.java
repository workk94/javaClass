package day3.collection.연습;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {
	
	
	public static void main(String[] args) {
		
		//
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("딸기");
		list1.add("딸기");
		list1.add("딸기");
		list1.add("포도");
		
		//list1.forEach(t -> System.out.println(t));
		
		LinkedList<String> list2 = new LinkedList<>();
		list2.add("딸기");
		list2.add("딸기");
		list2.add("딸기");
		list2.add("포도");
		
		List list = null;
		//list = list1;
		
		
		list = list2;
		
		list.forEach(item -> System.out.println(item));
		
	}
}
