package day20.비동기.실습;
	
public class Ex07 {
	public static void main(String[] args) {
		
		//Runnable 인터페이스 구현
		Thread th1 = new Thread(new RunnableImpD());
		Thread th2 = new Thread(new RunnableImpD());
		
		
		th1.start();
		th2.start();
	}
}


class RunnableImpD implements Runnable {

	@Override
	public void run() {
		print();
	}

	private void print() {
		
		Thread th = Thread.currentThread();
		//1~100까지 출력
		for(int i = 1; i <=100; i++) {
			System.out.println(i + th.getName());
		}
		
	}
}