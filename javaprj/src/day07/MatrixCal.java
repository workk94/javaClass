package day07;

public class MatrixCal {

	public static void main(String[] args) {
		int[][] matrix1 = new int[][] { { 2, 3 }, { 1, 2 } };
		int[][] matrix2 = new int[][] { { 2, 3 }, { 1, 2 } };
//		double[][] matrix4 = {{2, 3},{1, 2}};		
		
		//보여주기
		showMatrix(matrix1);
		//덧셈
		int[][] matrix3 = addMatrix(matrix1, matrix2);
		showMatrix(matrix3);
		//뺄셈
		matrix3 = subMatrix(matrix1, matrix2);
		showMatrix(matrix3);
		//곱셈
		matrix3 = mulMatrix(matrix1, matrix2);
		showMatrix(matrix3);
		//전치
		matrix3 = transMatrix(matrix3);
		showMatrix(matrix3);
		
//		matrix4 = inverseMatrix(matrix4);
//		showMatrix(matrix4);
		
	}

	// 행렬 출력 
	public static void showMatrix(int[][] x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	// 2X2 행렬 덧셈
	public static int[][] addMatrix(int[][] x, int[][] y) {
		int[][] result = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				result[i][j] = x[i][j] + y[i][j];
			}
		}

		return result;
	}
	
	// 2X2 행렬 뺄셈
	public static int[][] subMatrix(int[][] x, int[][] y) {
		int[][] result = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				result[i][j] = x[i][j] - y[i][j];
			}
		}
		
		return result;
	}

	// 2X2 행렬 곱셈 
	public static int[][] mulMatrix(int[][] x, int[][] y) {
		int[][] result = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				result[i][j] = x[i][0]*y[0][j] + x[i][1]*y[1][j];
			}
		}
		
		return result;
	}
	
	// 2X2 전치행렬
	// 전치행렬 : 행과 열 위치 바꾼거 
	public static int[][] transMatrix(int[][] x){
		int[][] result = new int[2][2];
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				result[i][j] = x[j][i];
			}
		}
		
		return result;
	}
	
	// 2X2 역행렬
	public static double[][] inverseMatrix(double[][] x){
		double[][] result = new double[2][2];
		double det = getDet(x);
		result[0][0] =  (1/det)*(x[1][1]); // d
		result[0][1] = (1/det)*(-x[0][1]); // -b
		result[1][0] = (1/det)*(-x[1][0]); // -c
		result[1][1] = (1/det)*(x[0][0]); // a
		return result;
	}
	
	// 행렬식(det) 구하는 함수
	// det = ad - bc; 만약 ad-bc가 0이면 역행렬이 존재하지 않음 
	public static double getDet(double[][] x ) {
		double det = x[0][0] * x[1][1] - x[0][1] * x[1][0];
		return det;
	}
}