package day07.hw;

import java.util.Arrays;

public class 기본_4 {

	public static void main(String[] args) {
		getRandomLotto();

	}
	
	private static void getRandomLotto() {
		int[] lottoArr = new int[6];
		for(int i = 0; i < lottoArr.length; i++) {
			lottoArr[i] = (int)(Math.random()*45 + 1);
		}
		Arrays.sort(lottoArr);
		
		for(int i = 0; i<lottoArr.length; i++) {
			System.out.print(lottoArr[i] + " ");
		}
	}


}
