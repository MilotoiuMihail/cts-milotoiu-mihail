package ro.ase.command.model;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
	private List<ICommand> comenzi = new ArrayList<>();

	public void invocaComanda(ICommand command) {
		this.comenzi.add(command);
	}

	public void executaComanda() {
		if (this.comenzi.size() == 0) {
			return;
		}
		this.comenzi.get(0).execute();
		this.comenzi.remove(0);
	}
}
