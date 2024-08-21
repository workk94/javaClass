package day13.arraylist;

public class OListTest {
	public static void main(String[] args) {
		
		OList list = new OList();
		
		list.add(new Score("a", 100, 99));
		list.add(new Score("b", 99, 100));
		list.add(new Score("c", 100, 99));
		
		for(int i = 0; i <list.size(); i++) {
			Object o = list.get(i);
			System.out.println(o); //o.toString()
			((Score)o).printInfo();
		}
	
		
	}
}
