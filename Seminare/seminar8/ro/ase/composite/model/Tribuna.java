package ro.ase.composite.model;

import java.util.ArrayList;
import java.util.List;

public class Tribuna implements IAbstractComponent {
	private List<IAbstractComponent> listaComponente;
	private String name;

	public Tribuna(String name) {
		this.name = name;
		this.listaComponente = new ArrayList<>();
	}

	@Override
	public void addNode(IAbstractComponent node) throws Exception {
		// TODO Auto-generated method stub
		this.listaComponente.add(node);
	}

	@Override
	public void removeNode(IAbstractComponent node) throws Exception {
		// TODO Auto-generated method stub
		this.listaComponente.remove(node);
	}

	@Override
	public IAbstractComponent getChildNode(int index) throws Exception {
		// TODO Auto-generated method stub
		return this.listaComponente.get(index);
	}

	@Override
	public void afisareComponenta(String indentare) {
		// TODO Auto-generated method stub
		System.out.println(indentare+"Tribuna " + this.name + " contine: ");
		for (IAbstractComponent componenta : listaComponente) {
			componenta.afisareComponenta(indentare+"   ");
		}
	}

}
