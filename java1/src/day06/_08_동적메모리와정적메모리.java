package day06;

import java.util.Scanner;

public class _08_동적메모리와정적메모리 {
	public static void main(String[] args) {
		int a1, b1, c1, d1, f1;
		int a2, b2, c2, d2, f2;
		int a3, b3, c3, d3, f3;
		int a4, b4, c4, d4, f4;
		int a5, b5, c5, d5, f5;
		int a6, b6, c6, d6, f6;
		int a7, b7, c7, d7, f7;

		System.out.println("배열의 크기를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int arr[] = new int[cnt];
		System.out.println(arr.length);
		
		//입력
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 + "번째 입력: ");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
