package day01.연습;

public class 제네릭매서드맛보기 {
	
	
	//
	
	public static void print1(int su) {
		System.out.println(su);
	}
	
	public static void print2(Acorn acorn) {
		System.out.println(acorn); // acorn.toString();
	}
	
	public static void print3(String str) {
		System.out.println(str);
	}
	
	
	public static <T> void print(T item) {
		System.out.println(item);
	}
	
	public static void main(String[] args) {
		
		//
		
		제네릭매서드맛보기.print1(10);
		제네릭매서드맛보기.print2(new Acorn("acorn1", "1234", "ddd"));
		제네릭매서드맛보기.print3("dfsdf");
		
		
		// 앞에 랩퍼 타입 생략가능 
		제네릭매서드맛보기.<String>print("ㅋㅋㅋㅋㅋㅋ");
		제네릭매서드맛보기.<Integer>print(242);
		제네릭매서드맛보기.<Acorn>print(new Acorn("acorn1", "1234", "ddd"));
		제네릭매서드맛보기.<Boolean>print(false);
		
		
		제네릭매서드맛보기.print("ㅋㅋㅋㅋㅋㅋ");
		제네릭매서드맛보기.print(242);
		제네릭매서드맛보기.print(new Acorn("acorn1", "1234", "ddd"));
		제네릭매서드맛보기.print(false);
	}
}
