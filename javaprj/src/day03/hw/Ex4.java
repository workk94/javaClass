package day03.hw;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id, name, age, height : ");
		String userId = sc.next();
		String userName = sc.next();
		int userAge = sc.nextInt();
		int userHeight = sc.nextInt();

		System.out.println("userId : " + userId + "\nuserName : " + userName + "\nuserAge : " + userAge + "\nuserHeight : "
				+ userHeight);

	}

}
