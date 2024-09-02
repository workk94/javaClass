package day20.비동기.실습;

public class Ex06 {
	public static void main(String[] args) {
		
		// 쓰레드 3개 th1, th2, main
		
		/*
		for(int i = 0; i < 1000; i++) {
			System.out.println( " ^^");
		}
		
		*/
		
		Thread th1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i = 0; i < 1000; i++) {
					System.out.println( " ^^");
				}
			}
			
		});
		th1.start();
		
		
		
		/*
		for(int i = 0; i < 1000; i++) {
			System.out.println( " ^_________^");
		}
		*/
		
		
		Thread th2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i = 0; i < 1000; i++) {
					System.out.println( " ^_________^");
				}
			}
			
		});
		
		th2.start();
		
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("프로그램 종료");
		
	}
}
