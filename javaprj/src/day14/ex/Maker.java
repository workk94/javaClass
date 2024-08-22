package day14.ex;

import java.util.Scanner;
//import java.util.Random;

public class Maker implements Lego {

    private String[] heads = {"( ☭ ͜ʖ ☭)", "( ͡° ᴥ ͡°)", "ʕ ͡° ʖ̯ ͡°ʔ", "( ͡~ ͜ʖ ͡°)", "( ͡♥ ͜ʖ ͡♥)"};
    private String[] bodies = {"＼(    )", "(     )ゞ", "ヽ(   )ノ", "(ノ    )", "ヾ(    )ﾉ"};
    private String[] legs = {" U ︶ U ", "⊂(_ _⊂ノ", "～(_＿_)", " U ︶ U ", "  |  | "};

//    private Random random = new Random();
    private Scanner sc=new Scanner(System.in); 

    @Override
    public String makeHead() {
    	while(true) {
	    	System.out.println("Head를 선택하세요: \n"+
	    			"1. ( ☭ ͜ʖ ☭), 2. ( ͡° ᴥ ͡°), 3. ʕ ͡° ʖ̯ ͡°ʔ, 4. ( ͡~ ͜ʖ ͡°), 5. ( ͡♥ ͜ʖ ͡♥)");
	    	
	        int index=sc.nextInt()-1;
	        if(index>=0 && index <heads.length) {
	        	return heads[index];
	        } else {
	        	System.out.println("다시 선택하세요");
	        }
    	}
    }

    @Override
    public String makeBody() {
       
    	while(true) {
     	   System.out.println("Body를 선택하세요: \n"+
        			"1. ＼(    ) , 2. (     )ゞ, 3. ヽ(   )ノ, 4. (ノ    ) , 5. ヾ(    )ﾉ");
            int index=sc.nextInt()-1;
            if(index>=0 && index<bodies.length) {
            	return bodies[index];
            } else {
            	System.out.println("다시 선택하세요");
            }     
        }
    }

    @Override
    public String makeLegs() {
    	
    	while(true) {
	    	System.out.println("Leg를 선택하세요: \n"+
	    			"1.  U ︶ U , 2. ⊂(_ _⊂ノ, 3. ～(_＿_), 4.  U ︶ U , 5.  |  | ");
	        int index=sc.nextInt()-1;
	        if(index>=0 && index<legs.length) {
	        	return legs[index];
	        } else {
	        	System.out.println("다시 선택하세요");
	        }
    	}
    }

    @Override
    public void combine(String head, String body, String legs) {
        // 각 요소를 조합하여 출력
        System.out.println("Lego Character:");
        System.out.println("Head: " + head);
        System.out.println("Body: " + body);
        System.out.println("Legs: " + legs);
    }
}