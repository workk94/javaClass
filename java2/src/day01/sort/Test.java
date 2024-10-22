package day01.sort;

import java.util.ArrayList;
import java.util.Collections;


/*
 * 
 *  interface Comparable{
 *     int compareTo( Object other) ;
 *  }
 *  
 *  interface Comparable<T>{
 *     int compareTo( T other) ;
 *  }
 * 
 * 
 */


public class Test {

	public static void main(String[] args) {
		 
		ArrayList<Moving> list = new ArrayList<>();
		
		list.add(new Moving("장주원","구룡포",100));
		list.add(new Moving("이미현","경기",80));
		list.add(new Moving("김두식","문산",90));
		list.add(new Moving("전영석","봉평",88));
		 
		
		//정렬		
		Collections.sort(list);
		
		
		
		for( Moving m  : list) {
			System.out.println( m);
		}
		
		
		
		
		///
		
		ArrayList<Moving2> list2 = new ArrayList<>();
		list2.add(new Moving2("장주원","구룡포",100));
		list2.add(new Moving2("이미현","경기",80));
		list2.add(new Moving2("김두식","문산",90));
		list2.add(new Moving2("전영석","봉평",88));
		 		
		 
		
		Collections.sort(list2);
		
		
		
		
		 
		
		
		
		
		

		
		
	}

}
