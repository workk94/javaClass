package day12.상속_inheritance.인터페이스;

public class Main {
	public static void main(String[] args) {
		
		//Object 상속이 강제되어 있음
		Object[] arr = new Object[4];
		arr[0] = new Cat();
		arr[1] = new Dog();
		arr[2] = new Student();
		arr[3] = new Cook();
		
		//
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] instanceof 전투가가능한) {
				
				((전투가가능한)arr[i]).싸운다();;
			}
		}
		
	}
}
