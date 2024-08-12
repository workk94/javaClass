package day08;

import java.util.Scanner;
import com.acorn.jsk.Jsk;

public class LibTest1 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		
		boolean result = Jsk.isAdult(age);
		
		if(result) {
			System.out.println("성인입니다");
		} else {
			System.out.println("성인이 아닙니다");
		}
	}

}
