package ro.ase.decorator.model;

public class Card implements ICard{

	@Override
	public void payOnline(double sum) {
		// TODO Auto-generated method stub
		System.out.println("Plata online in valoare de "+sum);
	}

	@Override
	public void payPOS(double sum) {
		// TODO Auto-generated method stub
		System.out.println("Plata POS in valoare de "+sum);		
	}

}
