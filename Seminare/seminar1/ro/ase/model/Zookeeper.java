package ro.ase.model;

public class Zookeeper {
	private String name;
	
	public Zookeeper(String name) {
		super();
		this.name = name;
	}


	public void feedAnimal(Animal animal) {
		animal.eat(name);
	}
}
