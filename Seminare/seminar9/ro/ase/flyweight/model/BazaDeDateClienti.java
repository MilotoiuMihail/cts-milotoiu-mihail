package ro.ase.flyweight.model;

import java.util.HashMap;
import java.util.Map;

public class BazaDeDateClienti {
	private Map<String, IClient> clienti = new HashMap<>();
	
	public IClient getClient(String nume, String nrTelefon, String email) {
		if(clienti.containsKey(nrTelefon)) {
			return clienti.get(nrTelefon);
		}
		IClient client=new Client(nume, nrTelefon,email);
		clienti.put(nrTelefon, client);
		return client;
	}
}
