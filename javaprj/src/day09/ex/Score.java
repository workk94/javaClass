package day09.ex;

public class Score {
	private String name;
	private int kor;
	private int eng;
	private double avg;
	
	Score(String name, int kor, int eng){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.avg = (kor + eng) / 2.0;
	}
	
	public void printScore() {
		System.out.println("학생이름 : " + this.name);
		System.out.println("국어 : " + this.kor);
		System.out.println("영어 : " + this.eng);
		System.out.println("평균 : " + this.avg);
	}

}
