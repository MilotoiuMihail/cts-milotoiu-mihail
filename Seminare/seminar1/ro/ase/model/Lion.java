package ro.ase.model;

public class Lion extends Animal {

	public Lion(String name) {
		super(name);
	}

	@Override
	public void eat(String ownerName) {
		System.out.println("The lion " + this.getName() + " was fed by " + ownerName);
	}

}
