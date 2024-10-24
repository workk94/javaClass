package day3.실습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class 과제1 {
	public static void main(String[] args) {
		String[] fruits = { "사과", "딸기", "배", "바나나", "오렌지" };

		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("이자바", 3, 300));
		list.add(new Student("김자바", 1, 200));
		list.add(new Student("홍자바", 2, 100));
		list.add(new Student("최자바", 2, 150));
		list.add(new Student("황자바", 1, 200));
		list.add(new Student("문자바", 3, 290));
		list.add(new Student("이자바", 3, 180));

		// stream으로 fruits 배열 정렬후 출력
		Arrays.stream(fruits).sorted().forEach(t -> System.out.println(t));
		System.out.println();

		
		// stream으로 totalScore가 200보다큰 학생들을 반번호를 기준으로 오름차순 정렬 
		Stream<Student> stream;
		stream = list.stream();
		stream.filter(t -> t.getTotalScore() >= 200).sorted(((s1, s2) -> s1.getBan() - s2.getBan()))
				.forEach(t -> System.out.println(t));
		System.out.println();
		
		
		//stream으로 반번호가 1반인 학생들만 출력
		stream= list.stream();
		stream.sorted().filter(t -> t.getBan() == 1).forEach(t -> System.out.println(t));
		
	}
}
