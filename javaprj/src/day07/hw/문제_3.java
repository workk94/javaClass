package day07.hw;

public class 문제_3 {

	public static void main(String[] args) {
		String[] wheatherInfoArr = new String[] {"맑음", "흐림", "흐림", "소나기", "맑음", "비", "비"};
		
		String[] weatherArr = getWeatherInfoWeek(wheatherInfoArr);
		
		for(int i = 0; i < weatherArr.length; i++) {
			System.out.println(weatherArr[i]);
		}
		
	}
	public static String[] getWeatherInfoWeek(String[] arr){
		String[] week = new String[] {"일", "월", "화", "수", "목", "금", "토"};
		String[] result = new String[7];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = week[i] + " : " + arr[i];
		}
		
		return result;
	}
}
