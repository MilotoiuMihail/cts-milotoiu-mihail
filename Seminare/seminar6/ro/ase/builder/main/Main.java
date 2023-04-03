package ro.ase.builder.main;

import ro.ase.builder.model.AbstractBuilder;
import ro.ase.builder.model.Builder;
import ro.ase.builder.model.BuilderV2;
import ro.ase.builder.model.Reservation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractBuilder builder = new Builder();
		builder.setAmbientalMusic(true).setMusicType("Jazz");
		Reservation reservation = builder.getReservation();
		System.out.println(reservation.toString());
		Reservation reservation1 = builder.setMusicType("Classical").getReservation();
		System.out.println(reservation1.toString());

		AbstractBuilder builder2 = new BuilderV2();
		Reservation reservation2 = builder2.setAmbientalMusic(true).setMusicType("Rock").getReservation();
		System.out.println(reservation2.toString());
		Reservation reservation3 = builder2.setMusicType("Metal").getReservation();
		System.out.println(reservation3.toString());
	}

}
