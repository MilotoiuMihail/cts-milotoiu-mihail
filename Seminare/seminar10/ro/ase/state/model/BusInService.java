package ro.ase.state.model;

public class BusInService implements IBusState {

	@Override
	public void changeState(Bus bus) {
		// TODO Auto-generated method stub
		if (bus.getState() instanceof BusAtEndOfRoute) {
			System.out.println("The bus " + bus.getLicensePlate() + " is now in service");
			bus.setState(this);
		} else {
			System.out.println("The bus " + bus.getLicensePlate() + " cannot reach the end ");
		}
	}

}
