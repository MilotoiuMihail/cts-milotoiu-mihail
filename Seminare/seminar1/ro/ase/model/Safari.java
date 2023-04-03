package ro.ase.model;

public class Safari extends Zoo {
	private float maxCarWeight;

	public Safari(String name, Zookeeper zookeeper, float maxCarWeight) {
		super(name, zookeeper);
		this.maxCarWeight = maxCarWeight;
	}

	public boolean checkWeight(Car car) {
		if (car == null) {
			return false;
		}
		return car.getWeight() < this.maxCarWeight;
	}

	public float computeFee(Car car) {
		if (!checkWeight(car)) {
			return 0f;
		}
		if (car.getWeight() < this.maxCarWeight / 2) {
			return 10.15f;
		}
		return 20.20f;
	}
}
