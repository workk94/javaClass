package day05.ex;

public class Ex2 {

	public static void main(String[] args) {
		int[] temperatures = { 33, 35, 32, 35, 36, 35, 34 };
		double tempSum = 0; // 이번주 날씨의 총합
		double tempAvg; // 이번주 날씨의 평균 
		int cnt = 0;
		int tempMax = -1;
		
		// 1) 이번주 날씨정보를 출력하시오
		System.out.println("이번주 날씨정보 : ");

		for (int i = 0; i < temperatures.length; i++) {

			System.out.print(temperatures[i] + " ");
		}
		
		System.out.println();
		
		
		//2) 평균온도를 구하시오
		for (int i = 0; i < temperatures.length; i++) {
			tempSum += temperatures[i];
		}
		tempAvg = tempSum / temperatures.length;
		
		System.out.printf("평균온도 : %.2f도\n",tempAvg);
		
		
		//3) 35도가 넘는 날의 횟수를 구하시오
		for (int i = 0; i < temperatures.length; i++) {
			if(temperatures[i] > 35) {
				cnt++;
			}
		}
		System.out.println(cnt + "회");
		
		//4) 가장 높은 온도를 구하시오
		for (int i = 0; i < temperatures.length; i++) {
			if(tempMax < temperatures[i]) {
				tempMax = temperatures[i];
			}
		}
		
		System.out.println(tempMax);
	}

}
