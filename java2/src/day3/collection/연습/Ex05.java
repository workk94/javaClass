package day3.collection.연습;

import java.util.HashMap;
import java.util.Map;

public class Ex05 {
	public static void main(String[] args) {
		
		
		//key, value 데이터를 저장할 때 사용
		
		Map<String, Integer > map = new HashMap<>();
		
		map.put("사과", 100);
		map.put("딸기", 150);
		map.put("오렌지", 100);
		
		//key
		// KeySet()
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		
		
		//value
		//values()
		
		for(Integer value : map.values()) {
			System.out.println(value);
		}
		
		
		//객체 형태로 가져올 수 있음 Entry
		
		
		for(Map.Entry<String, Integer> item : map.entrySet()) {
			
			System.out.print(item.getKey() + ":");
			System.out.println(item.getValue());
		}
	}
}
