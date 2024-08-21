package day13.string;

public class Ex05 {
	public static void main(String[] args) {
		String str="AWESOME-amazing";
		
		
		//문자열의 길이 
		System.out.println(str.length());
		
		//전부 대문자  
		System.out.println(str.toUpperCase());
		
		//전부 소문자 
		System.out.println(str.toLowerCase());
		
		//일부 자르기 
		System.out.println(str.substring(8)); // 시작 index ~ 끝까지 
		System.out.println(str.substring(1,4)); // 시작 index ~ 끝 index 전까지
		
		String[] result = str.split("-");
		
		for(String s : result) {
			System.out.println(s);
		}
		
		//String str2="AWESOME-amazing";
		String str2="AWESOME-amazing1";
		
		boolean result2  = str.equals(str2);
		System.out.println(result2);
	}
}
