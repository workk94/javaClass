package day3.stream.연습;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class Ex06 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("이자바", 3, 300));
		list.add(new Student("김자바", 1, 200));
		list.add(new Student("홍자바", 2, 100));
		list.add(new Student("최자바", 2, 150));
		list.add(new Student("황자바", 1, 200));
		list.add(new Student("문자바", 3, 290));
		list.add(new Student("이자바", 3, 180));

		
		Stream<Student> stream = list.stream();
		
		
		System.out.println(list.size());
		//
		IntSummaryStatistics is = stream.mapToInt(item -> item.getTotalScore()).summaryStatistics();
		System.out.println(is.getCount());
		System.out.println(is.getMax());
	}
}
