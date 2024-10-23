package day1.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class 객체정렬Comparable구현하기 {

	public static void main(String[] args) {
		 

		ArrayList<Student> list  = new ArrayList<>();
		
		list.add( new Student("황지영", 3, 300));
		list.add( new Student("하예진", 1, 200));
		list.add( new Student("최형진", 2, 100));
		list.add( new Student("최문길", 2, 150));
		list.add( new Student("주형준", 1, 200));
		list.add( new Student("주상길", 3, 290));
		list.add( new Student("정보란", 3, 180));
	 
		
		
		Collections.sort( list ); 
		
		System.out.println(  list);
		
		
		
	

	}

}



//


 