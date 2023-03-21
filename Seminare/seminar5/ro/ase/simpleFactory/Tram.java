package ro.ase.simpleFactory;

public class Tram implements ITransportVehicle {
	private int noSeats;

	protected Tram(int noSeats) {
		super();
		this.noSeats = noSeats;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("The tram has " + this.noSeats + " seats.");
	}

	@Override
	public void movingType() {
		// TODO Auto-generated method stub
		System.out.println("The trolley is moving by electricity.");
	}

}
