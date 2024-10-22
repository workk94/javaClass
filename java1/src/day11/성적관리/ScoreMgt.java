package day11.성적관리;

public class ScoreMgt {
	public static void main(String[] args) {
		
		
		Score s = new Score("홍길동", 50, 60); // s객체 
		Score s2 = new Score("동동", 80, 81);  
		Score s3 = new Score("길동", 100, 90); 
		
//		s.calc();
//		s2.calc();
//		s3.calc();
		
		
//		System.out.println(s.toString());
		System.out.println(s);
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		
		// 참조형변수가 배열로 만들어짐 
		Score[] scores = new Score[3];
		scores[0] = new Score("홍길동", 50, 60);
		scores[1] = new Score("동동", 80, 81);
		scores[2] = new Score("길동", 100, 90);
		
		
		for(int i = 0; i < scores.length; i++) {
//			System.out.println(scores[i].toString());
			System.out.println(scores[i]);
		}
		
		
//		for(Score score : scores) {
//			System.out.println(score.toString());;
//		}
		
	}
}
