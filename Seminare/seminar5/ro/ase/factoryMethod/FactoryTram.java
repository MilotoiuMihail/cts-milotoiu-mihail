package ro.ase.factoryMethod;

public class FactoryTram implements Factory{

	@Override
	public TransportVehicle createVehicle(int noSeats) {
		// TODO Auto-generated method stub
		return new Tram(noSeats);
	}

}
