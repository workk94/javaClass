package day15.정렬;

public class Book2 implements Comparable<Book2>{
	String name;
	int price;
	public Book2(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		return "Book2 [name=" + name + ", price=" + price + "]";
	}



	@Override
	public int compareTo(Book2 o) {
		return this.price - o.price;
	}
}
