package day12.상속_inheritance.동물_다형성2;

public class Main {
	public static void main(String[] args) {
		Animal[] arr = new Animal[2];
		
		arr[0] = new Cat();
		arr[1] = new Dog();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].싸운다();
		}
		
		//
		Animal a = new Cat();
		매서드(a);
		Animal b = new Dog();
		매서드(b);
	}
	
	
	public static void 매서드(Animal animal) {
		animal.싸운다();
		
		//cat이라면 쥐를 잡게 명령하기 
		if(animal instanceof Cat) {
			//((Cat) animal).쥐를잡는다();
			Cat cat = (Cat) animal;
			cat.쥐를잡는다();
		}
	}
}
