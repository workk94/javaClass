package day14.객체관계.hasA;

public class Main {
	public static void main(String[] args) {
		
		
		A a = new A();
		a.A매서드();
		
		C c = new C();
		c.setD(new D());
		c.C매서드();
		
	}
}
