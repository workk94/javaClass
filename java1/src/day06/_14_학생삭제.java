package day06;

import java.util.Scanner;

public class _14_학생삭제 {

	public static void main(String[] args) {
		String[] arr = new String[] {"aaa", "bbb", "ccc","ddd","eee"};
		
		int index = 5;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삭제할 학생번호 선택");
		int delete = sc.nextInt() - 1; // 1->0, 2->1
		
		
		// 2 ~ 4 이런식으로 감 
		for(int i = delete; i < arr.length-1; i++) {
			arr[i] = arr[i+1]; // arr[2] <= arr[3];
		}
		index--;
		//delete가 2일때 
		//arr[2] <= arr[3];
		//arr[3] <= arr[4];
		
		for (int i = 0; i < index; i++) {
			System.out.println(arr[i]);
		}

	}

}
