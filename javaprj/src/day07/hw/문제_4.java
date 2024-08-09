//4. 오늘 메뉴 추전해주는 함수 만들기 ( Math.random()  )사용하여  메뉴배열에서 임의의 메뉴를 반환하기

package day07.hw;

public class 문제_4 {

	public static void main(String[] args) {
		String[] menuArr = {"짜장", "카레", "볶음밥", "제육", "돈까스", "함박스테이크", "스파게티"};
		
		String todayMenu = getRandMenu(menuArr);
		
		System.out.println(todayMenu);
	
	}
	
	
	private static String getRandMenu(String[] arr) {
		int randIdx = (int)(Math.random() * arr.length);
		return arr[randIdx];
	}
}
