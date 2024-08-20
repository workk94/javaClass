package day12.상속_inheritance.동물_다형성;

public class Main {
	
	public static void main(String[] args) {
		
		Animal a = new Cat(); // 업캐스팅(타입변환이 자동으로 이루어짐)
		//부모형 만큼만 해석할 수 있다
		
		//올바른 다운캐스팅 : 업캐스팅된  것을 다시 원래 자식 타입으로 형변환하는 것을 말한다
		//올바른 다운캐스팅
		//연산자 우선순위 때문에 이렇게 씀 
		((Cat)a).쥐를잡다();
		
		Animal[] arr = new Animal[2]; 
		
		arr[0] = new Cat(); // 업캐스팅(타입변환)
		arr[1] = new Dog();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].짖다();
		}
		
	}
}
