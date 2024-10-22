package day16.exception.선택;

public class 실습_예외5 {
	public static void main(String[] args) {
		
		try {
			A a  = new A();
			
			Object o = a; 
			
			
			((A)o).놀기();
			
			((B)o).공부하기();
			
		} catch(Exception e) { //ClassCastException => 부모형 Exception으로 다뤄질 수 있다.
			System.out.println(e.toString());
			//
			//예외 되던지기!!
			
			throw e; // 다시 예외 일으키기
		}
		
		
		System.out.println("프로그램 정상 종료");
		
		
	}
}
