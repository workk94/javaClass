package day01.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class 객체정렬Comparator_Comparing사용하기 {

	public static void main(String[] args) {
		 

		ArrayList<Student> list  = new ArrayList<>();
		list.add( new Student("황지영", 3, 300));
		list.add( new Student("하예진", 1, 200));
		list.add( new Student("최형진", 2, 100));
		list.add( new Student("최문길", 2, 150));
		list.add( new Student("주형준", 1, 200));
		list.add( new Student("주상길", 3, 290));
		list.add( new Student("정보란", 3, 180));
	 
		
		
		 
		
		// Comparator  인터페이스에 있는  Comparing매서드를 사용하기 : static  
		
		 Collections.sort(list,  Comparator.comparing(  s -> s.getBan()));		 
		//반으로 오름차순
		System.out.println( list );
		
		
		//이름으로 오름차순		
		Collections.sort(  list, Comparator.comparing( s->s.getName()));		
		System.out.println(  list);
		
		 

	}

}



//




class Student2   {
	String name;
	int ban;
	int totalScore;

	Student2(String name, int ban, int totalScore) { 
		this.name =name;
		this.ban =ban;
		this.totalScore =totalScore;
	}

	public String toString() { 
	    return String.format("[%s, %d, %d]", name, ban, totalScore).toString(); 
	}

	String getName()     { return name;}
	int getBan()         { return ban;}
	int getTotalScore()  { return totalScore;}

}
