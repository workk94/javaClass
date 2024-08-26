package day16.학생관리;

import java.util.ArrayList;
import java.util.Scanner;

public class 실습학생관리 {
	public static void main(String[] args) {

		ArrayList<Score> studentList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		studentList.add(new Score("홍길동", 1, 85));
		studentList.add(new Score("김길동", 2, 90));
		studentList.add(new Score("박길동", 3, 78));

		// 등록

		System.out.print("이름, 아이디, 성적 입력 : ");
		String name = sc.nextLine();
		int id = sc.nextInt();
		int kor = sc.nextInt();
		sc.nextLine();

		Score s = new Score(name, id, kor);
		studentList.add(s);

		// 조회
		for (Score score : studentList) {
			System.out.println(score.toString());
		}

		// 변경
		System.out.print("학번 입력 : ");
		int selectId = sc.nextInt();
		sc.nextLine();

		Score searchScore = null;
		for (Score score : studentList) {
			if (score.getStudentId() == selectId) {
				searchScore = score;
			}
		}

		System.out.print("학생성적 변경 : ");
		int updateScore = sc.nextInt();
		searchScore.setScore(updateScore);
		System.out.println("변경완료");

		// 조회
		for (Score score : studentList) {
			System.out.println(score.toString());
		}

		// 삭제
		
		System.out.print("학번 입력하세요 : ");
		int deleteId = sc.nextInt() ;
		
		sc.nextLine();
		Score deleteScore = null;
		for(Score score : studentList) {
			if(score.getStudentId() == deleteId) {
				deleteScore = score;
			}
		}
		
		studentList.remove(deleteScore);
		System.out.println("삭제 완료");
		
		// 조회
		
		for (Score score : studentList) {
			System.out.println(score.toString());
		}

				
	}
}
