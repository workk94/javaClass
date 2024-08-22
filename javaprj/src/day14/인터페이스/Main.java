package day14.인터페이스;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		_김정석 a = new _김정석();
		
		//a.많이먹다();
		
		
		많이먹는게가능한 b = a;
		
		//b.많이먹다();
		
		김정석2 c = new 김정석2();
		
		//
		ArrayList <많이먹는게가능한> list = new ArrayList<>();
		list.add(a);
		list.add(c);
		
		for(int i = 0; i <list.size(); i++) {
			list.get(i).많이먹다();
		}
	}
}
