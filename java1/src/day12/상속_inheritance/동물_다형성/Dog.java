package day12.상속_inheritance.동물_다형성;

public class Dog extends Animal {
	public void 집을지킨다() {
		System.out.println("집을 지킨다");
	}
	
	@Override
	public void 짖다() {
		System.out.println("멍멍");
	}
}
