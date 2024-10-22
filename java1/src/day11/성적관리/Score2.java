package day11.성적관리;

public class Score2 {
	private String name;
	private int kor;
	private int eng;
	private double avg;
	private char grade;
	

	//생성자
	//toString 
	
	public Score2() {
		// TODO Auto-generated constructor stub
	}
	
	public Score2(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Score2 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", avg=" + avg + ", grade=" + grade + "]";
	}
	
	//setter
	//getter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public double getAvg() {
		return avg;
	}

	public char getGrade() {
		return grade;
	}
	
	//성적처리하기 기능
	public void calc() {
		int total = kor + eng;
		avg = total / 2.0;
		if(avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else {
			grade = 'F';
		}
	}
}
