package day20.interrupt;

public class 실습3 {
	public static void main(String[] args) {

		System.out.println("프로그램 시작");

		// 별도의 흐름으로 만들기

		/*
		 * for(int i = 10; i > 0; i--) { System.out.println(i); // 시간 지연을 위한 반복문
		 * 
		 * for(long x = 1; x <= 2200000000L; x++);
		 * 
		 * }
		 */

		// 스레드 생성 및 실행

		CounterB b = new CounterB();

		b.start();

		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		b.interrupt(); // a쓰레드에게 신호주기
		
		System.out.println("프로그램 종료");

	}
}

class CounterB extends Thread {

	// isInterrupted() 메서드가 제공됨( 기본값 : false 제공, 외부에서 interrupted() 호출되면 true를 반환 받음
	@Override
	public void run() {
		/*
		 * for(int i = 10; i > 0; i--) { System.out.println(i); // 시간 지연을 위한 반복문
		 * 
		 * for(long x = 1; x <= 2200000000L; x++);
		 * 
		 * }
		 */

		int i = 10;
		while (i != 0 && !isInterrupted()) { // 인터럽트가 발생되기 전까지 반복해 !false(true)
			System.out.println(i);
			i--; 
			// 시간 지연을 위한 반복문 
			//for(long x = 1; x <= 2200000000L; x++);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); //sleep된 상태에서 interrupt() 신호가 들어오면 다시 interrupt값을 false로 초기화 
				//break;
				
				interrupt(); // interrupt 속성값을 true로 변경해줌 
			}
		}

		/*
		 * int i = 10;
		 * 
		 * while(true) { if( i == 0 || isInterrupted() == true) break;
		 * 
		 * 
		 * System.out.println(i); i--; for(long x = 1; x <= 2200000000L; x++);
		 * 
		 * }
		 */
	}
}