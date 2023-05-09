package ro.ase.observer.main;

import ro.ase.observer.model.Client;
import ro.ase.observer.model.IClient;
import ro.ase.observer.model.Restaurant;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IClient client1 = new Client("Marius");
		IClient client2 = new Client("Mariana");
		IClient client3 = new Client("Ovidiu");
		
		Restaurant restaurant=new Restaurant("Casa Buna");
		restaurant.adaugareDiscount(10);
		restaurant.abonareClient(client1);
		restaurant.adaugaMeniu();
		restaurant.abonareClient(client2);
		restaurant.abonareClient(client3);
		restaurant.dezabonareClient(client1);
		restaurant.adaugareDiscount(20);
	}

}
