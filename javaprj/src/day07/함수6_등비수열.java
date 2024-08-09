package day07;

public class 함수6_등비수열 {

	public static void main(String[] args) {
		
		int result = 등비수열구하기();
		System.out.println(result);

	}
	
	public static int 등비수열구하기() {
		int commonRatio=3;
		int firstTerm =2 ; 
		int currentTerm = firstTerm;
		int sum =2;
		
		
		//  2   6   18   54  162  486  1458 
		for( int i=2 ; i<=7 ; i++) {   //1~6
			currentTerm  = currentTerm *commonRatio;
			sum  += currentTerm;			
//			System.out.println( currentTerm);
		}		
		
//		System.out.println( sum);
		return sum;
	}

}
