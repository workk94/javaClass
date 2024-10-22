package day12.상속_inheritance.동물_다형성2;

public class Animal {
	public void 먹는다() {
		System.out.println("먹는다");
	}
	
	public void 걷는다() {
		System.out.println("걷는다");
	}
	
	//오버라이드할 메서드
	public void 싸운다() {
		System.out.println("싸움방법을 오버라이드 하세요");
	}
}
