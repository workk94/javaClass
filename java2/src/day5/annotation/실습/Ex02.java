package day5.annotation.실습;

class MyLib {
	
	
	//매서드
	@Deprecated
	public void myMethod() {
		System.out.println("나의 매서드 실행");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		MyLib lib = new MyLib();
		lib.myMethod();
	}
}
