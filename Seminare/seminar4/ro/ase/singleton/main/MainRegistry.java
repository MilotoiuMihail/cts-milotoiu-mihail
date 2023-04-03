package ro.ase.singleton.main;

import ro.ase.singleton.registry.Firma;

public class MainRegistry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Firma firma1 = Firma.getFirma("SC Ceva SRL");
		Firma firma2 = Firma.getFirma("SC Altceva SRL");
		Firma firma3 = Firma.getFirma("SC Ceva SRL");

		firma1.angajare();
		firma2.angajare();
		firma3.angajare();

		System.out.println(firma1);
		System.out.println(firma2);
		System.out.println(firma3);
	}

}
