package day20.비동기.실습;

public class Ex02 {
	public static void main(String[] args) {
		
		// thread 실행하기 
		
		Thread thc = new Thread(new C());
		Thread thd = new Thread(new D());
		
		thc.start();
		thd.start();
		
	}
}

// thread를 만드는 방법 (Runnable 인터페이스를 구현하는 방법)

class C implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 1000; i++) {
			System.out.println("hi");
		}

	}

}

class D implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 1000; i++) {
			System.out.println("bye");
		}

	}

}
