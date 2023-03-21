package ro.ase.simpleFactory;

public class Subway implements ITransportVehicle {
	private int noSeats;

	protected Subway(int noSeats) {
		super();
		this.noSeats = noSeats;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Subway has " + this.noSeats + " seats.");
	}

	@Override
	public void movingType() {
		// TODO Auto-generated method stub
		System.out.println("The subway is moving underground.");
	}

}
