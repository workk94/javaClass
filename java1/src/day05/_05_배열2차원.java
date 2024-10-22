package day05;

public class _05_배열2차원 {

	public static void main(String[] args) {
		
		//2차원 배열 만들기 
		int[][] arr = new int[3][3];
		//0행
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		//1행
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		//2행
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		
		for(int i = 0; i<arr[0].length; i++) {
			for(int j = 0; j<arr.length;j ++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		//2차원배열 초기화
		//행, 열
		
		//1차원 배열을 요소로 가지는 배열이다.
		String[][] foods = {
				{ "돈까스", "김밥", "우동", "라면", "오므라이스" },
				{ "카레", "초밥", "돈까스", "순두부", "쫄면" },
				{ "우동", "스시", "제육", "치즈김밥", "카레" },
		};
		
		
		/*
		 * System.out.println(foods[0][0]); System.out.println(foods[0][1]);
		 * System.out.println(foods[0][2]); System.out.println(foods[0][3]);
		 * System.out.println(foods[0][4]);
		 */
		
		//1주차 메뉴 출력
		System.out.println("1주차 메뉴이다");
		for(int i=0; i<5; i++) {
			System.out.print(foods[0][i] + " ");
		}
		//2주차 메뉴
		System.out.println("\n2주차 메뉴이다");
		for(int i=0; i<5; i++) {
			System.out.print(foods[1][i] + " ");
		}
		System.out.println("\n3주차 메뉴이다");
		//3주차 메뉴
		for(int i=0; i<5; i++) {
			System.out.print(foods[2][i] + " ");
		}
		
		//2차원 배열 접근
		
		System.out.println("\n- 전체 메뉴 - ");
		for(int j = 0; j<3; j ++) { // 행을 반복 j:반복, 행을 접근할 첨자로 사용
			for(int i = 0; i<5; i++) { // 열을 반복 i : 열을 접근할 첨자로 사용
				System.out.print(foods[j][i] + " ");
			}
			System.out.println();
		}
	}

}
