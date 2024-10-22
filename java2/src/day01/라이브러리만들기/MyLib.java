package day01.라이브러리만들기;



public class MyLib {

	public void printChar(char ch) {
		
		//
		for(int i = 0; i < 3; i++) {
			System.out.println(ch);
		}
	}
	
	// 실행할 코드 = ? 
	// 인터페이스 활용함
	
	public void forSomethingDo(Code code) {
		for(int i = 0; i < 3; i++) {
			
			
			//
			code.runCode();
		}
	}
	
}
