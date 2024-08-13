package day07.ex;

public class 문제_1 {

	public static void main(String[] args) {
		int[] numArr = new int[]{ 1,2,3,4,5,6,7,8,9,10};
		int result = countEven(numArr);
		System.out.println(result);
	}
	
	public static int countEven(int[] array) {
		int cnt = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				cnt++;
			}
		}
		
		return cnt;
	}

}
