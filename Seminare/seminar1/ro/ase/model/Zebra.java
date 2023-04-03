package ro.ase.model;

public class Zebra extends Animal{

	public Zebra(String name) {
		super(name);
	}

	@Override
	public void eat(String ownerName) {
		System.out.println("The zebra " + this.getName() + " was fed by " + ownerName);
	}

}
