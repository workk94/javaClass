package day20.비동기.실습;

public class Ex05 {
	public static void main(String[] args) {
		
		
		// Runnable 인터페이스를 구현하는 익명 클래스 
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i = 1 ; i < 1000; i ++) {
					//2단 출력코드 
					
					for(int j = 1; j <= 9; j++) {
						System.out.println(2 * j);
					}
				}
			}
			
		});
		
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				for(int i = 0; i < 1000; i ++) {
					System.out.println("hello java 멀티스레드");
				}
			}
			
		});
		
		
		t.start();
		t2.start();
		
	}
}
