package day13.arraylist;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		
		//배열과 같다(가변길이 배열을 제공하는 클래스, 라이브러리이다)
		//중복허용
		//순서보장
		ArrayList list = new ArrayList();
		
		list.add("one");
		list.add("two");
		list.add("three");
		
		int size = list.size();
		System.out.println(size);
		
		Object obj = list.get(0);
		System.out.println(obj);
		
		//다운캐스팅 
		char ch  = ((String) obj).charAt(0);
		System.out.println(ch);
	}
}
