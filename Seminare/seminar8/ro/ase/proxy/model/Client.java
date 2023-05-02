package ro.ase.proxy.model;

public class Client {
	private int age;
	private String name;

	public Client(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
}
