package ro.ase.adapterClass.main;

import ro.ase.adapterClass.model.existent.Credit;
import ro.ase.adapterClass.model.existent.CreditAdapterClass;
import ro.ase.adapterClass.model.existent.CreditIpotecar;

public class Main {

	public static void afisareCredit(Credit credit, int suma) {
		credit.oferaCredit(suma);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Credit creditIpotecar = new CreditIpotecar();
		Main.afisareCredit(creditIpotecar, 5000);
		Credit creditLeasing = new CreditAdapterClass();
		Main.afisareCredit(creditLeasing, 2500);
	}

}
