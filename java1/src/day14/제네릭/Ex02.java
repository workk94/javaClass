package day14.제네릭;

import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
		ArrayList<Toy> list = new ArrayList<>();
		
		//list.add("안녕"); 담을 수 없다
		
		//Toy만 가능함
		list.add(new 인형());
		list.add(new 로봇장난감());
		list.add(new Toy());
		
		//Toy형변환 해줌 
		Toy a = list.get(0);
		Toy b = list.get(1);
		Toy c = list.get(2);
		
		//각기 다른 객체를 담아야 하는 경우에는 Object 사용하면 됨 
		ArrayList<Object> list2 = new ArrayList<>();
		list2.add("안녕");
		list2.add(3);
	
	}
}
