package day14.ex;

public class JSMyLego implements Lego {
	
	private int idx;
	
	JSMyLego(){
		this.idx = idx;
	}
	
	//methods
	public void setRandIdx() {
	    int randIdx = (int) (Math.random() * 3) + 1; 
	    this.idx = randIdx - 1; 
	}

	@Override
	public String makeHead() {
		String[] heads = new String[3];
		heads[0] = "ʕ•ᴥ•ʔ";
		heads[1] = "(•◡•)";
		heads [2] = " (•ᴥ•)";
	
		setRandIdx();
		String myHead = heads[idx];
		return myHead;
	}

	@Override
	public String makeBody() {
		String myBody = "|[:::]|";
		return myBody;
	}

	@Override
	public String makeLegs() {
		String myLegs = "ʕʘ‿ʘʔ";
		return myLegs;
	}

	@Override
	public void combine(String head, String body, String legs) {
		System.out.println(head);
		System.out.println(body);
		System.out.println(legs);
	}
}
