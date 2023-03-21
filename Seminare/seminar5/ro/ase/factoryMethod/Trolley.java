package ro.ase.factoryMethod;

public class Trolley extends TransportVehicle {

	
	public Trolley(int noSeats) {
		super(noSeats);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("The trolley " + super.toString());
	}

	@Override
	public void movingType() {
		// TODO Auto-generated method stub
		System.out.println("The trolley is moving by electricity.");
	}

}
