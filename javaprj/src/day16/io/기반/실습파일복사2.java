package day16.io.기반;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 실습파일복사2 {
	public static void main(String[] args) {
		
		//파일읽기 기반스트림 
		//파일쓰기 기반스트림 
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("res/cute.jpg");
			fos = new FileOutputStream("res/cutecopy6.jpg");
			
			//자바 9버전 이후
			fis.transferTo(fos);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} 
		
	}
}
