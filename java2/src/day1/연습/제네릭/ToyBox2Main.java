package day1.연습.제네릭;

public class ToyBox2Main {
	public static void main(String[] args) {
		
		//T extends Toy
		//Toy를 상속받은 것만 사용가능
		
		ToyBox2<Toy> list = new ToyBox2<>();
		list.add(new Doll());
		
		//케익을 담는 박스로 사용할 수 없다 
		//ToyBox2<Cake> list2 = new ToyBox2<>();
		
	}
}
