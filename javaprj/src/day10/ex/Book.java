package day10.ex;

public class Book {
	private String title;
	private String author;
	private int price;
	
	//생성자
	public Book() {
		
	}
	public Book(String title) {
		this(title, null, 0);
	}
	
	public Book(String title, int price) {
		this(title, null, price);
	}
	public Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return "제목 : " + title + " 저자 : " + author + " 가격 : " + + price;
	}
}
