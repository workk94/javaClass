package day08;

public class CustomerTest {

	public static void main(String[] args) {
		String name = "홍길동";
		int age = 25;
		String address = "서울";
		printInfo0(name, age, address);

		// Customer 자료형으로 변수 만들기
		Customer c = new Customer();
		c.name = "홍길동";
		c.age = 25;
		c.address = "서울시";

		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.address);

		printInfo(c);
	}

	public static void printInfo0(String name, int age, String address) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
	}

	// 고객정보 출력하기

	public static void printInfo(Customer c) {
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.address);
	}

}
