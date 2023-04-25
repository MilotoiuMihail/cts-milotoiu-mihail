package ro.ase.decorator.model;

public abstract class AbstractDecorator implements ICard{
	
	ICard card;
	
	public AbstractDecorator(ICard card) {
		this.card=card;
	}
	
	public abstract void payContactless(double sum);
	@Override
	public void payOnline(double sum) {
		// TODO Auto-generated method stub
		card.payOnline(sum);
	}

	@Override
	public void payPOS(double sum) {
		// TODO Auto-generated method stub
		card.payPOS(sum);
	}

}
