package ro.ase.model;

public class Kangaroo extends Animal {

	public Kangaroo(String name) {
		super(name);
	}

	@Override
	public void eat(String ownerName) {
		System.out.println("The kangaroo " + getName() + " was fed by " + ownerName);
	}

}
