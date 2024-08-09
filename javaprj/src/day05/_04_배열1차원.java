package day05;

public class _04_배열1차원 {

	public static void main(String[] args) {

		int[] a = new int[5];
		String[] b = new String[5];
		boolean[] c = new boolean[5];
		double[] d = new double[5];

		// 배열의 초기화
		
		//배열 선언할 때만 초기화 할 수 있다 
		String[] dramas = { "카지노", "아이언맨", "데스티네이션", "눈물의여왕", "낮과밤이 다른그녀" };
		
		
		/*
		 * System.out.println(dramas[0]); System.out.println(dramas[1]);
		 * System.out.println(dramas[2]); System.out.println(dramas[3]);
		 * System.out.println(dramas[4]);
		 */
		
		for(int i = 0; i<dramas.length; i++) {
			System.out.println(dramas[i]);
		}
		
		
		//i dramas[i]
		//0 dramas[0]
		//1 dramas[1]
		//2 dramas[2]
		//3 dramas[3]
		//4 dramas[4]
		 
	}

}
