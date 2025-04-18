package ro.ase.principii_clean_code.main;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.principii_clean_code.clase.Aplicant;
import ro.ase.principii_clean_code.clase.readers.ReaderAngajat;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			listaAngajati = new ReaderAngajat().readAplicants("angajati.txt");
			for (Aplicant angajat : listaAngajati) {
				System.out.println(angajat.toString());
				angajat.afisareaFinantarii();
				angajat.afisareStatus();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
