package day12.상속_inheritance.추상클래스;

public class Dog extends Animal {
	public void 집을지킨다() {
		System.out.println("집을 지킨다");
	}
	
	@Override
	public void 싸운다() {
		System.out.println("이빨을 드러내면서 으르렁 거린다");
	}
}
