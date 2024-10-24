package day3.collection.연습;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

public class Ex06 {
	public static void main(String[] args) {

		// 맵출력
		Map<String, Integer> map = new HashMap<>();

		map.put("사과", 100);
		map.put("딸기", 150);
		map.put("오렌지", 100);

		map.forEach((k, v) -> System.out.println(k + ":" + v));
		
		
	 	Iterator <Entry<String, Integer>> it =  map.entrySet().iterator();
	 	
	 	while(it.hasNext()) {
	 		Entry<String, Integer> item = it.next();
	 		System.out.println(item.getKey());
	 		System.out.println(item.getValue());
	 	}
	}
}
