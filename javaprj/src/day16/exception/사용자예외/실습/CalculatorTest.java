package day16.exception.사용자예외.실습;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		try {
			//int result = c.add(5, 2);
			int result = c.add(5, -2);
			System.out.println(result);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			String m = e.getMessage();
			System.out.println(m);
		}
		
		System.out.println("프로그램 정상 종료");
	}
}
