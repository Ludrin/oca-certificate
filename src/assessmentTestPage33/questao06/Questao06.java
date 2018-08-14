package assessmentTestPage33.questao06;

public class Questao06 {

	public static void addToInt(int x, int amountToAdd) {
		x = x + amountToAdd;
	}

	public static void changeString(String x) {
		x = x + "bla";
	}

	public static void changeObject(Pessoa x) {
		x.setName(x.getName() + "Nome");
	}

	public static void main(String[] args) {
		int a = 15;
		int b = 10;

		addToInt(a, b);
		System.out.println(a);

		String c = "bla";
		changeString(c);
		System.out.println(c);

		Pessoa d = new Pessoa("nome");
		changeObject(d);
		System.out.println(d.getName());
	}

}
