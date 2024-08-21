package day13.arraylist;

public class Score {
	String name;
	int kor;
	int eng;
	
	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	@Override
	public String toString() {
		return name + " " + eng + " " + kor;
	}
	
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
	}
}
