package day01.연습;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

public class ArrayList정렬하기 {
	public static void main(String[] args) {
		
		ArrayList<Acorn> list = new ArrayList<>();

		
		list.add(new Acorn("acorn1", "0000", "황지영"));
		list.add(new Acorn("acorn2", "1234", "하예진"));
		list.add(new Acorn("acorn3", "3456", "최형진"));
		list.add(new Acorn("acorn4", "1234", "최문길"));
		list.add(new Acorn("acorn5", "5678", "주형준"));
		list.add(new Acorn("acorn6", "1090", "주상길"));
		list.add(new Acorn("acorn7", "0000", "정보란"));
		list.add(new Acorn("acorn8", "0000", "이효진"));
		list.add(new Acorn("acorn9", "1234", "주형준"));
		
		
//		Collections.sort(list);
//		
//		list.forEach(new Consumer<Acorn>() {
//
//			@Override
//			public void accept(Acorn t) {
//				System.out.println(t);
//			}
//			
//		});
//		
		
//		Collections.sort(list, new Comparator<Acorn>() {
//
//			@Override
//			public int compare(Acorn o1, Acorn o2) {
//				// TODO Auto-generated method stub
//				return o1.id.compareTo(o2.id) ;
//			}
//		});
//		
//		
//		list.forEach(new Consumer<Acorn>() {
//
//			@Override
//			public void accept(Acorn t) {
//				// TODO Auto-generated method stub
//				
//				System.out.println(t);
//			}
//			
//		});
		
		
		//
		Collections.sort(list, Comparator.comparing(t -> t.pw));
		
		//list.forEach(t -> System.out.println(t));
		
		
		list.forEach(new Consumer<Acorn>() {

			@Override
			public void accept(Acorn t) {
				System.out.println(t);
				
			}
			
		
		});
		
		//list.forEach(t -> System.out.println(t));
	}
}
