package day07.ex;

public class 기본_5 {

	public static void main(String[] args) {
		
		int myAge = 20;
		boolean result = isAdult(myAge);
		System.out.println(result);
	}

	public static boolean isAdult(int age) {
		boolean result;
			
		if(age > 19) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}
