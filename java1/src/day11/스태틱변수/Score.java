package day11.스태틱변수;

public class Score {

	 //인스턴스변수 :  new에  의해서 개별적으로 만들어짐 (new에 의해서 공간 확보) 
	String name;  
	int kor;
	int eng;
	double avg;
	
	                          // new를 통해서 만들어지는 것이 아니다. 
	                                  //  프로그램시작되면  static 영역에 확보됨
	static String teacher ="우주연";  //   클래스변수  = > 한 개만 만들어지고 같이 사용 (공유)
	static int cnt=0;
	
	
	
	//기본생성자 	 
	public Score() {		
		//cnt++;
	}
	
	public Score( String name, int kor, int eng ) {
		this.name = name;
		this.kor   = kor;
		this.eng = eng;		
		this.avg  = ( this.kor + this.eng )/ 2.0; 		
		 
		//cnt++;
	}
	
	
	//인스턴스 초기화 블럭
	//모든 생성자에서 동일하게 작업해야 하는 부분 담당
	{
		cnt++;
	}
	 
	
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", avg=" + avg + "]";
	}

	
	
	public static void printTitle() {
		
		System.out.println("++++++++++++++++++++++++");
		System.out.println("+++++++++++성적표++++++++++");
		System.out.println("++++++++++++++++++++++++");
	}
	
	
	// 스태틱 메서드를 만들 때 : 인스턴스변수 사용 유무(인스턴스변수 사용하지 않는 메서드)
	
	// 스태틱 메서드와 인스턴스 메서드를 사용할 때 : 메서드 호출의 기준은 객체생성의 유무
	// 스태틱 메서드 : 객체생성과 관련없음 클래스명.메서드();
	// 인스턴스 메서드 : 객체생성과 관련있음, 객체생성 이후부터 사용할 수 있는 메서드
	
}
