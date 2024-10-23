package day1.arrayList_forEach;

import java.util.ArrayList;
import java.util.function.Consumer;

    

public class ArrayList출력하기 {

	public static void main(String[] args) {
      ArrayList<Acorn> list  = new ArrayList<>();
		
		
		list.add( new Acorn( "acorn1", "0000", "황지영"));
		list.add( new Acorn( "acorn2", "1234", "하예진"));
		list.add( new Acorn( "acorn3", "3456", "최형진"));
		list.add( new Acorn( "acorn4", "1234", "최문길"));
		list.add( new Acorn( "acorn5", "5678", "주형준"));
		list.add( new Acorn( "acorn6", "1090", "주상길"));
		list.add( new Acorn( "acorn7", "0000", "정보란"));
		list.add( new Acorn( "acorn8", "0000", "이효진"));
		list.add( new Acorn( "acorn9", "1234", "주형준"));
	 
	 
		
		// list.forEach(  매개변수로 인터페이스  );  
		// list.반복하기(   반복할 코드 );
		// 반복할코드는 모두가 다르다 
		// 반복할코드까지 미리 라이브러리로 만들 수는 없다.
		// 각자가 구현하게 끔 만들어 두었다 !!
		// 약속(인터페이스)
		
		list.forEach( new Consumer<Acorn>() {

			@Override
			public void accept(Acorn t) {
				    System.out.println( t);
				
			}});
		

	}

}
