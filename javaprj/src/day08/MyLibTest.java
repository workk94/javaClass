package day08;

import java.util.Scanner;

public class MyLibTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		
		int result = MyLib.max(su1, su2); // int result = Math.max(su1, su2);
		
		System.out.println("큰수는="+result);
	}

}
