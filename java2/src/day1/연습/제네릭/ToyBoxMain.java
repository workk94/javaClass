package day1.연습.제네릭;

public class ToyBoxMain {
	public static void main(String[] args) {
		ToyBox<Apple> list = new ToyBox<>();
		
		list.add(new Apple());
		list.add(new Apple());
		
		int size = list.size();
		System.out.println(size);
		list.add(new Apple());
		
		Apple obj = list.pull(0);
		size = list.size();
		
		System.out.println(size);
		
		
		//
		ToyBox<Cake> list2 = new ToyBox<>();
		
		list2.add(new Cake());
		list2.add(new Cake());
		
		int size2 = list2.size();
		System.out.println(size2);
	}
}
