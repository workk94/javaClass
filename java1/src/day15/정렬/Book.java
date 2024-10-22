package day15.정렬;

public class Book implements MyComparable{
	String name;
	int price;
	
	
	public Book(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int result;
		Book b = (Book) o;
		//기준의 값이 크면 양수가 전달되도록 하겠다 
		if(this.price > b.price) {
			result = 1;
		} else result = -1;
		return result;
	}
	
	
	

}