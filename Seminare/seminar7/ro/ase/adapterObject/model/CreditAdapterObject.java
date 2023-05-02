package ro.ase.adapterObject.model;

import ro.ase.adapterClass.model.existent.Credit;
import ro.ase.adapterClass.model.nou.CreditLeasing;

public class CreditAdapterObject implements Credit {

    private CreditLeasing leasing;
    public CreditAdapterObject(CreditLeasing leasing)
    {
        this.leasing=leasing;
    }

    @Override
    public void oferaCredit(int suma) {
        this.leasing.oferaLeasing(suma);
    }
}