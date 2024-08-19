package day11.스태틱변수;

public class 변수종류 {

	public static void main(String[] args) {
		// 지역변수 : 함수안에서 만들어진 변수 : stack : 함수반환되면 자동해제
		// 멤버변수 (인스턴스변수 ) : heap : 참조를 잃었을 때
		// static 멤버변수 : 클래스변수 : static : 프로그램시작 -> 종료

		int a = 10;
		Customer c = new Customer("t001", "0000", "홍길동"); // 객체, 인스턴스가 생성됨
		Customer c2 = new Customer("a001", "1234", "김길동"); // 객체, 인스턴스가 생성됨

		String result = c.toString();
		System.out.println(result);

		System.out.println(c2.toString());
	}

}
