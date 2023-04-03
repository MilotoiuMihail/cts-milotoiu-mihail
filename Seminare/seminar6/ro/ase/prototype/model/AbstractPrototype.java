package ro.ase.prototype.model;

public interface AbstractPrototype extends Cloneable{
	public AbstractPrototype createCopy() throws CloneNotSupportedException;
}
