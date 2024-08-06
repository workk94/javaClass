/**
 * 
15. 연산자를 입력받아      "+", "-", "*", "/", "%", "=", "<", ">", "!", "&&", "||"   (해당되면 연산자이다, 연산자가 아니다 출력) 연산자 여부를 출력하는 프로그램을 작성하시오
 */

package day03.hw;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		loop:while(true) {
			String input = sc.nextLine();
			switch(input) {
			case "+":
				System.out.println("+ 연산자"); break;
			case "-":
				System.out.println("- 연산자"); break;
			case "*":
				System.out.println("* 연산자"); break;
			case "/":
				System.out.println("/ 연산자"); break;
			case "%":
				System.out.println("% 연산자"); break;
			case "=":
				System.out.println("= 연산자"); break;
			case "<":
				System.out.println("< 연산자"); break;
			case ">":
				System.out.println("> 연산자"); break;
			case "!":
				System.out.println("! 연산자"); break;
			case "&&":
				System.out.println("&& 연산자"); break;
			case "||":
				System.out.println("|| 연산자"); break;
			case "q":
				System.out.println("exit"); break loop;
			default : 
				System.out.println("연산자가 아님"); break;
			}
		}

	}

}
