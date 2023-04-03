package ro.ase.singleton.registry;

import java.util.HashMap;
import java.util.Map;

public class Firma {
	private String nume;
	private int cifraAfaceri;
	private int numarAngajati;
	private static Map<String, Firma> firme = new HashMap<>();

	private Firma(String nume, int cifraAfaceri, int numarAngajati) {
		super();
		this.nume = nume;
		this.cifraAfaceri = cifraAfaceri;
		this.numarAngajati = numarAngajati;
	}

	public void angajare() {
		this.numarAngajati += 1;
	}

	@Override
	public String toString() {
		return "Firma [nume=" + nume + ", cifraAfaceri=" + cifraAfaceri + ", numarAngajati=" + numarAngajati + "]";
	}

	public synchronized static Firma getFirma(String name) {
		if (!firme.containsKey(name)) {
			Firma firma = new Firma(name, 0, 0);
			firme.put(name, firma);
		}
		return firme.get(name);
	}
}
