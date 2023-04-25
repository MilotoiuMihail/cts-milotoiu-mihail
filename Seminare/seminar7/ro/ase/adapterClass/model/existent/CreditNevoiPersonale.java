package ro.ase.adapterClass.model.existent;

public class CreditNevoiPersonale implements Credit{

	@Override
	public void oferaCredit(int suma) {
		// TODO Auto-generated method stub
		System.out.println("A fost oferit creditul de nevoi personale in valoare de " + suma);

	}

}
