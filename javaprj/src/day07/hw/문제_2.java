// 2. 날씨정보를 반환하는 함수 만들기 (임의의 날씨 정보)
package day07.hw;

public class 문제_2 {
	public static void main(String[] args) {
		
		
		String result = getWeatherInfo();
		
		System.out.println(result);
	}
	
	// 날씨 배열에 있는 요소를 랜덤하게 반환
	private static String getWeatherInfo() {
		String[] forcastInfo = new String[]{"sunny", "humid", "rainy", "rainstorm", "mild", "chilly", "cold snap"};
		int randIdx = (int) (Math.random() * forcastInfo.length); 
		return forcastInfo[randIdx];
	}
}
