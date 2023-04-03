package ro.ase.builder.model;

public class Builder implements AbstractBuilder {
	private Reservation reservation;

	@Override
	public Reservation getReservation() {
		// TODO Auto-generated method stub
		return this.reservation;
	}

	public Builder() {
		this.reservation = new Reservation(false, false, false, false, null);
	}

	public AbstractBuilder setWindowPosition(Boolean isWindowPosition) {
		this.reservation.setWindowPosition(isWindowPosition);
		return this;
	}

	public AbstractBuilder setErgoChairs(boolean isErgoChairs) {
		this.reservation.setErgoChairs(isErgoChairs);
		;
		return this;
	}

	public AbstractBuilder setDecoratedTable(boolean isDecoratedTable) {
		this.reservation.setDecoratedTable(isDecoratedTable);
		;
		return this;
	}

	public AbstractBuilder setAmbientalMusic(boolean isAmbientalMusic) {
		this.reservation.setAmbientalMusic(isAmbientalMusic);
		return this;
	}

	public AbstractBuilder setMusicType(String musicType) {
		this.reservation.setMusicType(musicType);
		return this;
	}
}
