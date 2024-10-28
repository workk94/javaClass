package day5.annotation.실습;

class Animal {
	public void bark2() {
		System.out.println("짖다");
	}
}

class Dog extends Animal {
	@Override // 부모의 매서드를 재정의한 것이다 
	public void bark2() {
		System.out.println("멍멍");
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Animal animal = new Dog();
		
		animal.bark2();
	}
}
