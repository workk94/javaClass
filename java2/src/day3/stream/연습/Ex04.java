package day3.stream.연습;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Ex04 {
	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("이자바", 3, 300));
		list.add(new Student("김자바", 1, 200));
		list.add(new Student("홍자바", 2, 100));
		list.add(new Student("최자바", 2, 150));
		list.add(new Student("황자바", 1, 200));
		list.add(new Student("문자바", 3, 290));
		list.add(new Student("이자바", 3, 180));

		// 1
		Stream<Student> stream = list.stream();

		// 2
		// stream.sorted().forEach(s ->System.out.println(s));

//		stream = list.stream();

//		stream.sorted( (o1, o2) -> o1.ban - o2.ban).forEach(s -> System.out.println(s));

		stream = list.stream();
		stream.sorted(Comparator.<Student, String>comparing(item -> item.getName()))
				.forEach(t -> System.out.println(t));
		;

	}

}
