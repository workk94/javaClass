package day2.연습;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {

		// 복습1
		ArrayList<Moving> list = new ArrayList<>();

		list.add(new Moving("장주원", "구룡포", 100));
		list.add(new Moving("이미현", "경기", 80));
		list.add(new Moving("김두식", " 문산", 90));
		list.add(new Moving("전영석", "봉평", 88));

		// power를 기준으로 오름차순
		// 익명클래스로 구현
		Collections.sort(list, new Comparator<Moving>() {

			@Override
			public int compare(Moving o1, Moving o2) {
				// TODO Auto-generated method stub
				return o1.power - o2.power;
			}
		});

		list.forEach(new Consumer<Moving>() {

			@Override
			public void accept(Moving t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		});
		
		
		
		// 복습2
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("장주원");
		list2.add("이미현");
		list2.add("김두식");
		list2.add("전계도");
		list2.add("프랭크");
		list2.add("김봉석");
		list2.add("장희수");
		list2.add("이강훈");

		// forEach(익명클래스 Comsumer)

		list2.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}

		});
		
		

		// 지역 내부 클래스
		
		class A implements Consumer<String>{

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t + "^^");
			}
			
		}
		
		list2.forEach(new A());
		

		// forEach(람다식)
		// list2.forEach(t -> System.out.println(t));

		
		
		
		//람다식 함수 -> 간단한 식으로 표현하는 것
		//함수형 인터페이스를 구현할 때만 사용가능함 
		
		
		list.forEach((t) -> System.out.println(t + "^^"));
	}
}
