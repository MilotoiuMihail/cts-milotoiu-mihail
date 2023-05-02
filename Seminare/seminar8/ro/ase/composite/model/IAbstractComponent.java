package ro.ase.composite.model;

public interface IAbstractComponent {
public void addNode(IAbstractComponent node) throws Exception;
public void removeNode(IAbstractComponent node) throws Exception;
public IAbstractComponent getChildNode(int index) throws Exception;
public void afisareComponenta(String indentare);
}
