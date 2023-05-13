package ro.ase.state.model;

public class BusInRoute implements IBusState {

	@Override
	public void changeState(Bus bus) {
		// TODO Auto-generated method stub
		if (bus.getState() instanceof BusAtEndOfRoute) {
			System.out.println("The bus " + bus.getLicensePlate() + " has left in a new route.");
			bus.setState(this);
		} else {
			System.out.println("The bus " + bus.getLicensePlate() + " cannot leave in a new route.");
		}
	}

}
