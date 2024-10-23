package day2.연습;

public class RunnableTest {

	public static void main(String[] args) {
		 
		
		/*
		 * interface Runnable{		 *   
		 *     void run(); 
		 * }
		 * 
		 */
		
		
		Runnable   r  =   () ->   
			
			System.out.println(" 오늘일정");
			System.out.println(" 함수형인터페이스");
			System.out.println(" 함수형인터페이스를 간단한게 구현하는 방법");
			
		 
		r.run();
		
		Runnable r2 = () -> 	System.out.println(" 오늘일정");
		
		r2.run();
		
		Runnable r3  =  new Runnable() {

			@Override
			public void run() {
				 System.out.println(" run !! ");
				
			}};
			
		
		r3.run();
			
	    class RunnableImp  implements Runnable{

			@Override
			public void run() {
				System.out.println(" 이름있는 클래스로 구현 !!");
				
			}
	    	
	    }
		
	    RunnableImp  r4  = new RunnableImp();
	    r4.run();
	    
		
	}

}
