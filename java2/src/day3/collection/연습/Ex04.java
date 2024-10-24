package day3.collection.연습;

import java.util.HashSet;
import java.util.Set;

public class Ex04 {

	public static void main(String[] args) {

		// 객체를 담을 때, 같다는 기준을 정해줘야 한다

		// equals와 hash 코드 값이 같으면 같은 객체로 인식함
		// equals와 hash 개발자가 오버라이드 해야한다

		Set<Book> set = new HashSet<>();

		set.add(new Book("이것이자바다", 25000));
		set.add(new Book("이것이자바다", 23000));
		set.add(new Book("이것이자바다", 26000));
		set.add(new Book("이것이자바다", 25000));
		set.add(new Book("이것이자바다", 25000));

		for (Book book : set) {
			System.out.println(book);
		}

	}

}
