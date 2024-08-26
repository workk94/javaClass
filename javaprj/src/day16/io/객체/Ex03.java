package day16.io.객체;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex03 {

	public static void main(String[] args) {		 
	 
		 
				ObjectInputStream oi;
				try {
					oi = new ObjectInputStream(  new FileInputStream("res/output10.txt"));
					while(true) {
						Score  s = (Score)oi.readObject();
						System.out.println( s);									
					}			
					
				}catch( EOFException e) {
					System.out.println( "다 읽었음");	
				}
				catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
	
			
				
				//상속관계에서 범위가 작은것 부터  catch 해야 함 
			 
		 
		
		

	}

}
