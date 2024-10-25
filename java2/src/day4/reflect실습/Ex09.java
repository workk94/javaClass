package day4.reflect실습;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Ex09 {
	public static void main(String[] args) throws IOException {
		
		
		//BufferedReader 보조스트림 기본생성자 없음 
		BufferedReader br = new BufferedReader( new FileReader("src/day4/reflect실습/config.txt"));
		String line = br.readLine();
		//System.out.println(line);
		
		String[] info = line.split("=");
		String key = info[0];
		String value = info[1];
		
		System.out.println(key);
		System.out.println(value);
	}
}
