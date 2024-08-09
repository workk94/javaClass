//11
package day04;

import java.util.Scanner;

public class 주문금액 {

	public static void main(String[] args) {
		 
		int iTotalPrice;
		String iMenuNum_; 
		String iMenuCont_;
		
		int iMenuNum; 
		int iMenuCont;
		
		
		// let menu= [ 2000,25000,3000,4000    ];	
		//                      0     1   2    3
		final int[] iPrice = { 2000,2500,3000,4000};
		
		
		Scanner sc = new Scanner( System.in);
		
		
		 while(true) {
			 //입력 메뉴, 수량	
			 while( true) {
				 System.out.println(" 메뉴와 수량을 입력하세요:");
				 iMenuNum_ = sc.nextLine();				 
				 iMenuCont_ =sc.nextLine();
				 
				 iMenuNum = Integer.parseInt(iMenuCont_);     // "0" ->  0
				 iMenuCont = Integer.parseInt( iMenuCont_);   // "5"  -> 5
				 
				 
				//입력완료?  yes/ no 
				 System.out.println(" 입력완료 되었나요? yes / no ");
				 String result  = sc.nextLine();
				 if( result.equals("yes")) {
					 break;
				 }				 
			 }
			  
			 
			 //주문금액 구하기
			 iTotalPrice = iMenuCont * iPrice[ iMenuNum];
			 
			 //주문완료?  yes/no	
			System.out.println("주문완료하셨나요? yes / no "); 
			String result  = sc.nextLine();
			if( result.equals("yes")) {
				break;
			}			 
		 }
		 
		 //		 
		 System.out.println("주문금액" + iTotalPrice);

	}

}
