package ro.ase.builder.model;

public class BuilderV2 implements AbstractBuilder {
	private boolean isWindowPosition;
	private boolean isErgoChairs;
	private boolean isDecoratedTable;
	private boolean isAmbientalMusic;
	private String musicType;

	@Override
	public Reservation getReservation() {
		// TODO Auto-generated method stub
		return new Reservation(this.isWindowPosition, this.isErgoChairs, this.isDecoratedTable, this.isAmbientalMusic,
				this.musicType);
	}

	@Override
	public AbstractBuilder setWindowPosition(Boolean isWindowPosition) {
		// TODO Auto-generated method stub
		this.isWindowPosition = isWindowPosition;
		return this;
	}

	@Override
	public AbstractBuilder setErgoChairs(boolean isErgoChairs) {
		// TODO Auto-generated method stub
		this.isErgoChairs = isErgoChairs;
		return this;
	}

	@Override
	public AbstractBuilder setDecoratedTable(boolean isDecoratedTable) {
		// TODO Auto-generated method stub
		this.isDecoratedTable = isDecoratedTable;
		return this;
	}

	@Override
	public AbstractBuilder setAmbientalMusic(boolean isAmbientalMusic) {
		// TODO Auto-generated method stub
		this.isAmbientalMusic = isAmbientalMusic;
		return this;
	}

	@Override
	public AbstractBuilder setMusicType(String musicType) {
		// TODO Auto-generated method stub
		this.musicType = musicType;
		return this;
	}

}
