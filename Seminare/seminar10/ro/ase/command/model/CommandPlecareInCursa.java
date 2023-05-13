package ro.ase.command.model;

public class CommandPlecareInCursa implements ICommand{

	private int numarLinie;
	private Automobil automobil;
	
	
	public CommandPlecareInCursa(int numarLinie, Automobil automobil) {
		this.numarLinie = numarLinie;
		this.automobil = automobil;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		automobil.plecareInCursa(this.numarLinie);
	}

}
