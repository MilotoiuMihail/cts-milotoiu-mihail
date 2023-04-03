package ro.ase.principii_clean_code.clase;

import java.util.Arrays;

public abstract class Aplicant {
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nr_proiecte;
	protected String[] denumireProiecte;
	private static int pragAcceptare = 80;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void afisareStatus() {
		System.out.println("Aplicantul " + this.nume + " " + this.prenume
				+ (this.punctaj > Aplicant.pragAcceptare ? "" : " nu") + " a fost acceptat.");
	}

	public int getPunctaj() {
		return punctaj;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public void setDenumireProiecte(String[] denumireProiecte) {
		this.denumireProiecte = new String[this.nr_proiecte];
		for (int i = 0; i < this.nr_proiecte; i++) {
			this.denumireProiecte[i] = denumireProiecte[i];
		}
	}

	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiecte) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nr_proiecte = nr_proiecte;
		this.denumireProiecte = denumireProiecte;
	}

	public int getNr_proiecte() {
		return nr_proiecte;
	}

	public void setNr_proiecte(int nr_proiecte) {
		this.nr_proiecte = nr_proiecte;
	}

	public abstract void afisareaFinantarii();
	
	protected String afisareFinantare(int sumaFinantata) {
		return this.getNume() + " " + this.getPrenume() + " primeste "
				+ sumaFinantata + " Euro/zi in proiect.";
	}

	@Override
	public String toString() {
		return "Nume=" + this.nume + ", Prenume=" + this.prenume + ", Varsta=" + this.varsta + ", Punctaj="
				+ this.punctaj + ", Nr_proiecte=" + this.nr_proiecte + ", DenumireProiect="
				+ Arrays.toString(this.denumireProiecte);
	}

}
