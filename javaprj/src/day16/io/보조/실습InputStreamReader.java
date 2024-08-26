package day16.io.보조;

import java.io.IOException;
import java.io.InputStreamReader;

public class 실습InputStreamReader {
	public static void main(String[] args) {
		
		/*
		try {
			int ch = System.in.read();
			System.out.println((char) ch);

			ch = System.in.read();
			System.out.println((char) ch);

			ch = System.in.read();
			System.out.println((char) ch);

			ch = System.in.read();
			System.out.println((char) ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 한 바이트
		*/
		
		//보조스트림, 한 문자씩 읽기 위한 보조스트림 사용
		//보조스트림은 기반스트림 없이 생성될수 없다 
		
		
		//InputStreamReader is = new InputStreamReader(  ); //보조스트림은 기본생성자로 생성될 수 없다 => 기반 스트림이 있어야 하므로
		
		InputStreamReader is = new InputStreamReader(System.in);
		try {
			int result = is.read();
			System.out.println((char) result);
			result = is.read();
			System.out.println((char) result);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
