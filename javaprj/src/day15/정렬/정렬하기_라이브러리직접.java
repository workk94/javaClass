package day15.정렬;

public class 정렬하기_라이브러리직접 {
	public static void main(String[] args) {
		Book[] books = new Book[3];
		
		books[0] = new Book("이것이 자바다", 25000);
		books[1] = new Book("자바의 정석", 35000);
		books[2] = new Book("재미있는 자바", 15000);
		
		
		//정렬
		MyArrays.sort(books);
		
		
		
	}
}	
