package ro.ase.adapterClass.model.existent;

import ro.ase.adapterClass.model.nou.CreditLeasing;

public class CreditAdapterClass extends CreditLeasing implements Credit{

	@Override
	public void oferaCredit(int suma) {
		// TODO Auto-generated method stub
		super.oferaLeasing(suma);
	}

}
