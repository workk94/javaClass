package day1.연습;

public class Acorn implements Comparable<Acorn>{
	String id;
	String pw;
	String name;
	
	
	public Acorn() {
		// TODO Auto-generated constructor stub
	}
	
	public Acorn(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Acorn [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Acorn o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
	
}
