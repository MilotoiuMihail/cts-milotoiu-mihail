package ro.ase.factoryMethod.main;

import java.util.ArrayList;
import java.util.List;

import ro.ase.factoryMethod.Factory;
import ro.ase.factoryMethod.FactoryBus;
import ro.ase.factoryMethod.FactoryTrolley;
import ro.ase.factoryMethod.TransportVehicle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factoryBus = new FactoryBus();
		Factory factoryTrolley = new FactoryTrolley();
		List<TransportVehicle> vehicles = new ArrayList<>();
		vehicles.add(factoryBus.createVehicle(10));
		vehicles.add(factoryBus.createVehicle(15));
		vehicles.add(factoryTrolley.createVehicle(50));

		for (TransportVehicle vehicle : vehicles) {
			vehicle.showInfo();
			vehicle.movingType();
		}

	}

}
