package ro.ase.singleton.registry.nerecomandat;

import java.util.HashMap;
import java.util.Map;

import ro.ase.singleton.registry.nerecomandat.Firma;

public class Registru {
	private static Map<String, Firma> firme = new HashMap<>();

	public synchronized static Firma getFirma(String name) {
		if (!firme.containsKey(name)) {
			firme.put(name, new Firma(name, 0));
		}
		return firme.get(name);
	}
}
