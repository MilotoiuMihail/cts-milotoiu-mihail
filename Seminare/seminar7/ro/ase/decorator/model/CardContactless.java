package ro.ase.decorator.model;

public class CardContactless extends AbstractDecorator {

	public CardContactless(ICard card) {
		super(card);
	}

	@Override
	public void payContactless(double sum) {
		// TODO Auto-generated method stub
		System.out.println("Plata contactless in valoare de " + sum);
	}

}
