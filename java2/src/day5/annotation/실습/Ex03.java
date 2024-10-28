package day5.annotation.실습;

import java.util.ArrayList;

public class Ex03 {
	
	//warning 주는 거 무시하겠음 
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("딸기");
		list.add("포도");
		list.add("사과");
		
		list.forEach(t -> System.out.println(t));
	}
}
