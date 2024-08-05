package sample;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    	String my_string = "programmers";
    	String alp = "p";
    	String after = alp.toUpperCase();
    	String result = "";
    	
    	result = my_string.replace(alp, after);
    	
    	System.out.println(result);
    	
    }

}
