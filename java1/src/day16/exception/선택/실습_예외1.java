package day16.exception.선택;

public class 실습_예외1 {
	
	
	public static void main(String[] args) {
		//
		int[] arr = {10, 9, 15};
		
		try {
			
			//예외가 발생하면 해당하는 예외 객체가 만들어짐 
			//catch블록으로 제공됨
			for(int i = 0; i <= arr.length; i ++) {
				System.out.println(arr[i]);
			}
			
			// 예외 발생했을때 대비코드 작성함 
		} catch(ArrayIndexOutOfBoundsException e) {
			//e.toString();
			//e.getMessage();
			//e.printStackTrace();
			System.out.println("배열의 범위 벗어남");
		}
		
		System.out.println("프로그램 정상종료");
	}
	
}
