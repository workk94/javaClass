package day16.io.기반;

import java.io.IOException;

public class Ex03 {
  public static void main(String[] args) {

		//한바이트씩 계속 읽음 
		while( true) {
			
			try {
				int data = System.in.read();
				System.out.print( (char) data);
				
				if( data == '\n')break;
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
}
