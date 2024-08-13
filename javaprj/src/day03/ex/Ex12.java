/**
 * 12.  주문수량, 메뉴를 입력받아
       해당 주문의 주문금액을 출력하는 프로그램 작성하시오     
      ( 메뉴, 가격 임의로 정하기 )
 * 
 * 
 */

package day03.ex;

import java.util.Scanner;

public class Ex12 {

	private static int getOrderPrice(int qty, String menu) {
		int totalPrice = 0;
		int menuPrice;
		switch (menu) {
		case "1":
			menuPrice = 3000;
			break;
		case "2":
			menuPrice = 2000;
			break;
		case "3":
			menuPrice = 2500;
			break;
		default:
			menuPrice = 0;
		}		
		return totalPrice = menuPrice * qty;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result;
		
		System.out.print("수량? : ");
		int n = sc.nextInt();
		System.out.print("메뉴?(1.떡볶이, 2.어묵, 3.순대) : ");
		String s = sc.next();
		
		result = getOrderPrice(n, s);
		System.out.println(result);
	}

}
