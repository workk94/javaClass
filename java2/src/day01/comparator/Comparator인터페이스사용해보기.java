package day01.comparator;

import java.util.Comparator;

public class Comparator인터페이스사용해보기 {

	public static void main(String[] args) {
		
		
		Comparator<String> obj =   new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
			
		};
		
		
		int result  =obj.compare("전지형", "전지현");			
		System.out.println( result);
		
		 
		
	
		 
	}

}
