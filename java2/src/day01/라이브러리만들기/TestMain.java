package day01.라이브러리만들기;

public class TestMain {
	
	
	
	
	public static void main(String[] args) {
		
		MyLib lib = new MyLib();
		
		lib.printChar('a');
		
		lib.forSomethingDo(new CodeImpl());
		
	}
}
