package day15.정렬;

public class Score implements Comparable{
	//fields
	String name;
	int kor;
	int eng;
	int total;
	
	
	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
		calc();
	}
	
	private void calc() {
		total = kor + eng;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", total=" + total + "]";
	}
	
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub   // 반환값이 양수면  자리를 바꾼다
		
		 Score another  = (Score)o ;
		
		return this.kor  -  another.kor;   // 기준객체의 국어와 비교객체의 국어점수
		                                  //  기준객체의 국어점수  - 비교객체의 국어점수   ( 기준이 크면 양수가 전달되는 효과)
	}
	
}
