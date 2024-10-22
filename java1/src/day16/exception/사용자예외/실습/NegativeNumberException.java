package day16.exception.사용자예외.실습;

public class NegativeNumberException extends Exception {
	public NegativeNumberException() {
		super("음수 안돼 !! ");
	}
}
