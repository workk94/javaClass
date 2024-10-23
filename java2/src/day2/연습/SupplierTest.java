package day2.연습;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		 /*
		  * 
		  *interface Supplier<T> {
		  *
		  *T get( );
		  *
		  *}
		  */
		
	 	
		
		//람다식			
		Supplier<Integer> s  = () -> 2000000000  ;
		int result  =s.get();
		System.out.println(  result);
		
		
		Supplier<String> s2= ()  -> "람다좋다";
		String result2= s2.get();
		System.out.println(result2);
		
		
		
		Supplier<String> s3  = () ->{
			
			int  randomNumer =(int)  (Math.random()*2) ; 
			if(randomNumer  ==0) {
				return  "좋다";
			}else {
				return  "더 좋다";
			}			 
		};
		
		
		String result3 =s3.get();
		System.out.println(  result3);
		
		
		// 입력x   반환 0
		
		//Acorn을 반환
		Supplier<Acorn> s4  = ()  -> {
			Acorn a = new Acorn();			
			return a;
		};
		
		Acorn  result4 =s4.get();
		
		
	 
		// int   -> Integer
		// char  -> Character
		// double  -> Double
		// boolean  -> Boolean 
		
		//int를 반환하는 
		Supplier<Integer>  s5=  () ->{			
			return  2000000000;			
		};
		
		
		int result6=s5.get();
		System.out.println( result6);
		
		
		
		Supplier<Integer>  s6 = new Supplier<Integer>() {
			@Override
			public Integer get() {				 
				return 3000000;
		 }};
		 
		int result7=s6.get();
		System.out.println( result7);

	}

}
