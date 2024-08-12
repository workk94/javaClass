package day04;

public class _10_등비수열_2 {

	public static void main(String[] args) {
		// 1	2	3	4	5	6	7
		// 2	6	18	54	162	486	1458
		
		// 2
		// 6 => 2 * 3
		// 18 => 2 * 3 * 3
		// 54 => 2 * 3 * 3 * 3
		
		int a = 2; //첫항
		int r = 3; //공비
		int an = 0; // 항
		int sn = 0; // 항의 누적 
		int n = 0;
		
		while(n<7) {
			n++;
			an = a * (int)Math.pow(r, n-1);
			System.out.println(an);
			sn += an; // sn = sn + an
		}
		
		System.out.println(sn);

	}

}
