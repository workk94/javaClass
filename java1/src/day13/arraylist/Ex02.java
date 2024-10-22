package day13.arraylist;

import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(new Score("a", 100, 99));
		list.add(new Score("b", 99, 100));
		list.add(new Score("c", 100, 99));
		list.add(new Score("d", 99, 99));
		list.add(new Score("e", 100, 98));
		
		
		for(int i = 0; i < list.size(); i++) {
			Object o = list.get(i);
			//o.printInfo() // 사용할 수 없다(업캐스팅) => 부모형만큼만 사용할 수 있다.
			
			//다운캐스팅해야 올바르게 Score객체의 기능을 사용할 수 있다 
			
			((Score)o).printInfo();
			System.out.println(o.toString());
		}
		
	}
	
}
