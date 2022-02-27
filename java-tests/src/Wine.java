class Wine implements Valuable {
	private int year;
	private String name;

	public Wine(int year, String name) {
		this.year = year;
		this.name = name;
	}

	public int value() {
		return (2020 - year) * name.length();
	}
	
	public static void main(String[] args) {
		Match<Wine> m = new Match<>();
		Wine w1 = new Wine(2018, "Gewurztraminer");
		Wine w2 = new Wine(2015, "Nebbiolo");
		Wine w3 = new Wine(2019, "Red");

		m.add(w2, w3);
		System.out.format("%d %d %d", m.val(w1), m.val(w2), m.val(w3));

	}
}
