package ro.ase.factoryMethod;

public class FactoryBus implements Factory {

	@Override
	public TransportVehicle createVehicle(int noSeats) {
		// TODO Auto-generated method stub
		return new Bus(noSeats);
	}

}
