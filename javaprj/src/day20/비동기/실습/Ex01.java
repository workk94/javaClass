package day20.비동기.실습;

public class Ex01 {
	
	
	public static void main(String[] args) {
		/*
		for(int i = 1; i < 1000; i++) {
			System.out.println("hi");
		}
		
		for(int i = 1; i < 1000; i++) {
			System.out.println("bye");
		}
		*/
		
		
		// 두개의 스레드를 실행하기 
		A a = new A();
		a.start(); // run 메서드를 호출하지 않는다. !! 주의 사항 스레드 실행은 start() 메서드 호출
		
		B b = new B();
		b.start();
	}
}


// 스레드를 만드는 방법( 별도의 흐름)

// 1. Thread 클래스를 상속받기
// 2. run 메서드 재정의하기 (별도의 흐름으로 만들 코드 작성하기
class A extends Thread {
	@Override
	public void run() {
		for(int i = 1; i < 1000; i++) {
			System.out.println("hi");
		}
	}
}
	
class B extends Thread {
	@Override
	public void run() {
		for(int i = 1; i < 1000; i++) {
			System.out.println("bye");
		}
	}
}