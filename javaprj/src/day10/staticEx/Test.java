package day10.staticEx;

public class Test {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 3;
		
		int result = A.add(num1, num2);
		
		B b = new B(num1, num2);
		int result2 = b.add();
		
		C c = new C();
		int result3 = c.add(num1, num2);
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
	}

}
