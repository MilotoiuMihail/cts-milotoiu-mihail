package ro.ase.observer.model;

public interface IRestaurant {
	void abonareClient(IClient client);

	void dezabonareClient(IClient client);

	void notificare(String mesaj);
}
