package day01.연습.제네릭;

import java.util.Arrays;

//제네릭 클래스
// 장난감을 담고 꺼내는 역할을 함 
public class ToyBox<T> {
	// 
	
	Object[] arr = new Object[10];
	int current = 0;
	
	//담기
	
	public void add(T t) {
		arr[current++] = t;
 	}
	
	//꺼내기
	public T pull(int idx) {
		return (T) arr[idx];
	}
	
	public int size() {
		return current;
	}
	
}
