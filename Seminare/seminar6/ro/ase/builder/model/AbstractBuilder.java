package ro.ase.builder.model;

public interface AbstractBuilder {
	public Reservation getReservation();
	
	public AbstractBuilder setWindowPosition(Boolean isWindowPosition);

	public AbstractBuilder setErgoChairs(boolean isErgoChairs);

	public AbstractBuilder setDecoratedTable(boolean isDecoratedTable);

	public AbstractBuilder setAmbientalMusic(boolean isAmbientalMusic);

	public AbstractBuilder setMusicType(String musicType);
}
