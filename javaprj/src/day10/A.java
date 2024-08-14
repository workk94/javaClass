package day10;

public class A {
	// 매서드오버로딩
	// 같은이름 매서드를 만들 수 있다
	// 단 매개변수가 달라야 한다(개수, 타입)
	public void method() {
		System.out.println("method");
	}
	
	public void method(int a) {
		System.out.println(a);
	}
	
	public void method(int a, int b) {
		System.out.println(a + " " + b);
	}
	
	public static void main(String[] args) {
		A a = new A();
		
		a.method();
		a.method(5);
		a.method(3,5);
		
	}
}
