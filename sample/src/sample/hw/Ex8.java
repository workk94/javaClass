package sample.hw;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		int totalWage, wage = 0;
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int code = sc.nextInt();
		int workingHour = sc.nextInt();
		
		switch (code) {
			case 1: wage = 2000;
			break;
			case 2: wage = 2500;
			break;
			case 3: wage = 3000;
			break;
			case 4: wage = 4000;
			break;
		}
		totalWage = wage * workingHour;
		
		System.out.println(name + " 임금은 : " + totalWage);
			

	}

}
