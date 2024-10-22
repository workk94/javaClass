package day20.sleep;

public class 실습2 {
	public static void main(String[] args) {
		
		
		// 카운터 만들기 10 9 8 7 6 5 4 3 2 1 
		// sleep
		// 현재 스레드를 지정된 시간 동안 멈추게 한다. 잠잘시간 제공(천분의 일초) 1000 => 1초
		
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}
