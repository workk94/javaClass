package day14.제네릭;

public class ToyBoxMain {
	public static void main(String[] args) {
		
		
		ToyBox box = new ToyBox();
		
		box.add("안녕");
		box.add(new 인형());
		box.add(3);
		
		//Toy만 담을 수 있다
		//Toy형 형변환 해준다(다운캐스팅 번거로움 해소)
		ToyBoxG<Toy> box2 = new ToyBoxG<>();
		//box2.add("안녕");
		box2.add(new 인형());
		
		Toy toy = box2.get(0);
		
		
		//String만 담겠다
		ToyBoxG<String> box3 = new ToyBoxG<>();
		box3.add("안녕");
		//box3.add(new 인형));
		
		
		ToyBoxG2 box4 = new ToyBoxG2<>();
		ToyBoxG2<인형> box5 = new ToyBoxG2<>();
//		ToyBoxG2<String> box5 = new ToyBoxG2<>(); 안됨 !! 제한된 제네릭 사용하고 있음
	}
}