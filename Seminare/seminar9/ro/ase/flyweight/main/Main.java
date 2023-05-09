package ro.ase.flyweight.main;

import ro.ase.flyweight.model.BazaDeDateClienti;
import ro.ase.flyweight.model.IClient;
import ro.ase.flyweight.model.Rezervare;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BazaDeDateClienti bazaDeDate = new BazaDeDateClienti();
		Rezervare rezervare1 = new Rezervare(1, 2, "10:00");
		Rezervare rezervare2 = new Rezervare(2, 3, "12:00");
		Rezervare rezervare3 = new Rezervare(3, 5, "17:00");
		IClient client = bazaDeDate.getClient("Ana", "0734294021", "ana@gmail.com");
		client.afiseazaDetaliiRezervare(rezervare1);
		bazaDeDate.getClient("Maria", "0733248593", "maria@gmail.com").afiseazaDetaliiRezervare(rezervare2);
		bazaDeDate.getClient("", "0733248593", null).afiseazaDetaliiRezervare(rezervare3);
		Rezervare rezervare4 = new Rezervare(4, 3, "20:00");
		bazaDeDate.getClient("", "0733248593", null).afiseazaDetaliiRezervare(rezervare4);		
	}

}
