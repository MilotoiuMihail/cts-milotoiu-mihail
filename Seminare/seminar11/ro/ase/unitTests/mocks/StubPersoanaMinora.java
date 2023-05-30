package ro.ase.unitTests.mocks;

import ro.ase.unitTests.model.IPersoana;

public class StubPersoanaMinora implements IPersoana{

	@Override
	public String getSex() {
		// TODO Auto-generated method stub
		return "M";
	}

	@Override
	public int getVarsta() {
		// TODO Auto-generated method stub
		return 17;
	}

	@Override
	public boolean checkCNP() {
		// TODO Auto-generated method stub
		return true;
	}

}
