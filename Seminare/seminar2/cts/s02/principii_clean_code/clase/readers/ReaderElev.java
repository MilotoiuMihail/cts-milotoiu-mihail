package cts.s02.principii_clean_code.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Elev;

public class ReaderElev extends ReaderAplicant {

	@Override
	public List<Aplicant> readAplicants(String file) throws FileNotFoundException {
		Scanner input = new Scanner(new File(file));
		input.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Elev elev = new Elev();
			elev.setClasa(input.nextInt());
			elev.setTutore(input.next());
			elevi.add(elev);
		}

		input.close();
		return elevi;
	}

}
