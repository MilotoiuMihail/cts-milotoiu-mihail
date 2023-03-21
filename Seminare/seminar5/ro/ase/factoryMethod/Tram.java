package ro.ase.factoryMethod;

public class Tram extends TransportVehicle{

	
	public Tram(int noSeats) {
		super(noSeats);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("The tram "+super.toString());
	}

	@Override
	public void movingType() {
		// TODO Auto-generated method stub
		System.out.println("The tram is moving by rails.");
	}
}
