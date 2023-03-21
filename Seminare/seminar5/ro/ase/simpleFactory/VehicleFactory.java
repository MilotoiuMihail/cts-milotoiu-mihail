package ro.ase.simpleFactory;

public class VehicleFactory {
	public ITransportVehicle createVehicle(VehicleType type, int noSeats) throws Exception {
		switch (type) {
		case BUS: {
			return new Bus(noSeats);
		}
		case TRAM: {
			return new Tram(noSeats);
		}
		case TROLLEY: {
			return new Trolley(noSeats);
		}
		case SUBWAY: {
			return new Subway(noSeats);
		}
		default:
			throw new Exception("Unexpected value: " + type);
		}
	}
}
