package day07.ex;

public class 기본_1 {

	public static void main(String[] args) {
		
		int result = subtract(10, 5);
		System.out.println(result);
		
		result = subtract(5, 10);
		System.out.println(result);

	}
	public static int subtract(int x, int y) {
		if(x > y) {
			return x - y;
		} else {
			return y - x;
		}
	}
}
