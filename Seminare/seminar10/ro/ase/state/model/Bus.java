package ro.ase.state.model;

public class Bus {
	private IBusState state;
	private String licensePlate;

	public Bus(String licensePlate) {
		this.licensePlate = licensePlate;
		this.state = new BusAtEndOfRoute();
	}

	public IBusState getState() {
		return state;
	}

	protected void setState(IBusState state) {
		this.state = state;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void leaveForRoute() {
		IBusState route = new BusInRoute();
		route.changeState(this);
	}

	public void goInService() {
		new BusInService().changeState(this);
	}

	public void endRoute() {
		new BusAtEndOfRoute().changeState(this);
	}

}
