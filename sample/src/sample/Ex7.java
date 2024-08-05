package sample;

public class Ex7 {

	public static void main( String[] args ){    
	      double  h_population =250;
	      double k_population =180 ;
	      double h_rate =0.038;
	      double k_rate =0.042 ;

	      int year=1999;

	      while(  k_population  <= h_population ){   
		    year= year +1 ;
	            h_population = ( h_population *(1+h_rate) );  
	            k_population  = (k_population *  (1+k_rate)); 
	      }
	     System.out.println( year);
	    }


}
