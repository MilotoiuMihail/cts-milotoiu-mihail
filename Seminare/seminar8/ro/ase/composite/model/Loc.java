package ro.ase.composite.model;

public class Loc implements IAbstractComponent {
	private int rand;
	private int numar;

	public Loc(int rand, int numar) {
		this.rand = rand;
		this.numar = numar;
	}

	@Override
	public void addNode(IAbstractComponent node) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Not yet implemented");
	}

	@Override
	public void removeNode(IAbstractComponent node) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Not yet implemented");
	}

	@Override
	public IAbstractComponent getChildNode(int index) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Not yet implemented");
	}

	@Override
	public void afisareComponenta(String indentare) {
		// TODO Auto-generated method stub
		System.out.println(indentare+"Locul de pe randul " + this.rand + " si numarul " + this.numar);
	}

}
