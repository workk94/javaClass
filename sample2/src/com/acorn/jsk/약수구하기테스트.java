package com.acorn.jsk;

public class 약수구하기테스트 {

	public static void main(String[] args) {
		int[] result = JskLib2.a(12);
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
