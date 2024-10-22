package day14.제네릭;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(new 인형());
		list.add(new 로봇장난감());
		list.add(3);
		list.add("너도 들어가니");
		
		//
		//다운캐스팅에 대한 불편함
		//어떤객체든 담을 수 있다.
	
		Object o = list.get(0);
		((인형)o).인형놀이하기();
	}
}
