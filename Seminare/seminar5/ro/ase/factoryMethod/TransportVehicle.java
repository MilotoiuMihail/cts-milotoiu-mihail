package ro.ase.factoryMethod;

public abstract class TransportVehicle {
	private int noSeats;

	public TransportVehicle(int noSeats) {
		super();
		this.noSeats = noSeats;
	}
	
	@Override
	public String toString() {
		return "has " + this.noSeats + " seats.";
	}

	public abstract void showInfo();
	public abstract void movingType();
}
