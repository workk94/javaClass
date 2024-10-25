package day4.계산기실습;

import java.util.Scanner;

public class Program8 {

	//

	Calculator cal; // Program7 내부에서 생성하지 않고 외부에서 생성된 계산기 객체를 사용하도록 변경

	// 생성자

	public Program8() {
		// TODO Auto-generated constructor stub
	}
	
	//매개변수 있는 생성자 
	public Program8(Calculator cal) {
		super();
		this.cal = cal;
	}
	

	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수 입력하세요 계산해 드릴게요");
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();

		int total = cal.add(su1, su2); // NullPointerException 발생
		System.out.println("두수의 결과 : " + total);
	}


	public static void main(String[] args) {
		Program8 p = new Program8(new A());
		
		p.run();
	}
}
