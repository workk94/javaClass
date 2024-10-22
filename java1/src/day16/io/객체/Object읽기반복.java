package day16.io.객체;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
 
public class Object읽기반복 {

	public static void main(String[] args) {
		 
		try (ObjectInputStream ois  = new ObjectInputStream(new FileInputStream("res/scoreList.txt"))){

		 
	 
			while (true) {
				Score data = (Score) ois.readObject();
				System.out.println("객체정보 " + data);
			} 
			
			 

		} catch(EOFException e) {
			System.out.println("다 읽음");
			
		}catch (FileNotFoundException e) {
		 
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
