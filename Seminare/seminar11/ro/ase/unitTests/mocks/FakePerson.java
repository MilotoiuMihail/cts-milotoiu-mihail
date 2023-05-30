package ro.ase.unitTests.mocks;

import ro.ase.unitTests.model.IPersoana;

public class FakePerson implements IPersoana {
	private String getSexValue;
	private int getVarstaValue;
	private boolean checkCNPValue;

	@Override
	public String getSex() {
		// TODO Auto-generated method stub
		return this.getSexValue;
	}

	@Override
	public int getVarsta() {
		// TODO Auto-generated method stub
		return this.getVarstaValue;
	}

	@Override
	public boolean checkCNP() {
		// TODO Auto-generated method stub
		return this.checkCNPValue;
	}

	public void setGetSexValue(String getSexValue) {
		this.getSexValue = getSexValue;
	}

	public void setGetVarstaValue(int getVarstaValue) {
		this.getVarstaValue = getVarstaValue;
	}

	public void setCheckCNPValue(boolean checkCNPValue) {
		this.checkCNPValue = checkCNPValue;
	}
}
