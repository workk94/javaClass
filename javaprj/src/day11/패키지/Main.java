package day11.패키지;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		// a.a = 10; x // private => 클래스내에서 접근 가능
		a.b = 10; // 접근가능 이유? 같은 패키지에 존재하기 때문에 
		a.c = 10; // 접근가능 이유? 공개된, 어디서나 접근가능하기 때문에
	}
}
