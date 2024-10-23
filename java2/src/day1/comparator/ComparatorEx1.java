package day1.comparator;

import java.util.*;
import java.util.stream.*;

class ComparatorEx1 {
	public static void main(String[] args) {
		
		
		ArrayList<Student> list  = new ArrayList<>();
		list.add( new Student("이자바", 3, 300));
		list.add( new Student("김자바", 1, 200));
		list.add( new Student("홍자바", 2, 100));
		list.add( new Student("최자바", 2, 150));
		list.add( new Student("황자바", 1, 200));
		list.add( new Student("문자바", 3, 290));
		list.add( new Student("이자바", 3, 180));
	 
		 
		
		Stream<Student> studentStream =  list.stream();
		 
	     
	    
	     //  Comparator인터페이스에 이미 구현된 매서드(default 매서드가 제공된다 ) 
	     //  Comparator인터페이스에 디폴트매서드 사용해보기
	     
	     studentStream.sorted(Comparator.comparing(Student::getBan) // 반별 정렬
			    	  .thenComparing(Comparator.naturalOrder()))    // 기본 정렬   // 객체가 정렬의 기준을 가지고 있어야함 
	                                                                             // Comparable을 구현해야 함
					  .forEach(System.out::println);
	      
	     
	     
	     
	   /*  직접구현
	    * 
	        studentStream.sorted((student1, student2) -> {
	    	    // 먼저 반별로 정렬
	    	    int banComparison = student1.getBan()- student2.getBan();	    	    
	    	    // 반별로 정렬한 결과가 같다면 총점이 높은 순으로 내림차순정렬
	    	    return (banComparison == 0) ?  student2.getTotalScore() - student1.getTotalScore()  : banComparison;
	    	})
	    	.forEach( s -> System.out.println(s)); 
	       
	     */  
	      
	   
	     
	     //반별로 정렬  같은반인경우 총점이 높은 순으로 정렬 
	     
	     
	     
	}
}



class Student implements Comparable<Student> {
	String name;
	int ban;
	int totalScore;

	Student(String name, int ban, int totalScore) { 
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

   // 총점 내림차순을 기본 정렬로 한다.
	public int compareTo(Student s) { 
		return s.totalScore - this.totalScore;
	}
}
