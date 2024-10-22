package day16.io.객체;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex02 {

	public static void main(String[] args) {
		 
	 
			try( ObjectInputStream oi = new ObjectInputStream(  new FileInputStream("res/output10.txt") )){
				
				Score  s = (Score)oi.readObject(); // 다운캐스팅 해줘야됨
				System.out.println( s);
								
				s = (Score)oi.readObject();
				System.out.println( s);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		
		

	}

}
