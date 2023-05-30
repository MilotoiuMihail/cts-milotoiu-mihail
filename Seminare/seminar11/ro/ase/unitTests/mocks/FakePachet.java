package ro.ase.unitTests.mocks;

import ro.ase.unitTests.model.IPachet;

public class FakePachet implements IPachet{

	public void setPoateRezervaValue(boolean poateRezervaValue) {
		this.poateRezervaValue = poateRezervaValue;
	}

	public void setGetPretValue(Double getPretValue) {
		this.getPretValue = getPretValue;
	}

	private boolean poateRezervaValue;
	private Double getPretValue;
	@Override
	public boolean poateRezerva() {
		// TODO Auto-generated method stub
		return this.poateRezervaValue;
	}

	@Override
	public void aplicaDiscountVarstnici(int procent) {
		// TODO Auto-generated method stub
	}

	@Override
	public Double getPret() {
		// TODO Auto-generated method stub
		return this.getPretValue;
	}

}
