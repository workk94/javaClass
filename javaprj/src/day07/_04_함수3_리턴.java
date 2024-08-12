package day07;


public class _04_함수3_리턴 {
	public static void main(String[] args) {
		
		//어린이 판단(12세 이하)
		int age = 13;
		int ticket = 50000;
		boolean result;
		int pay;
		if(age <= 12) {
			result = true;
		} else {
			result = false;
		}
		//if(result) : 이렇게 많이 씀 
		if(result == true) {
			pay = (int) (ticket * 0.5);
		} else {
			pay = ticket;
		}
		System.out.println(pay);
		
		
		age = 7;
		ticket = 100000;
		boolean rtn = 어린이판단(age);
		if(rtn==true) {
			pay = (int)(ticket*0.5);
		} else {
			pay = ticket;
		}
		System.out.println(pay);
		
	}

	//기능 : 어린이 판단함수
	//입력 : (매개변수) : 나이
	//반환 : true, false
	
				//반환형	메서드명	(매개변수)
	public static boolean 어린이판단(int age) {
		boolean result;
		if(age <= 12) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}


