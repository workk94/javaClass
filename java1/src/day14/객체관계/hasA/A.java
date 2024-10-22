package day14.객체관계.hasA;

//has a
//다른 클래스를 멤버로 가지는 것을 말한다
public class A {
	
	B b;
	// B b = new B();
	
	public A() {
		b = new B();
	}
	
	public void A매서드() {
		System.out.println("A매서드");
		b.B매서드();
	}
}
