//15
package day06;

import java.util.Scanner;

public class 학생관리프로그램완성 {

	public static void main(String[] args) {
		 
		
		// 5명 학생관리하는 프로그램
		// 일차원배열		
		//메뉴 1. 등록, 2.조회 ,  3.변경,  4.삭제 , 5.전체조회, 6종료 
		String[] arr = new String[5];
		int index=0;   		
		
		
		
		Scanner sc = new Scanner( System.in);
		loop:while( true) {
			System.out.println(" 1. 등록, 2.조회 ,  3.변경,  4.삭제 , 5.전체조회, 6종료"); 
			int menu = sc.nextInt();
			
		    sc.nextLine();
		    
			switch(menu) {
			case 1:
				
				System.out.println("학생이름입력:");  
				String tmpName  = sc.nextLine();
				arr[index]= tmpName;		
				index++; 
				break;
			case 2:
				System.out.println("조회합니다");
				System.out.println( "조회할 학생번호 ");
				int select  = sc.nextInt()-1;     //1 ->0   //2 ->1
				
				System.out.println("<<학생정보>>");
				System.out.println(arr[select]);
				
				break;
				
			case 3:
				//System.out.println("변경합니다");
				System.out.println("변경할 학생을 선택하세요");				 
				int update  =  sc.nextInt() -1;   // 1 -> 0  , 2 ->1   , 3 ->2				
				System.out.println("새로운이름을 입력");
				sc.nextLine();
				String updateName  = sc.nextLine();
				arr[update]=updateName;
				break;
			case 4:
				//System.out.println("삭제합니다");
				System.out.println("삭제할 학생번호 선택");
				int delete = sc.nextInt() -1;				
			 
				for( int i= delete  ; i < arr.length-1 ;  i++) {			
					arr[i] = arr[i+1];    
					
				}		
				index--;
				break;
			case 5:
				System.out.println( "전체조회");				
				for( int i=0 ; i<index; i++) {
					System.out.println( arr[i]);
				}
				break;
			case 6:
				System.out.println("종료");
				break loop;   //while을 종료할 수 있도록		
			default :
				System.out.println(" 메뉴 잘못 선택");
			}
			 
			
		}
	}

}
