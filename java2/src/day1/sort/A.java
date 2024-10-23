package day1.sort;

import java.util.Comparator;

public class A  implements Comparator<Moving2>{

	
	@Override
	public int compare(Moving2 o1, Moving2 o2) {	 
		return  o1.code.compareTo(o2.code);
	}
	
	

}
