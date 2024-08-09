package day07.hw;

public class 기본_5 {

	public static void main(String[] args) {		
		boolean rtn1 = isAdult(20);
		boolean rtn2 = isAdult(18);
		
		System.out.println(rtn1);
		System.out.println(rtn2);

	}

	private static boolean isAdult(int age) {
		boolean result;
			
		if(age > 19) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}
