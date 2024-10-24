package day3.collection.연습;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex10 {
	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("딸기");
		list1.add("딸기");
		list1.add("딸기");
		list1.add("포도");

		Iterator<String> it = list1.iterator();
		while (it.hasNext()) {
			String item = it.next();
			System.out.println(item);
		}

		Set<String> set = new HashSet();

		set.add("딸기");
		set.add("딸기");
		set.add("딸기");
		set.add("딸기");
		set.add("딸기");
		set.add("포도");
		
		
		Iterator<String> it2 = set.iterator();
		while(it2.hasNext()) {
			String item = it2.next();
			System.out.println(item);
		}
		
		
		Collection<String> collection =null;
		collection = list1;
		collection = set;
		
		collection.forEach(t -> System.out.println(t));
	}
}
