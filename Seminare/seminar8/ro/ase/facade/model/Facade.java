package ro.ase.facade.model;

public class Facade {
	public void permiteIntrarea(Client client, Bilet bilet) {
		Politie politie = new Politie();
		if (client.getName().equals(bilet.getNumeCumparator())) {
			if (!politie.areCazier(client.getCnp())) {
				System.out.println("Supporterul " + client.getName() + " intra pe stadion");
			} else {
				System.out.println("Are cazier");
			}
		} else {
			System.out.println("Biletul este al altcuiva");
		}

	}
}
