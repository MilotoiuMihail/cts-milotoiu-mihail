package ro.ase.strategy.model;

public class PlataCardBancar implements TipPlata{

	@Override
	public void plateste(double pretBilet) {
		// TODO Auto-generated method stub
		System.out.println("Plata biletului in valoare de "+pretBilet+" a fost efectuata cu cardul bancar");
	}

}
