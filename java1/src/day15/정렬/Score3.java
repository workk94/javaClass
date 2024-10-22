package day15.정렬;

public class Score3 implements Comparable<Score3> {
	
	String name;
	int kor;
	int eng;
	int total;
	public Score3(String name, int kor, int eng ) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
		calc();
	 
	}
	
	
	private void calc() {
		total  = kor+ eng;
	}
	
	@Override
	public String toString() {
		return "Score3 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", total=" + total + "]";
	}


	@Override
	public int compareTo(Score3 o) {
		return this.total - o.total;
	}
	
	
	

}
