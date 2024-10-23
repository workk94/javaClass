package day2.prac;

public class RunnableTest {
	public static void main(String[] args) {
		
		
		//runnable 
		
		//익명함수
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("영어 배우기");
				System.out.println("책 10권 이상 읽기");
				System.out.println("운전면허 따기");
				System.out.println("블로그 운영하기");
			}
		};

		r.run();
		
		
		//람다식
		Runnable r2 = () -> {  
			
			System.out.println("영어 배우기");
			System.out.println("책 10권 이상 읽기");
			System.out.println("운전면허 따기");
			System.out.println("블로그 운영하기");
			
		};
		
		
		r.run();
	}
}
