package day07;

public class 함수7_등비수열 {

	public static void main(String[] args) {
		
		int result = 등비수열구하기();
		System.out.println(result);
	}
	
	public static int 등비수열구하기() {
		int a=2;  //첫항
		int r=3 ;  //공비 
		int an=0 ;// 항
		int sn =0; // 항의 누적 
		int n=0;
		
		while( n <7) {
			n=n+1;
			an =  a * (int) ( Math.pow(r, n-1));
//			System.out.println( an);
			sn = sn + an; // su+= an;			
		}
		 
//		System.out.println( sn);
		return sn;
	}

}
