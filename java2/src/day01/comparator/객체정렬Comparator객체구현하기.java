package day01.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class 객체정렬Comparator객체구현하기 {

	public static void main(String[] args) {
		 

		ArrayList<Student2> list  = new ArrayList<>();
		
		
		list.add( new Student2("황지영", 3, 300));
		list.add( new Student2("하예진", 1, 200));
		list.add( new Student2("최형진", 2, 100));
		list.add( new Student2("최문길", 2, 150));
		list.add( new Student2("주형준", 1, 200));
		list.add( new Student2("주상길", 3, 290));
		list.add( new Student2("정보란", 3, 180));
	 
		
		
		Collections.sort( list,  new Comparator<Student2>() {
			@Override
			public int compare(Student2 o1, Student2 o2) {
				// TODO Auto-generated method stub
				return  o1.getBan()  - o2.getBan();
	     }});

		 
		
		System.out.println(  list);
		
		
		
	

	}

}



//


 