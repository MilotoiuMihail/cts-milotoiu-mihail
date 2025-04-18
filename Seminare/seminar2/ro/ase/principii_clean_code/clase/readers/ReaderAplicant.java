package ro.ase.principii_clean_code.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.principii_clean_code.clase.Aplicant;

public abstract class ReaderAplicant {
	public abstract List<Aplicant> readAplicants(String file) throws FileNotFoundException;

	public void readFromFile(Scanner input, Aplicant aplicant) {
		aplicant.setNume(input.next());
		aplicant.setPrenume(input.next());
		aplicant.setVarsta(Integer.valueOf(input.nextInt()));
		aplicant.setPunctaj(Integer.valueOf(input.nextInt()));
		aplicant.setNr_proiecte(Integer.valueOf(input.nextInt()));
		String[] denumireProiecte = new String[aplicant.getNr_proiecte()];
		for (int i = 0; i < aplicant.getNr_proiecte(); i++)
			denumireProiecte[i] = input.next();
		aplicant.setDenumireProiecte(denumireProiecte);
	}
}
