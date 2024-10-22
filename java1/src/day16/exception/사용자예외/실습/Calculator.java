package day16.exception.사용자예외.실습;

public class Calculator {
	public int add(int su1, int su2) throws NegativeNumberException {
		
		if(su1 < 0 || su2 < 0) {
			
			throw new NegativeNumberException();
			
			//return -1;
		}
		
		return su1 + su2;
	}
}
