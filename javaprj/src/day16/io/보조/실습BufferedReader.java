package day16.io.보조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 실습BufferedReader {
	public static void main(String[] args) {
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader bf = new BufferedReader(is);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in); // 키보드입력 
		
		try {
			String input = bf.readLine();
			System.out.println(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
