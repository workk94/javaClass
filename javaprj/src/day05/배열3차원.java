//6
package day05;

public class 배열3차원 {

	public static void main(String[] args) {

		// 면, 행, 열
		int[][][] a = new int[2][3][3];

		// 변수초기화
		// 3차원 배열
		String[][][] str = {
				// 0면
				{ { "★1", "★2", "★3" }, { "★4", "★5", "★6" }, { "★7", "★8", "★9" }, },
				// 1면
				{ { "☆1", "☆2", "☆3" }, { "☆4", "☆5", "☆6" }, { "☆7", "☆8", "☆9" }, } };

		// 0면 (첫번째 2차원 배열)
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(str[0][i][j] + " ");

			}
			System.out.print("\n");
		}
		// 0면 (첫번째 2차원 배열)
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(str[1][i][j] + " ");

			}
			System.out.print("\n");
		}
		
		for(int i = 0; i<2; i++) {
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k <3; k++) {
					System.out.print(str[i][j][k] + " ");
				}
				System.out.println();
			}
		}

	}

}
