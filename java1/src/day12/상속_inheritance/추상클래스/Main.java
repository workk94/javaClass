package day12.상속_inheritance.추상클래스;

public class Main {
	public static void main(String[] args) {
		Animal[] arr = new Animal[2];
		
		arr[0] = new Cat();
		arr[1] = new Dog();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].싸운다();
		}
		
	}
	
}
