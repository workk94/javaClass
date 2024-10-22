package sample.ex;

public class Ex3 {

	public static void main(String[] args) {
		int a = 1;
		int d = 1;
		int an = 0;
		int sn = 0;

		for (int i = 1; i <= 100; i++) {
		  for (int j = 1; j <= i; j++) {
		    an = a + (j - 1) * d;
		    sn += an;
		  }
		}

		System.out.println(sn);
	}

}
