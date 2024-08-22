package day14.제네릭;

public class ToyBox {
	//Object list[];
	Object[] list;
	int index;
	
	//생성자
	public ToyBox() {
		list = new Object[10];
		index=0;
	}
	
	public void add(Object toy) {
		list[index] = toy;
	}
	
	public Object get(int i) {
		return list[i];
	}
	public int size() {
		return index;
	}
}
