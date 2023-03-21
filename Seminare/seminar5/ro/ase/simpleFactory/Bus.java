package ro.ase.simpleFactory;

public class Bus implements ITransportVehicle {
	private int noSeats;

	protected Bus(int noSeats) {
		super();
		this.noSeats = noSeats;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("The bus has " + this.noSeats + " seats.");
	}

	@Override
	public void movingType() {
		// TODO Auto-generated method stub
		System.out.println("The bus is moving by wheels.");
	}

}
