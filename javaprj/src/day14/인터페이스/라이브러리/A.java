package day14.인터페이스.라이브러리;

public class A implements MyRunnable{

	@Override
	public void run() {
		for(int i = 1; i <= 9; i++) {
			System.out.println(2*i);
		}
	}
	
}
