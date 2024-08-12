package day08;

public class _02_함수사용이유2_코드분할목적 {
	
	public static void main( String[] args) {
		
		
		//추석음식 만들기 		
		//갈비찜 만들기
		
		String 음식1  = 갈비찜만들기();		
		
		//산적만들기 
		
		String 음식2 = 산적만들기();
		
		
		//송편 만들기 
		String 음식3 = 송편만들기();
		 
		
		// 잡채만들기 
		String 음식4  = 잡채만들기();
		
		System.out.println("추석음식 상차리기");
		System.out.println(음식1  +  음식2  +음식3 + 음식4);
		
		
	}
	
	
	
	//갈비찜만들기
	public static  String 갈비찜만들기() {		 
		System.out.println("핏물을 뺀다");
		System.out.println("야채를 다듬는다");
		System.out.println("양념을 하고 재운다");
		System.out.println("가스불에 올린다");		
		return  "맛있는 갈비찜";
		
	}
	
	
	//산적만들기
	public static String 산적만들기() {
		return  "알록달록 산적";
	}

	
	public static String 송편만들기() {
		return  "쫀득쫀득 송편";
	}
	
	
	public static String  잡채만들기() {
		return "소고기표고잡채";
	}
}
