package ro.ase.observer.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant {
	private String nume;
	private List<IClient> clienti = new ArrayList<>();

	public Restaurant(String nume) {
		this.nume = nume;
	}

	@Override
	public void abonareClient(IClient client) {
		// TODO Auto-generated method stub
		if (client != null) {
			clienti.add(client);
		}
	}

	@Override
	public void dezabonareClient(IClient client) {
		// TODO Auto-generated method stub
		clienti.remove(client);
	}

	@Override
	public void notificare(String mesaj) {
		// TODO Auto-generated method stub
		for (IClient client : clienti) {
			client.primesteNotificare("Restaurantul " + this.nume + " iti trimite notificarea: " + mesaj);
		}
	}

	public void adaugaMeniu() {
		this.notificare("Am adaugat un meniu nou!");
	}
	public void adaugareDiscount(float discount) {
		this.notificare("Hei! Avem un discount de "+discount+"% la toate produsele!");
	}

}
