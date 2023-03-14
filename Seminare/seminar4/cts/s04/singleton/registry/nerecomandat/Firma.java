package cts.s04.singleton.registry.nerecomandat;

import java.util.HashMap;
import java.util.Map;

public class Firma {
	private String nume;
	private int numarAngajati;

	protected Firma(String nume, int numarAngajati) {
		super();
		this.nume = nume;
		this.numarAngajati = numarAngajati;
	}

	public void angajare() {
		this.numarAngajati += 1;
	}

	@Override
	public String toString() {
		return "Firma [nume=" + nume + ", numarAngajati=" + numarAngajati + "]";
	}
}
