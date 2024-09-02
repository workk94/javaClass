package day20.sleep;

public class 실습1 {
	public static void main(String[] args) {
		System.out.println("3초후에 공개됩니다");
		
		
		//현재 실행되는 스레드를 정지 할 수 있다(thread sleep) 스레드 재우기 
		
		try {
			Thread.sleep(3000); // 1000 => 1초
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println("짜잔 3초가 지났습니다!!!");
	}
}
