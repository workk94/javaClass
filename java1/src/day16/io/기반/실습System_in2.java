package day16.io.기반;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class 실습System_in2 {
	public static void main(String[] args) {
		
		//java는 프로그램이 실행되면 static으로 System.in, System.out 제공함
		
		InputStream is = System.in; // 기반스트림 얻어오기 (표준입력 - 키보드)
		PrintStream os = System.out; // 기반스트림 내보내기 (표준출력 - 모니터)
		
		try {
	
			while(true) {
				int ch = is.read();
				if(ch == '\n') break;
				os.println((char ) ch);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
