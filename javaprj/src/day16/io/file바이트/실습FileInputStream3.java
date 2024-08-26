package day16.io.file바이트;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class 실습FileInputStream3 {
	public static void main(String[] args) {
		
		
		// 리소스 자동 닫기 해주는 문법	

		try (FileInputStream fis = new FileInputStream("res/test.txt")){
			
			//파일의 끝을 알리는 문자의 아스키코드값 -1
			while(true) {
				int ch = fis.read();
				if(ch == -1) break; // -1(아스키코드값) 파일의 끝을 의미함 
				System.out.print((char)ch);
			}
			
			
			
		} catch (FileNotFoundException e) { 
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} 

	}
}
