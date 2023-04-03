package ro.ase.singleton;

public class Director {
	private String name;
	private int age;
	private static Director instance = null;

	private Director(String name, int varsta) {
		super();
		this.name = name;
		this.age = varsta;
	}

	@Override
	public String toString() {
		return "Director [name=" + name + ", age=" + age + "]";
	}

	// lazy initialization / thread safe initialization (synchronized)
	public synchronized static Director getInstance(String name) {
		if (instance == null) {
			instance = new Director(name, 30);
		}
		return instance;
	}
}
