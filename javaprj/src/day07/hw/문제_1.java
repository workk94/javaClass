//1. 수배열을 매개변수로 짝수의 개수를 반환하는 함수를 만들기 
package day07.hw;

public class 문제_1 {

	public static void main(String[] args) {
		int[] numArr = new int[]{ 1,2,3,4,5,6,7,8,9,10};
		int result = countEven(numArr);
		System.out.println(result);
	}
	
	private static int countEven(int[] array) {
		int cnt = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				cnt++;
			}
		}
		
		return cnt;
	}

}
