package ro.ase.observer.model;

public class Client implements IClient {
	private String nume;

	public Client(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void primesteNotificare(String mesaj) {
		// TODO Auto-generated method stub
		System.out.println("Domnule " + this.nume + ", ati primit urmatoarea notificare: " + mesaj);
	}
}
