package day13.arraylist;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList<Score> list = new ArrayList<>();
		
		list.add(new Score("a", 100, 99));
		list.add(new Score("b", 99, 100));
		list.add(new Score("c", 100, 99));
		list.add(new Score("d", 99, 99));
		list.add(new Score("e", 100, 98));
		
		
		//담으려고 하는 것 이외에 것들이 들어가는걸 방지함
		//Score로 형변환 알아서 해줌(형변환의 번거러움을 해결해줌 : 제네릭)
		//다운캐스팅 안해도 됨 
		for(int i = 0; i < list.size(); i++) {
			Score s = list.get(i);
			System.out.println(s.toString());
			
			s.printInfo();
			
		}
		
	}
}
