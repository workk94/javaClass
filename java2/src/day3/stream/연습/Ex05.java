package day3.stream.연습;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex05 {
	public static void main(String[] args) {

		// Map 변환
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("이자바", 3, 300));
		list.add(new Student("김자바", 1, 200));
		list.add(new Student("홍자바", 2, 100));
		list.add(new Student("최자바", 2, 150));
		list.add(new Student("황자바", 1, 200));
		list.add(new Student("문자바", 3, 290));
		list.add(new Student("이자바", 3, 180));

		Stream<Student> stream = list.stream();
		//stream.map(item -> item.getName()).forEach(item -> System.out.println(item));

		
		//스트림 얻어오기 
		stream = list.stream();
		
		List<String> nameList = stream.map(item-> item.getName()).collect(Collectors.toList());
		
		nameList.forEach(t -> System.out.println(t));
	}
}
