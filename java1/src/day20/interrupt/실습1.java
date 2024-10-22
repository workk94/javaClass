package day20.interrupt;

public class 실습1 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*
		 * for(int i = 10; i > 0; i --) { System.out.println(i); try {
		 * Thread.sleep(1000); } catch (InterruptedException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } }
		 */
		
		// 카운터코드를 별도의 흐름으로 만들기 -> Thread로 만들자 
		
		
		
		Thread t = new Thread(new Runnable () {

			@Override
			public void run() {
				for(int i = 10; i > 0; i --) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		});
		
		t.start();
		
		
		// t Thread에게 신호보내기 ( 쿡 찌르기 ) interrupt
		
		//t.interrupt(); // 신호보내기 // t: 스레드 interrupt의 기본값은 : false, => interrupt() 신호를 받으면 true로 변경 
		
		
		
		System.out.println("프로그램 종료");
	}
}
