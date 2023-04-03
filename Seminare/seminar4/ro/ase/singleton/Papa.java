package ro.ase.singleton;

public class Papa {
	private String name;
	private int nrAniFunctie;
	private int alCatelea;
	private static Papa instance = new Papa("Benedict", 2, 276);

	private Papa(String name, int nrAniFunctie, int alCatelea) {
		super();
		this.name = name;
		this.nrAniFunctie = nrAniFunctie;
		this.alCatelea = alCatelea;
	}

	// eager initialization
	public static Papa getInstance() {
		return instance;
	}
}
