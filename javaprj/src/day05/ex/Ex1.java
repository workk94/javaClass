package day05.ex;

import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		String[] menuWeek = new String[5];
		int[] lotto = new int[6];
		String[] favFood = new String[5];
		String[][] menuMonth = new String[4][5];
		int[][][] randomBoard = new int[3][3][3];
		// 1) 1차원배열 사용하기 - 일주일점심메뉴 또는 단어
		menuWeek[0] = "짜장";
		menuWeek[1] = "짬뽕";
		menuWeek[2] = "돈까스";
		menuWeek[3] = "제육";
		menuWeek[4] = "볶음밥";

		for (int i = 0; i < menuWeek.length; i++) {
			System.out.print(menuWeek[i] + " ");
		}
		System.out.println();
		// 2) 1차원배열 사용하기 - 예상 로또번호 저장하고 출력하기

		// 배열 초기화
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1); // 0부터 44까지 + 1
		}
		// 정렬 (import java.util.Arrays)
		Arrays.sort(lotto);

		// 출력
		for (int num : lotto) {
			System.out.print(num + " ");
		}
		System.out.println();

		// 3) 1차원 배열 사용하기 - 좋아하는 음식 5개 저장하고 출력하기
		favFood[0] = "삼겹살";
		favFood[1] = "볶음밥";
		favFood[2] = "우동";
		favFood[3] = "카레";
		favFood[4] = "스시";

		for (int i = 0; i < favFood.length; i++) {
			System.out.print(favFood[i] + " ");
		}

		// 4) 2차원배열 사용하기 - 한 달 점심메뉴 또는 단어

		menuMonth[0][0] = "김치찌개";
		menuMonth[0][1] = "된장찌개";
		menuMonth[0][2] = "불고기";
		menuMonth[0][3] = "비빔밥";
		menuMonth[0][4] = "김밥";
		menuMonth[1][0] = "비빔밥";
		menuMonth[1][1] = "갈비탕";
		menuMonth[1][2] = "잡채";
		menuMonth[1][3] = "떡국";
		menuMonth[1][4] = "부대찌개";
		menuMonth[2][0] = "삼겹살";
		menuMonth[2][1] = "된장찌개";
		menuMonth[2][2] = "잡채";
		menuMonth[2][3] = "비빔밥";
		menuMonth[2][4] = "갈비탕";
		menuMonth[3][0] = "김치찌개";
		menuMonth[3][1] = "불고기";
		menuMonth[3][2] = "비빔밥";
		menuMonth[3][3] = "삼계탕";
		menuMonth[3][4] = "김밥";
		
		System.out.println();
		System.out.println("- 이번달 메뉴 -");
		for (int i = 0; i < menuMonth.length; i++) {
			for (int j = 0; j < menuMonth[i].length; j++) {
				System.out.print(menuMonth[i][j] + " ");
			}
			System.out.println();
		}

		// 5) 3차원배열 사용하기
		int randomX = (int)(Math.random()*3);
		int randomY = (int)(Math.random()*3);
		int randomZ = (int)(Math.random()*3);
		char a = 'a';
		randomBoard[randomX][randomY][randomZ] = a;
		
		// 배열 출력
		
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(randomBoard[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
		
		
		

	}

}
