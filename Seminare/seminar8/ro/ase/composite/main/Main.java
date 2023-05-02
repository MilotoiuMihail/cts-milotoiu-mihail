package ro.ase.composite.main;

import ro.ase.composite.model.IAbstractComponent;
import ro.ase.composite.model.Loc;
import ro.ase.composite.model.Tribuna;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		IAbstractComponent tribunaPrincipala = new Tribuna("Tribuna principala");
		IAbstractComponent tribunaCopii = new Tribuna("Tribuna copii");
		IAbstractComponent tribunaAdulti = new Tribuna("Tribuna adulti");
		IAbstractComponent loc1=new Loc(2,1);
		IAbstractComponent loc2=new Loc(2,2);
		IAbstractComponent loc3=new Loc(2,3);
		tribunaPrincipala.addNode(tribunaCopii);
		tribunaPrincipala.addNode(tribunaAdulti);
		tribunaCopii.addNode(loc1);
		tribunaAdulti.addNode(loc2);
		tribunaPrincipala.addNode(loc3);
		tribunaPrincipala.afisareComponenta("");
	}

}
