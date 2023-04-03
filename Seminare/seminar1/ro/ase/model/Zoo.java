package ro.ase.model;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private String name;
	private Zookeeper zookeeper;
	private List<Animal> animals;

	public Zoo(String name, Zookeeper zookeeper) {
		super();
		this.name = name;
		this.zookeeper = zookeeper;
		this.animals = new ArrayList<Animal>();
	}

	public void feedAllAnimals() {
		animals.forEach(animal -> zookeeper.feedAnimal(animal));
	}

	public void addAnimal(Animal animal) {
//	if(animals==null)
//		animals=new ArrayList<Animal>();
		animals.add(animal);
	}

}
