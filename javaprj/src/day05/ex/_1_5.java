package day05.ex; //돌려보려면 이거 삭제하고

public class _1_5 {

	public static void main(String[] args) {
		int[][][] randomBoard = new int[3][3][3];
		int randomX = (int)(Math.random()*3);
		int randomY = (int)(Math.random()*3);
		int randomZ = (int)(Math.random()*3);
		char a = 'a';
		randomBoard[randomX][randomY][randomZ] = a;

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
