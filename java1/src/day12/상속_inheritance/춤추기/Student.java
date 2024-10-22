package day12.상속_inheritance.춤추기;

public class Student {
	public void 공부하기() {
		System.out.println("공부하기");
	}
	
	//자식들이 재정의 하세요
	public void 춤추기() {
		System.out.println("춤추기 기능을 각자 좋아하는 춤추기로 오버라이드 하세요. 재정의하세요");
	}
}
