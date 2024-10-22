/**
 * 11. 구구단 원하는단 출력 
 */

package day03.ex;

import java.util.Scanner;

public class Ex11_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int n = sc.nextInt();
		
		for(int i = 1; i<10; i++) {
			System.out.println(n + "*" + i + "=" + n*i);
		}
	}

}
