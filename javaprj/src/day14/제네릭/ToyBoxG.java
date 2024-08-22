package day14.제네릭;

public class ToyBoxG<T> {
	//Object list[];
	Object[] list;
	int index;
	
	public ToyBoxG() {
		list = new Object[10];
		index=0;
	}
	
	public void add(T toy) {
		list[index] = toy;
	}
	
	public T get(int i) {
		return (T) list[i];
	}
	public int size() {
		return index;
	}
}
