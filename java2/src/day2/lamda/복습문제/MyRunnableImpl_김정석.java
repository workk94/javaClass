package day2.lamda.복습문제;

public class MyRunnableImpl_김정석 extends Thread implements MyRunnuable{

	@Override
	public void run() {
		try {

			System.out.println("로딩중..");
			Thread.sleep(2000);
			System.out.println("hi!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
