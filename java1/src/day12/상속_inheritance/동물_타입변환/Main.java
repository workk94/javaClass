package day12.상속_inheritance.동물_타입변환;

public class Main {
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.걷는다();
		cat.먹는다();
		cat.쥐를잡는다();
		
		Dog dog = new Dog();
		dog.걷는다();
		dog.먹는다();
		dog.집을지킨다();
		
		//상속관계에서 타입변환이 가능하다 
		//Animal - Cat (부모 - 자식, super - sub)
		//Animal - Dog (부모 - 자식, super - sub)
		
		//타입변환 - 업캐스팅, 다운캐스팅
		
		//업캐스팅(자식객체를 부모형 참조변수로 다루는 것)
		Animal animal1 = null; // Animal 참조형 변수
		animal1 = cat; // ok? yes upcasting
		
		Animal animal2 = null;
		animal2 = dog;
		
		//부모형으로 다루는 잇점
		//부모형객체 배열로 다룰 수 있다
		
		Animal[] animals = new Animal[2];
		animals[0] = cat;
		animals[1] = dog;
		
		
		System.out.println("Animal형 배열 사용가능");
		for(int i = 0; i < animals.length; i++) {
			animals[i].걷는다();
			animals[i].먹는다();
			//animals[i].쥐를잡는다(); 사용할수 없다.animal1 (해석의 도구가 축소됨)
		}
		
		//업캐스팅하게되면 부모형으로 해석의 도구가 축소된다		
		//주의사항!! 실제 객체가 바뀌는 것이 아니라 해석의 도구가 달라진다
		
		animal1.걷는다();
		animal1.먹는다();
		//animal1.쥐를잡는다(); 사용할 수 없다(해석의 도구가 축소됨)
		
		
		// 다운캐스팅 : 타입이 바뀌는것이지 실체가 바뀌는 것이 아니다 다시 원래 타입으로 돌아감
		//필요하면 다운캐스팅을 해야 한다
		((Cat)animal1).쥐를잡는다();
		
		//instanceof 연산자 객체 type 판별가능
		System.out.println("Animal형 배열 사용가능");
		for(int i = 0; i < animals.length; i++) {
			animals[i].걷는다();
			animals[i].먹는다();
			if(animals[i] instanceof Cat) {
				Cat tmp = (Cat)animals[i];
				tmp.쥐를잡는다();
			}
		}		
		
	}
}
