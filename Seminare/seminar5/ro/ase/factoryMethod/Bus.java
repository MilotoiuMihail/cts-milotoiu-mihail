package ro.ase.factoryMethod;

public class Bus extends TransportVehicle{

	
	public Bus(int noSeats) {
		super(noSeats);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("The bus "+super.toString());
	}

	@Override
	public void movingType() {
		// TODO Auto-generated method stub
		System.out.println("The bus is moving by wheels");
	}

}
