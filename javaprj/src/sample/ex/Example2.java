package sample.ex;

public class Example2 {	
	public static void main(String[] args) {
		int sum = 0;
		int n = 1;
		int sw = 1;
		
		for(int i = 0; i<100; i++) {
			sum += n*sw;
			n++;
			sw = -sw;
		}
		
		System.out.println(sum);
	}

}
