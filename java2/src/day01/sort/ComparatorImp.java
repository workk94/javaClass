package day01.sort;

import java.util.Comparator;

public class ComparatorImp  implements Comparator<Moving2>{

	@Override
	public int compare(Moving2 o1, Moving2 o2) {
		// TODO Auto-generated method stub
		return o1.power  - o2.power;
	}

	  

}
