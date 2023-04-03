package ro.ase.model;

public abstract class Animal {
	private String name;
	private int age;
	
	public Animal(String name) {
		super();
		this.name=name;
		this.age=10;
	}

	public abstract void eat(String ownerName);

	public String getName() {
		return name;
	}
}
