// 4. 고객정보(아이디, 이름,  나이 ,키 )입력받아서 출력하기
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
