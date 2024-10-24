package day3.stream.연습;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex03 {

	public static void main(String[] args) {
		
ArrayList<String> list = new ArrayList<>();
		
		list.add("hi");
		list.add("hello");
		list.add("hello");		
		list.add("bye");
		list.add("hello");

		//hello만 출력하기 
		Stream<String> stream = list.stream();
		stream.filter(str -> str.equals("hello")).forEach(str -> System.out.println(str));
		
		
		// h로 시작되는 list의 요소를 반환 
		stream = list.stream();
		long cnt = stream.filter(str -> str.startsWith("h")).count();
		System.out.println(cnt);
		
		//hello 개수 구하기 
		stream = list.stream();
		cnt = stream.filter(str -> str.equals("hello")).count();
		System.out.println(cnt);
		
		//hello에서 2개만 출력
		stream = list.stream();
		stream.filter(str -> str.equals("hello")).limit(2).forEach(str -> System.out.println(str));
		
		
		//hello만 다시 list로 만들기
		
		stream = list.stream();
		List<String> newList = stream.filter(str -> str.equals("hello")).collect(Collectors.toList());
		
		System.out.println("새로운 리스트 ");
		newList.forEach(str -> System.out.println(str));
		
	}
}
