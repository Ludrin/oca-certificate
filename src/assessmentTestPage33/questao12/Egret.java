package assessmentTestPage33.questao12;

public class Egret {
	private String color;

	public Egret() {
		this("white");
	}

	public Egret(String color) {
		color = color;
	}

	public static void main(String[] args) {
		Egret e = new Egret();
		System.out.println("Color:" + e.color);

		String teste = null;
		System.out.println("Color:" + teste);
		System.out.println(teste);

		System.out.println("".equals(teste));
	}
}
