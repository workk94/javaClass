package day16.io.기반;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 실습파일복사 {
	public static void main(String[] args) {
		
		//파일읽기 기반스트림 
		//파일쓰기 기반스트림 
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("res/cute.jpg");
			fos = new FileOutputStream("res/cutecopy5.jpg");
			
			//반복문(파일의 끝 -1)
			while(true) {
				int ch = fis.read();
				if(ch == -1) break;
				
				fos.write(ch);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {
			
			//
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
