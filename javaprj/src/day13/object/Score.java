package day13.object;

class Score{
	   
    String name;
    int kor;
    int eng;
    int total;

    public Score(String name, int kor, int eng) {
          this.name  = name;
          this.kor = kor;
          this.eng = eng;
          
          calc();               
    }
   
    private void calc() {
          total  = kor+eng;
    }

    @Override
    public String toString() {
             return  kor + " "  + eng  +" " + total ;
    }
    
    @Override
    public boolean equals(Object obj) {
    	if(! (obj instanceof Score)) {
    		return false;
    	}
    	
    	Score another = (Score) obj;
    	if(this.kor == another.kor && this.eng == another.eng) {
    		return true;
    	}
		return false;
    }

}