package day14.객체관계.IsA;

public class Main {
	public static void main(String[] args) {
		B b = new B();
		
		A a = null; // a 참조형변수 (참조형변수의 기본값은 null)
		
		a = b; // 업캐스팅
		Object o = b; // 업캐스팅
		
		
		a.A메서드();
		
		//다운캐스팅
		((B)a).B메서드();
		((B)o).A메서드();
		
	}
}
