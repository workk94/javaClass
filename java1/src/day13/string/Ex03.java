package day13.string;

public class Ex03 {
	public static void main(String[] args) {
		String date1 = new String("2024-08-21");
		
		String[] result = date1.split("-");
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		for(String str : result) {
			System.out.println(str);
		}
	}
}
