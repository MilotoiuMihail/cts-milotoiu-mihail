package ro.ase.state.main;

import ro.ase.state.model.Bus;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus = new Bus("B123BUS");
		bus.goInService();
		bus.endRoute();
		bus.endRoute();
		bus.leaveForRoute();
		bus.goInService();
		bus.endRoute();
	}

}
