package day4.변경에유리한코드실습;

public class Ex2 {

	public static void main(String[] args) {

		
		// 업캐스팅 
		Animal animal = new Cat();
		animal.bark();
		

		animal = new Dog();
		animal.bark();
		//dog변경
		
		//Animal animal2 = new Dog();
		//animal2.bark();
		
	}
}
