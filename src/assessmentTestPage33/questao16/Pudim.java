package assessmentTestPage33.questao16;

public class Pudim implements Animal {

	public static void main(String[] args) {
		PawSupport.helloMessage();

		PawSupport teste = new PawSupport() {

			@Override
			public int getNumberOfPaws() {
				return 2;
			}
		};

		System.out.println(teste.isHuman());
	}
}
