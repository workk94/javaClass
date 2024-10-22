package day04;

public class _14_피보나치수열 {

	public static void main(String[] args) {
		// 1 1 2 
		
		long firN = 1;
		long secN = 1;
		int cnt = 2;
		long i;
		
		System.out.println(firN + "," + secN);
		
		while(cnt <= 10) {
			i = firN + secN; // 항을 구한다
			System.out.print( i + ", ");
			
			firN = secN; // 첫번째항과 두번째항 갱신
			secN = i;
			cnt++;
		}
	}

}
