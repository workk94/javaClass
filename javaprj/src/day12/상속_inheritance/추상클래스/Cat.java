package day12.상속_inheritance.추상클래스;

public class Cat extends Animal {
	public void 쥐를잡는다() {
		System.out.println("쥐를 잡는다");
	}
	
	
	@Override public void 싸운다() { 
		System.out.println("발톱을 드러내고 싸운다"); 
	}
	 
}
