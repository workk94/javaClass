package day2.prac;

import java.util.ArrayList;

public class Dish {
	String name;
	String recipe;
	String cooker;

	public Dish() {
		// TODO Auto-generated constructor stub
	}

	public Dish(String name, String recipe) {
		super();
		this.name = name;
		this.recipe = recipe;
	}
		
	public Dish(String name, String recipe, String cooker) {
		super();
		this.name = name;
		this.recipe = recipe;
		this.cooker = cooker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRecipe() {
		return recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}

	public String getCooker() {
		return cooker;
	}

	public void setCooker(String cooker) {
		this.cooker = cooker;
	}

	@Override
	public String toString() {
		return "Dish [name=" + name + ", recipe=" + recipe + ", cooker=" + cooker + "]";
	}

}
