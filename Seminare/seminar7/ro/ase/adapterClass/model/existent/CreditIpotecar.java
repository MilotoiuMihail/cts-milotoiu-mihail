package ro.ase.adapterClass.model.existent;

public class CreditIpotecar implements Credit {

	@Override
	public void oferaCredit(int suma) {
		// TODO Auto-generated method stub
		System.out.println("A fost oferit creditul ipotecar in valoare de " + suma);
	}

}
