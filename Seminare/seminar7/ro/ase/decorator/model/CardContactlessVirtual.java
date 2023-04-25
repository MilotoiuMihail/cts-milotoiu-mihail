package ro.ase.decorator.model;

public class CardContactlessVirtual extends AbstractDecorator {

	public CardContactlessVirtual(ICard card) {
		super(card);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void payContactless(double sum) {
		// TODO Auto-generated method stub
		System.out.println("Plata contactless virtuala in valoare de " + sum);
	}

}
