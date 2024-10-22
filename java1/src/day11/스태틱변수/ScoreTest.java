package day11.스태틱변수;

public class ScoreTest {
	
	public static void main( String[] args) {
		Score s = new Score( "이효진" , 100 ,100 ) ;		
			
		
		Score s2 = new Score( "김세현" , 99 ,100 ) ;		
	
		
		Score s3 = new Score( "하예진" , 99 ,100  ) ;		
	
		
		
		Score.printTitle();
		System.out.println( s.toString() )	; // toString(s);
		System.out.println( s2 )	;	
		System.out.println( s3 )	;	
		
		
		int result  = Score.cnt;
		System.out.println( result);
		
		Score s4 = new Score();
		
		
		int result2  = Score.cnt;
		System.out.println( result2);
		
	}

}
