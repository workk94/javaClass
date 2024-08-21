package day13.ex;

import java.util.ArrayList;
import java.util.Scanner;

public class Book implements Management {
	
	// field
	private static int cnt = 0;
	private int idx;
	private String title;
	private String author;
	private int price;
	private ArrayList<Book> bookList = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
	// constructor
	public Book(){
		
	}
	
	public Book(String title, String author, int price) {
		this.idx = ++cnt;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public void run() {		
		while (true) {
			System.out.print("메뉴선택 [1]추가 [2]조회 [3]전체조회 [4]변경 [5]삭제 [6]종료 : ");
			String select = sc.next();
			
			//버퍼 비우기 
			sc.nextLine();
			
			switch (select) {
			case "1":
				append();
				break;
			case "2":
				search();
				break;
			case "3":
				searchAll();
				break;
			case "4":
				update();
				break;
			case "5":
				delete();
				break;
			case "6":
				System.out.println("종료");
				System.exit(0);
				break;
			default:
				System.out.println("잘못입력");
			}

		}

	}

	// method
	@Override
	public void append() {
		System.out.println("책 이름 : ");
		String appendTitle = sc.nextLine();
		System.out.println("저자 : ");
		String appendAuthor = sc.nextLine();
		System.out.println("가격 : ");
		int addBookPrice = sc.nextInt() ;
		
		Book newBook = new Book(appendTitle, appendAuthor, addBookPrice);
		bookList.add(newBook);
		
		
		System.out.println("추가완료");
	}

	@Override
	public void search() {
		if (bookList.size() <= 0) {
			System.out.println("책장이 비었습니다");
			return;
		}
		System.out.print("조회할 책 번호 : ");
		int searchIdx = sc.nextInt() - 1;
		int currentIdx= cnt;
		
		if(searchIdx > currentIdx || searchIdx < 0) {
			System.out.println("잘못된 번호입니다");
			return;
		}
		System.out.println("["+ (searchIdx + 1)  +"]"+ bookList.get(searchIdx));
		
	}

	@Override
	public void searchAll() {
		if (bookList.size() <= 0) {
			System.out.println("책장이 비었습니다");
			return;
		}
		System.out.println("번호|제목|저자|가격");
		for(Book book : bookList) {
			System.out.println("["+ book.getIdx() +"]"+ book);
		}

	}

	@Override
	public void update() {
		if (bookList.size() <= 0) {
			System.out.println("책장이 비었습니다");
			return;
		}
		System.out.print("변경할 책 번호 : ");
		int updateIdx = sc.nextInt() - 1;
		int currentIdx= cnt;
		
		sc.nextLine();
		
		if(updateIdx > currentIdx || updateIdx < 0) {
			System.out.println("잘못된 번호입니다");
			return;
		}
		
		System.out.print("변경할 제목 : ");
		String updateTitle= sc.nextLine();
		bookList.get(updateIdx).setTitle(updateTitle);;
		
		System.out.println("변경완료");

	}

	@Override
	public void delete() {
		if (bookList.size() <= 0) {
			System.out.println("책장이 비었습니다");
			return;
		}
		System.out.print("삭제할 책 번호 : ");
		int deleteIdx = sc.nextInt() - 1;
		sc.nextLine();
		if(deleteIdx < 0 || deleteIdx > deleteIdx) {
			System.out.println("잘못된 번호입니다");
			return;
		}
		bookList.remove(deleteIdx);
		System.out.println("삭제완료");
	}
	
	@Override
	public String toString() {
		return title + " " + author + " " + price;
	}
	
	
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
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
	
	

}
