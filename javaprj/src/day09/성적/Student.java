package day09.성적;

public class Student {
	//멤버변수
	String name;
	private int kor;
	private int eng;
	private int total;
	private double avg;
	private char grade;	// ' '
	
	//
	public void input(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	
	//
	public void printInfo() {
		System.out.print(name);
		System.out.print(kor);
		System.out.print(eng);
		System.out.print(total);
		System.out.print(avg);
		System.out.println(grade);
	}
	
	//총점구하기
	
	private void calcTotal() {
		total = kor + eng;
	}
	
	private void calcAvg() {
		avg = total / 2.0;
	}
	
	public void calcGrade() {
		calcTotal();
		calcAvg();
		if(avg >= 90) {
			grade = 'A';
		} else if (avg >=80) {
			grade = 'B';
		} else if ( avg >= 70){
			grade = 'C';
		} else {
			grade = 'F';
		}
	}
}
