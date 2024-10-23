package day2.prac;

import java.util.function.Supplier;


public class SupplierTest {
	

	public static void main(String[] args) {
		// Supplier () -> T

		// 갈비찜 

		Supplier<String> s = () -> {
			
			Dish galbi = new Dish("갈비찜", "갈비찜 만들기");
	
			System.out.println(galbi.getRecipe());
			return galbi.getName();

		};
		
		String result = s.get();
		
		System.out.println(result);

	}
}
