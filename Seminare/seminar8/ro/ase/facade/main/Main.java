package ro.ase.facade.main;

import ro.ase.facade.model.Bilet;
import ro.ase.facade.model.Client;
import ro.ase.facade.model.Facade;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client1=new Client("Rares", "5132145678901");
		Client client2=new Client("Razvan", "1132145678912");
		Bilet bilet1=new Bilet("Razvan");
		Bilet bilet2=new Bilet("Rares");
		
		Facade facade=new Facade();
        facade.permiteIntrarea(client1,bilet2);
        facade.permiteIntrarea(client2,bilet1);
	}

}
