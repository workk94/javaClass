/**
 * 11.     구구단 출력   , 원하는단 출력 
 */

package day03.hw;

public class Ex12 {

	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
		}
	}

}
