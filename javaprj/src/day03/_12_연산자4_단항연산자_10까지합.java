package day03;

public class _12_연산자4_단항연산자_10까지합 {

	public static void main(String[] args) {
		int n=0;
		int sum=0;

		while( n++ < 10) {                                         
		    sum += n ; 
		} 
		System.out.println( sum ); 
/*
		0            0
		n  n++     sum 

		1   0      1
		2   1      3
		3   2      6
		4   3      10
		5   4      15
		6   5      21
		7   6      28
		8   7      36
		9   8      45
		10  9     55 
		*/
		 
	}

}