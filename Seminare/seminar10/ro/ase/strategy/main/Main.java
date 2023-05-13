package ro.ase.strategy.main;

import ro.ase.strategy.model.Calator;
import ro.ase.strategy.model.PlataCardBancar;
import ro.ase.strategy.model.PlataCardCalatorii;
import ro.ase.strategy.model.PlataSms;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calator calator = new Calator("Alex");
		calator.platesteBilet(3);
		calator.setMetodaPlata(new PlataSms());
		calator.platesteBilet(23);
		calator.setMetodaPlata(new PlataCardBancar());
		calator.platesteBilet(25);
		calator.setMetodaPlata(new PlataCardCalatorii());
		calator.platesteBilet(25);
	}

}
