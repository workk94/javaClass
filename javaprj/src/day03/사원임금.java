package day03;

import java.util.Scanner;

// 사원번호, 일한시간(주급), 시간당 임금을 읽어서 사원의 급여를 계산한다
// 일한 시간이 40시간을 초과한 경우 40시간 초과 분에 대해서는 임금율을 1.5배로 계산한다
// 총 지급액이 40만원을 초과한 경우에 세금으로 3만원을 공제한다 
public class 사원임금 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// 변수선언
		
		// 입력자료
		int work_time;
		int work_pay;
		
		// 출력자료
		double pay;
		
		// 처리자료
		int work_time_over;
		double work_pay_over;
		
		work_time = sc.nextInt();
		work_pay = sc.nextInt();
		
		if(work_time > 40) { // 60시간 이라면 20*초과단과 + 40 * 기본단가
			work_time_over = work_time - 40;
			work_pay_over = work_pay * 1.5;
			pay = (work_time_over * work_pay_over) + (40* work_pay);
		} else {
			pay = work_time * work_pay;
		}
		
		// 공제 
		if(pay > 400000) {
			pay = pay - 30000;
		}
		
		// 출력 
		System.out.println(pay);

	}

}
