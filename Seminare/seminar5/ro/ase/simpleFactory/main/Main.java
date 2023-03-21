package ro.ase.simpleFactory.main;

import java.util.ArrayList;
import java.util.List;

import ro.ase.simpleFactory.Bus;
import ro.ase.simpleFactory.ITransportVehicle;
import ro.ase.simpleFactory.VehicleFactory;
import ro.ase.simpleFactory.VehicleType;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleFactory factory = new VehicleFactory();
		try {
			ITransportVehicle bus = factory.createVehicle(VehicleType.BUS, 20);
			ITransportVehicle tram = factory.createVehicle(VehicleType.TRAM, 25);
			ITransportVehicle trolley = factory.createVehicle(VehicleType.TROLLEY, 30);
			List<ITransportVehicle> vehicles = new ArrayList<>();
			vehicles.add(bus);
			vehicles.add(tram);
			vehicles.add(trolley);
			vehicles.add(factory.createVehicle(VehicleType.BUS, 10));
			vehicles.add(factory.createVehicle(VehicleType.TRAM, 5));
			vehicles.add(factory.createVehicle(VehicleType.SUBWAY, 300));
			for (ITransportVehicle vehicle : vehicles) {
				vehicle.showInfo();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
