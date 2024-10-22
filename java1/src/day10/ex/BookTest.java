//실습 1,2,3
package day10.ex;

public class BookTest {

	public static void main(String[] args) {
		Book b = new Book(); // 기본생성자 
		Book b1 = new Book("어린왕자"); // title
		Book b2 = new Book("어린왕자", 8000); // title price
		Book b3 = new Book("어린왕자", "생택쥐베리", 8000); // title author price
		
		
		//toString
		String result1 = b.toString();
		String result2 = b1.toString();
		String result3 = b2.toString();
		String result4 = b3.toString();
		
		System.out.println("-toString");
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		//객체 출력하기 
		System.out.println("-객체 출력하기");
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		Book[] bookArr = new Book[3];
		//NullPointerException
//		bookArr[0].toString();
		
		//
		bookArr[0] = new Book();
		String result5 = bookArr[0].toString();
		System.out.println("-객체배열 출력하기1");
		System.out.println(result5);
		
		String result[] = new String[3];
		
		System.out.println("-객체배열 출력하기2");
		// 객체 배열 생성하고 출력하기 
		for(int i = 0; i < bookArr.length; i++) {
			bookArr[i] = new Book();
			result[i] = bookArr[i].toString();
			System.out.println(result[i]);
		}
		
		
		
	}

}
