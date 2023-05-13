package ro.ase.command.main;

import ro.ase.command.model.Autobuz;
import ro.ase.command.model.Automobil;
import ro.ase.command.model.CommandPlecareInCursa;
import ro.ase.command.model.ManagerComenzi;

public class Main {
	public static void main(String[] args) {
		ManagerComenzi managerComenzi = new ManagerComenzi();
		Automobil autobuz=new Autobuz(13);

		managerComenzi.invocaComanda(new CommandPlecareInCursa(10, new Autobuz(1)));
		managerComenzi.invocaComanda(new CommandPlecareInCursa(11, autobuz));
		managerComenzi.invocaComanda(new CommandPlecareInCursa(12, new Autobuz(3)));
		managerComenzi.invocaComanda(new CommandPlecareInCursa(11, autobuz));
		
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		managerComenzi.invocaComanda(new CommandPlecareInCursa(10, new Autobuz(23)));
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
	}
}
