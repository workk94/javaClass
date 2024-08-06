// 등비수열 합(7번째항까지)구하기 
package sample.hw;

public class Ex11 {

	public static void main(String[] args) {
		int a = 2; // 첫항
		int r = 3; // 공비 
		int an = 0; // n번째 항
		int sn = 0; // 등비수열의 합
		
		for(int n = 1; n<=7; n++) {
			an = a * (int)Math.pow(r, n-1);
			sn += an;
		}
		
		System.out.println(sn);
	}

}
