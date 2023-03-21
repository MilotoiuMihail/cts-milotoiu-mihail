package ro.ase.factoryMethod;

public class FactoryTrolley implements Factory {

	@Override
	public TransportVehicle createVehicle(int noSeats) {
		// TODO Auto-generated method stub
		return new Trolley(noSeats);
	}

}
