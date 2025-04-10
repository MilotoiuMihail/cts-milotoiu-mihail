package ro.ase.principii_clean_code.clase;

import java.util.Arrays;

public class Angajat extends Aplicant {
	private String ocupatie;
	private int salariu;
	private static int sumaFinantata = 10;

	public String getOcupatie() {
		return ocupatie;
	}

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public int getSalariu() {
		return salariu;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	public static void setSumaFinantata(int sumaFinantata) {
		Angajat.sumaFinantata = sumaFinantata;
	}

	public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte,
			int salariu, String ocupatie) {
		super(nume, prenume, varsta, punctaj, nr_proiecte, denumire_Proiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}

	public Angajat() {
		super();

	}

	@Override
	public String toString() {
		return "Angajat: " + super.toString() + ", Ocupatie=" + this.ocupatie + ", salariu=" + this.salariu;
	}
	@Override
	public void afisareaFinantarii() {
		// TODO Auto-generated method stub
		System.out.println("Angajatul " + super.afisareFinantare(Angajat.sumaFinantata));
	}

}
