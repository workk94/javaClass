package day3.실습;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 과제3 {
	public static void main(String[] args) {

		// id를 기준으로 중복으로 들어가지 않게함
		Set<Customer> set = new HashSet<>();

		set.add(new Customer("c001", "박형식", "vvip", 200000));
		set.add(new Customer("c002", "김정석", "bronze", 90));
		set.add(new Customer("c003", "윈터", "vip", 10000));
		set.add(new Customer("c004", "홍길동", "vvip", 90040));
		set.add(new Customer("c005", "제니", "bronze", 50));
		//
		
		System.out.println(set.add(new Customer("c005", "제니", "bronze", 50)));

		set.add(new Customer("c006", "나형석", "bronze", 30));
		set.add(new Customer("c007", "김정민", "vip", 90200));
		set.add(new Customer("c008", "이미지", "vvip", 5350090));
		set.add(new Customer("c009", "정승제", "bronze", 190));
		set.add(new Customer("c010", "김승훈", "vvip", 900000));

		for(Customer c : set ) {
			System.out.println(c.getName());
		}
		
		// Iterator
//		Iterator<Customer> it = set.iterator();
//		
//		while(it.hasNext()) {
//			Customer c = it.next();
//			System.out.println(c.toString());
//		}

		Stream<Customer> stream = set.stream();

		// 1. 고객 등급이 vvip인 사람이 몇명인지
		System.err.println("1. 고객등급이 vvip  사람이 몇명인지");
		long result = stream.sorted((o1, o2) -> o1.getId().compareTo(o2.getId()))
				.filter(t -> t.getGrade().equals("vvip")).count();
		System.out.println(result);

		// 2. 고객등급이 vip인 사람만 출력
		System.err.println("2. 고객등급이 vip사람만 출력");
		stream = set.stream();
		List<String> cList = stream.filter(t -> t.getGrade().equals("vip")).map(t -> t.getName())
				.collect(Collectors.toList());
		cList.forEach(t -> System.out.println(t));
		// 3. 포인트가 높은 사람순으로 정렬해서 출력(내림차순)

		System.err.println("3. 포인트가 높은 사람순으로 정렬해서 출력");
		stream = set.stream();
		stream.sorted((o1, o2) -> o2.point - o1.point)
				.forEach(t -> System.out.println(t.getName() + " : " + t.getPoint()));
	}
}
