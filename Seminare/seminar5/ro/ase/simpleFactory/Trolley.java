package ro.ase.simpleFactory;

public class Trolley implements ITransportVehicle {
	private int noSeats;

	protected Trolley(int noSeats) {
		super();
		this.noSeats = noSeats;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("The trolley has " + this.noSeats + " seats.");
	}

	@Override
	public void movingType() {
		// TODO Auto-generated method stub
		System.out.println("The tram is moving by rails.");
	}

}
