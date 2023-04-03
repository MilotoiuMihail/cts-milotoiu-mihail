package ro.ase.main;

import ro.ase.model.Kangaroo;
import ro.ase.model.Lion;
import ro.ase.model.Zebra;
import ro.ase.model.Zoo;
import ro.ase.model.Zookeeper;

public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Bunesti", new Zookeeper("Marcel"));
		zoo.addAnimal(new Zebra("Vergi"));
		zoo.addAnimal(new Lion("Simba"));
		zoo.addAnimal(new Kangaroo("Buster"));
		zoo.feedAllAnimals();
	}

}
