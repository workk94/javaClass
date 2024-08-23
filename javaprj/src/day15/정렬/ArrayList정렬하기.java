package day15.정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList정렬하기 {
	public static void main(String[] args) {
		
		
		ArrayList<Score2> list = new ArrayList<>();
		
		list.add(new Score2("aaa", 100, 80));
		list.add(new Score2("bbb", 89, 99));
		list.add(new Score2("ccc", 88, 100));
		list.add(new Score2("ddd", 99, 78));
		list.add(new Score2("eee", 87, 89));
		
		Collections.sort(list);
		
		
		System.out.println("total 기준 오름차순 : 정렬후 ");
		for(Score2 score : list) {
			System.out.println(score); // score.toString();
		}
		
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Score2 s1 = (Score2) o1;
				Score2 s2 = (Score2) o2;
				return s1.eng - s2.eng;
			}
		});
		
		System.out.println("영어점수 기준 오름차순 : 정렬후 ");
		for(Score2 score : list) {
			System.out.println(score); // score.toString();
		}
		
	}
}
