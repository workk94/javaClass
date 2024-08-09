//13
package day06;

import java.util.Scanner;

public class 학생변경 {

	public static void main(String[] args) {
		String[] arr = new String[] { "aaa", "bbb", "ccc", "", "" };
		int index = 3;

		for (int i = 0; i < index; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("변경할 학생을 선택하세요");

		Scanner sc = new Scanner(System.in);
		int update = sc.nextInt() - 1; // 1 -> 0 , 2 ->1 , 3 ->2

		System.out.println("새로운이름을 입력");
		sc.nextLine();
		String updateName = sc.nextLine();
		arr[update] = updateName;

		for (int i = 0; i < index; i++) {
			System.out.println(arr[i]);
		}

	}

}