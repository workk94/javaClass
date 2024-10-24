package day3.collection.연습;

import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {
	private Object[] elements;
	private int size;

	public MyArrayList() {
		this.elements = new Object[10]; // 초기 용량
		this.size = 0;
	}

	public void add(T element) {
		if (size == elements.length) {
			// 배열 확장 로직 (생략)
		}
		elements[size++] = element;
	}

	// iterator() 메서드
	public Iterator<T> iterator() {
		return new MyIterator();
	}

	private class MyIterator implements Iterator<T> {
		private int currentIndex = 0; // 현재 위치

		@Override
		public boolean hasNext() {
			return currentIndex < size; // 현재 인덱스가 size보다 작은지 확인
		}

		@Override
		public T next() {
			return (T) elements[currentIndex++]; // 현재 요소 반환 후 인덱스 증가
		}

		@Override
		public void remove() {

		}
	}
}
