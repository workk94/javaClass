package day2.lamda.복습문제;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;


public class Ex01 {
	public static void main(String[] args) {
		
		ArrayList<Moving> list = new ArrayList<>();

		list.add(new Moving("장주원", "구룡포", 100));
		list.add(new Moving("이미현", "경기", 80));
		list.add(new Moving("김두식", " 문산", 90));
		list.add(new Moving("전영석", "봉평", 88));

		//정렬
		
		//1)이름있는거
		//2)익명
		//3)람다식
		
		class AImpl implements Comparator<Moving>{

			@Override
			public int compare(Moving o1, Moving o2) { // 기준, 비교
				// TODO Auto-generated method stub
				return o1.power-o2.power;
			}
			
		}
		
		
		Collections.sort(list, new AImpl());
		
		
		list.forEach(t -> System.out.println(t));
		
		
		Collections.sort(list, new Comparator<Moving>() {

			@Override
			public int compare(Moving o1, Moving o2) {
				// TODO Auto-generated method stub
				return o1.power-o2.power;
			}
		});
		
		
		Collections.sort(list, (o1, o2) -> o1.power-o2.power);

		list.forEach(t -> System.out.println(t));
	}
}
