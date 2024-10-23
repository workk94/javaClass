package day2.lamda;

public class HelloInterface연습 {
	public static void main(String[] args) {
		
		//익명
		//HelloInterface h = new HelloInterface() {} // 익명클래스 작성
		HelloInterface h = new HelloInterface() {
			
			@Override
			public void print() {
				System.out.println("함수형 인터페이스를 익명으로 구현했어요");
			}
		}; 
		
		h.print();
		
		
		//람다식으로 구현
		//함수를 간단한 식으로 표현함
		// 익명클래스의 익명 객체가 만들어짐 
		
		HelloInterface h2 = () -> {
			System.out.println("함수형 인터페이스를 람다로 구현했어요");
		};
		
		h2.print();
		
		HelloInterface h3 = () -> {
			System.out.println("^^");
		};
		
		h3.print();
	}
}
