package com.acorn.jsk;

public class JskLib2 {

	public static int[] a(int x) {	//12
		int[] result = new int[x]; 	//12
		int idx = 0;				//index 
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				result[idx] = i;
				idx++;
			}
		}
		
		//약수의 개수만큼 배열 생성하기 
		int[] newArr = new int[idx];
		//새로운 배열로 약수내용 옮기기(배열 복사)
		/*
		 * newArr[0] =result[0]; newArr[1] =result[1]; newArr[2] =result[2];
		 */
		
		/*
		 * for(int i = 0; i < cnt; i++) { newArr[i] = result[i]; }
		 */
		
//		return result;
		
		//배열복사 라이브러리 사용
						//원본배열, 시작위치, 새로운배열
		System.arraycopy(result, 0, newArr, 0, idx);
		return newArr;
	}

}
