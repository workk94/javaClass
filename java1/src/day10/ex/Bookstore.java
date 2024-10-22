//추가문제 1. 메뉴를 제공하여 객체배열에  (책)정보를 저장하고 출력하기   
//CRUD

package day10.ex;

import java.util.Scanner;

public class Bookstore {
	Scanner sc = new Scanner(System.in);
	private Book[] inventory = new Book[5];
	private int idx = 0;

	public void selectMenu() {
		loop: while (true) {
			System.out.print("메뉴 선택(1.추가 2.전체조회 3.검색 4.이름변경 5.삭제 6.종료) : ");
			int select = sc.nextInt();
			sc.nextLine();
			switch (select) {
			case 1:
				addBook(this.inventory, this.idx);
				break;
			case 2:
				listAllBook();
				break;
			case 3: 
				findBook();
				break;
			case 4: 
				updateBook();
				break;
			case 5: 
				deleteBook();
				break;
			case 6:
				System.out.println("종료합니다");
				break loop;
				
			default:
				System.out.println("잘못된 값입니다");

			}
		}
	}

	public void addBook(Book[] inventory, int index) {
		if (idx >= inventory.length) {
			System.out.println("책을 추가할 수 없습니다");
			return;
		}
		System.out.print("책 추가(title, price) : ");
		String title = sc.next();
		int price = sc.nextInt();
		sc.nextLine();
		inventory[idx++] = new Book(title, price);
	}

	public void listAllBook() {
		System.out.println("책을 조회합니다");
		System.out.println("-------------------------------------------");
		if(idx == 0) {
			System.out.println("책이 없습니다");
			System.out.println("-------------------------------------------");
			return;
		}
		for (int i = 0; i < this.idx; i++) {
			System.out.print( "[" + (i + 1) + "] : " );
			String title = this.inventory[i].getTitle();
//			String author = this.inventory[i].getAuthor();
			int price = this.inventory[i].getPrice();
			
//			System.out.println("제목 : " + title + ", 작가 : "+ author + ", 가격 : "+ price);
			System.out.println("제목 : " + title + ", 가격 : "+ price);
			
			//toString
			
//			String result = this.inventory[i].toString();
//			System.out.println(result);
		}
		System.out.println("-------------------------------------------");

	}

	public void findBook() {
		System.out.print("조회할 책 이름 : ");
		String title = sc.nextLine();
		int searchIdx = searchBookIdx(title);
		if(searchIdx == -1) {
			System.out.println("-------------------------------------------");
			System.out.println("찾는 책이 존재하지 않습니다");
			System.out.println("-------------------------------------------");
			return;
		} else {
			System.out.println("-------------------------------------------");
			System.out.print("["+(searchIdx+1)+"] : ");
			String searchedTitle = this.inventory[searchIdx].getTitle();
			int searchedPrice = this.inventory[searchIdx].getPrice();
			System.out.println("제목 : "+searchedTitle + " 가격 : " + searchedPrice);
			System.out.println("-------------------------------------------");
		}
		
	}
	
	public int searchBookIdx(String title) {
		for(int i = 0; i < this.idx; i++) {
			if(inventory[i] != null && title.equals(inventory[i].getTitle())) {
				return i;
			}
		}
		return -1;
	}
	
	public void updateBook() {
		System.out.print("변경할 책 번호를 입력해주세요 : ");
		int updateIdx = sc.nextInt() - 1;
		sc.nextLine();
		
		//배열을 초과하는 인덱스인지 확인
		if(updateIdx >= inventory.length || updateIdx < 0) {
	        System.out.println("잘못된 인덱스입니다");
	        return;
	    }
		//인덱스는 범위안에 있지만 책이 없는경우
		if(updateIdx >= idx || inventory[updateIdx] == null) {
	        System.out.println("책이 없습니다");
	        return;
	    }
		
		System.out.println("책 이름을 입력해주세요 : ");
		String updateTitle = sc.nextLine();
		this.inventory[updateIdx].setTitle(updateTitle);
		System.out.println("갱신완료");
	}
	
	public void deleteBook() {
		System.out.print("삭제할 책 번호를 입력해주세요 : ");
		int deleteIdx = sc.nextInt() - 1;
		sc.nextLine();
		//배열을 초과하는 인덱스인지 확인
		if(deleteIdx >= idx || deleteIdx < 0) {
	        System.out.println("잘못된 인덱스입니다");
	        return;
	    }
		//책이 없는 경우
	    if(idx == 0) {
	        System.out.println("삭제할 책이 없습니다");
	        return;
	    }
		inventory[deleteIdx] = null;
		for(int i = deleteIdx; i < idx - 1; i++) {
			inventory[i] = inventory[i+1];
		}
		//마지막 요소를 null로 설정
		inventory[idx - 1] = null;
		idx--;
		System.out.println("삭제완료");
	}
}
