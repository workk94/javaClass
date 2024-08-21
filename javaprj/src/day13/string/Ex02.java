package day13.string;

public class Ex02 {
	public static void main(String[] args) {
		
		//String 문자열을 처리하기 위한 자바의 클래스이다( char[] + 메서드 )
		//String은 불변
		
		//문자열을 생성하는 두가지 방법1
		String hi = "hello";
		String hi2 = "hello";
		
		//문자열 기능
		char result = hi.charAt(0);
		System.out.println(result);
		String result3 = hi.toUpperCase();
		System.out.println(result3);
		
		
		//문자열을 생성하는 두가지 방법2
		String hi3 = new String("hello");
		String hi4 = new String("hello");
		
		//문자열의 기능
		char result2 = hi3.charAt(4);
		System.out.println(result2);
		String result4 = hi3.toUpperCase();
		System.out.println(result4);
		
		//두개의 차이
		//방법1
		if(hi == hi2) {
			System.out.println("주소가 같다");
		}
		
		if(hi.equals(hi2)) {
			System.out.println("내용이 같다");
		}
		
		//방법2
		if(hi3 == hi4) {
			System.out.println("주소가 같다");
		}
		
		if(hi3.equals(hi4)) {
			System.out.println("내용이 같다");
		}
		
		
	}
}
