package day3.collection.연습;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ex07 {
	public static void main(String[] args) {
		ArrayList<String> 과일목록 = new ArrayList<>();
		
		
		과일목록.add("딸기");
		과일목록.add("사과");
		과일목록.add("포도");
		과일목록.add("배");
		
		ArrayList<String> 음료목록 = new ArrayList<>();
		
		음료목록.add("아메리카노");
		음료목록.add("라떼");
		음료목록.add("망고주스");
		음료목록.add("아이스티");
		
		
		Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		
		map.put("음료", 음료목록);
		map.put("과일", 과일목록);
		
		ArrayList<String> list1 = map.get("음료");
		
		list1.forEach(item -> System.out.println(item));
	}
}
