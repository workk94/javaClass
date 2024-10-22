package day20.비동기.실습;

public class Ex04 {
	public static void main(String[] args) {
		
		//스레드 생성 및 실행
		// Thread(Runnable r);
		
		Thread t = new Thread(new RunnableImp());
		Thread t2 = new Thread(new RunnableImp2());
		
		t.start();
		t2.start();
		
	}
	
	
}



class RunnableImp implements Runnable {

	@Override
	public void run() {
		for(int i = 1 ; i < 1000; i ++) {
			//2단 출력코드 
			
			for(int j = 1; j <= 9; j++) {
				System.out.println(2 * j);
			}
		}
	}
	
}


class RunnableImp2 implements Runnable {

	@Override
	public void run() {

		for(int i = 0; i < 1000; i ++) {
			System.out.println("hello java 멀티스레드");
		}
	}
	
}