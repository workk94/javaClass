package day07;

import java.util.Scanner;

public class 성적_배열 {

	public static void main(String[] args) {
		 
		//
		int[] kor  = new int[10];
		int[] eng = new int [10];
		int[] math = new int[10];
		String[] name = new String[10];
		
		
		//개인 성적 출력
		 
		double average;
		
		//과목별
		int  total_kor=0;
		int  total_eng=0;
		int total_math=0;
		
		//과목별 평균
		double avg_kor;
		double avg_eng;
		double avg_math;
		
		
		final int MAX=10;
		
		//
		Scanner sc = new Scanner( System.in);
		for( int i =0; i< MAX; i++) {
			
			kor[i] = sc.nextInt();
			eng[i] = sc.nextInt();
			math[i] = sc.nextInt();
			
			sc.nextLine();
			
			name[i]= sc.nextLine();
			
			average  = (kor[i] + eng[i] + math[i]) / 3.0 ;
			if(average>=90  ) {
				 System.out.println(  name[i] + " " + kor[i] + " " + eng[i] + " " + average +  "Excellent");
			}else if( average < 60) {
				 System.out.println(  name[i] + " " + kor[i] + " " + eng[i] + " " + average +  "Fail");
			}else {
				System.out.println(  name[i] + " " + kor[i] + " " + eng[i] + " " + average  );
			}
			 
			
			total_kor += kor[i];
			total_eng += eng[i];
			total_math += math[i];
			
			
		}
		
		//과목별 평균 구하기
		//과목별 평균 출력		
		 avg_kor  = (double) total_kor /MAX;
		 avg_eng  = (double)total_eng  /MAX;
		 avg_math = (double) total_math / MAX;
		 
		 System.out.println( "국어평균:"+ avg_kor);
		 System.out.println( "영어평균:"+ avg_eng);
		 System.out.println( "수학평균:"+ avg_math);
		

	}

}
