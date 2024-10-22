package day01.연습;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;


//결정할수 없는 코드는 인터페이스로 만들어놓음 기준을 사용자가 정해야함 

public class ArrayList출력하기 {
	public static void main(String[] args) {
		ArrayList<Acorn> list = new ArrayList<>();
		
		list.add( new Acorn( "acorn1", "0000", "황지영"));
		list.add( new Acorn( "acorn2", "1234", "하예진"));
		list.add( new Acorn( "acorn3", "3456", "최형진"));
		list.add( new Acorn( "acorn4", "1234", "최문길"));
		list.add( new Acorn( "acorn5", "5678", "주형준"));
		list.add( new Acorn( "acorn6", "1090", "주상길"));
		list.add( new Acorn( "acorn7", "0000", "정보란"));
		list.add( new Acorn( "acorn8", "0000", "이효진"));
		list.add( new Acorn( "acorn9", "1234", "주형준"));
		
		// 
		for(int i = 0; i < list.size(); i++) {
			Acorn acorn = list.get(i);
			System.out.println(acorn);
		}
		
		// 
		for(Acorn acorn : list) {
			System.out.println(acorn);
		}
		
		//
		
		class ConsumerImpl implements Consumer<Acorn>{

			@Override
			public void accept(Acorn t) {
				System.out.println(t + "^^");
				
			}
			
		}
		
		list.forEach(new ConsumerImpl());
		
		list.forEach(new Consumer<Acorn>() {

			@Override
			public void accept(Acorn t) {
				System.out.println(t + "^________^");
				
			}
			
		});
		
		
		
		list.forEach(t -> System.out.println(t + "^^!!!!!"));
		
	}
}
