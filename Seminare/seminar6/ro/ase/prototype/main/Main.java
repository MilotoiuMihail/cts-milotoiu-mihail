package ro.ase.prototype.main;

import ro.ase.prototype.model.AbstractPrototype;
import ro.ase.prototype.model.Client;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		AbstractPrototype clientPrototype=new Client("Andrei","0722403492","andrei@gmail.com");
		AbstractPrototype client=clientPrototype.createCopy();
		
		System.out.println(client.toString());
	}

}
