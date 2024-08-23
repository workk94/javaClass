package day15.정렬;

public class Score2 implements Comparable{
	
	String name;
	int kor;
	int eng;
	int total;
	public Score2(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		calc();
	}
	
	private void calc () {
		total = kor + eng;
	}
	
	@Override
	public String toString() {
		return "Score2 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", total=" + total + "]";
	}
	
	
	@Override
	public int compareTo(Object o) {
		Score2 s = (Score2) o;
		return this.total - s.total;
	}
	

}
