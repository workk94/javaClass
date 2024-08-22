package day14.ex;

import java.util.Scanner;

public class LegoApp {
	private Scanner sc = new Scanner(System.in);
	
	public void run() {

		while (true) {
			Lego j = new JSMyLego();
			Lego s = new Maker();
			String head;
			String body;
			String legs;
			
			System.out.print("레고조합 [1]김정석 [2]김솔 [3]종료 : ");
			String selectMenu = sc.nextLine();

			switch (selectMenu) {
			case "1":
				System.out.println("김정석의 레고");
				head = j.makeHead();
				body = j.makeBody();
				legs = j.makeLegs();
				j.combine(head, body, legs);
				break;
			case "2":
				System.out.println("김솔의 레고");
				head = s.makeHead();
				body = s.makeBody();
				legs = s.makeLegs();
				s.combine(head, body, legs);
				break;
			case "3":
				System.out.println("종료");
				System.exit(0);
				break;
			default:
				System.out.println("잘못선택함");

			}
		}
	}
}
