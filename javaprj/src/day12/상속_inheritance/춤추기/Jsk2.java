//김정석

package day12.상속_inheritance.춤추기;

import java.util.Scanner;

public class Jsk2 extends Student {
	@Override
	public void 춤추기() {
		String[] dances = new String[] {"발레", "탭댄스", "힙합", "탱고", "살사"};
		for(String dance : dances) {
			System.out.println(dance + "를 춥니다");
		}
	}
	
//	public static void main(String[] args) {
//		Jsk jsk = new Jsk();
//		jsk.춤추기();
//	}
}
