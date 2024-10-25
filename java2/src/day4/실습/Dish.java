package day4.실습;

public class Dish {
	public Dish(int id, String name) {
		super();
		this.id = id;
		this.name = name;

	}

	int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
