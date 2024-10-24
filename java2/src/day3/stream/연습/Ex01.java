package day3.stream.연습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Ex01 {
	public static void main(String[] args) {

		String[] arr = new String[] { "딸기", "사과", "딸기", "배" };

		ArrayList<String> list = new ArrayList<>();

		list.add("딸기");
		list.add("사과");
		list.add("딸기");
		list.add("배");

		// 배열정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		//
		Collections.sort(list);
		list.forEach(t -> System.out.println(t));

		// 배열을 스트림으로 얻어오기
		Stream<String> stream1 = Arrays.stream(arr);
		stream1.sorted().forEach(item -> System.out.println(item));
		
		
		//ArrayList를 스트림으로 얻어오기
		
		Stream<String> stream2 = list.stream();
		stream2.sorted().forEach(item -> System.out.println(item));
		

	}
}
