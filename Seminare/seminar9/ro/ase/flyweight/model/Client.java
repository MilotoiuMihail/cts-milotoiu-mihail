package ro.ase.flyweight.model;

public class Client implements IClient {
	private String nume;
	private String nrTelefon;
	private String email;

	public Client(String nume, String telefon, String email) {
		super();
		this.nume = nume;
		this.nrTelefon = telefon;
		this.email = email;
	}

	@Override
	public void afiseazaDetaliiRezervare(Rezervare rezervare) {
		// TODO Auto-generated method stub
		System.out.println("Clientul " + this.nume + ", telefon: " + this.nrTelefon + ", email: " + this.email
				+ " a rezervat masa nr: " + rezervare.getNrMasa() + " pentru " + rezervare.getNrPersoane()
				+ " persoane, la ora " + rezervare.getOra() + ".");
	}
}
