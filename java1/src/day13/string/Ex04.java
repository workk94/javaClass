package day13.string;

public class Ex04 {
	public static void main(String[] args) {
		String text ="Love is a variety of different feelings, states, and" +
				"attitudes that ranges from interpersonal affection to pleasure";
		
		int cnt = 0;
		
		//수업
		/*
		for(int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if(ch == 'a') {
				cnt++;
			}
		}
		*/
		
		for(char ch : text.toCharArray()) {
			if(ch == 'a') cnt++;
		}
		
		System.out.println(cnt);
	}
}
