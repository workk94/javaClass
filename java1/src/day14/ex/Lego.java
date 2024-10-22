package day14.ex;

public interface Lego {
	public String makeHead();
	public String makeBody();
	public String makeLegs();
	public void combine(String head, String body, String legs);
	
}
