package ro.ase.facade.model;

public class Client {
private String name;
private String cnp;

public Client(String name, String cnp) {
	super();
	this.name = name;
	this.cnp = cnp;
}

public String getName() {
	return this.name;
}

public String getCnp() {
	return this.cnp;
}

}
