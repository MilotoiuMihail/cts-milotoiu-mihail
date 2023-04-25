package ro.ase.decorator.main;

import ro.ase.decorator.model.AbstractDecorator;
import ro.ase.decorator.model.Card;
import ro.ase.decorator.model.CardContactless;
import ro.ase.decorator.model.CardContactlessVirtual;
import ro.ase.decorator.model.ICard;

public class Main {
	private static void aplicatie(ICard card) {
		card.payOnline(2000);
		card.payPOS(1000);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICard card = new Card();
		aplicatie(card);

		AbstractDecorator decorator = new CardContactless(card);
		AbstractDecorator decoratorVirtual=new CardContactlessVirtual(card);
		
		decoratorVirtual.payContactless(480);
		decorator.payContactless(500);
		aplicatie(decorator);
	}

}
