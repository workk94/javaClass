package day2.prac;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateTest {

	
	public static void main(String[] args) {
		ArrayList<Dish> list = new ArrayList<>();
		
		list.add(new Dish("갈비찜", "갈비찜", "a"));
		list.add(new Dish("카레", "카레", "b"));
		list.add(new Dish("짜랑", "짜장", "c"));
		
		Predicate<String> p = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				for(int i = 0 ; i < list.size(); i++) {
					String cooker = list.get(i).getCooker();
					if(t.equals(cooker)) {
						return true;
					}
				}
				
				return false;
			}
		};
		
		boolean result = p.test("a");
		
		System.out.println(result);
	}
}
