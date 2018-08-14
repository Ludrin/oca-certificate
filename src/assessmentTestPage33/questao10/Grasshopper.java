package assessmentTestPage33.questao10;

public class Grasshopper {
	public Grasshopper(String n) {
		name = n;
	}

	public static void main(String[] args) {
		Grasshopper one = new Grasshopper("g1"); // name = g1
		Grasshopper two = new Grasshopper("g2"); // name = g2
		one = two; // one -> two => valores
		two = null;
		one = null;

		teste();
	}

	private static void teste() {
		int i;
		int j = 0;
		int[][] arrayOfInts = { { 32, 87, 3, 589 }, { 12, 1076, 2000, 8 }, { 622, 127, 77, 955 } };
		int searchfor = 12;
		boolean foundIt = false;

		search: for (i = 0; i < arrayOfInts.length; i++) {
			for (j = 0; j < arrayOfInts[i].length; j++) {
				if (arrayOfInts[i][j] == searchfor) {
					foundIt = true;
					break search;
				}
			}
		}
	}

	private String name;
}
