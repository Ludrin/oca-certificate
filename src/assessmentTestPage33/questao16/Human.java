package assessmentTestPage33.questao16;

public class Human implements Mammal2, PawSupport {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return Mammal2.super.getName();
	}

	public void getAge() {
		Mammal2.getAge();
	}

	public static void main(String[] args) {
		Human pudim = new Human();
		System.out.println(pudim.getMilkProduction());
		System.out.println(pudim.isHuman());
		PawSupport.helloMessage();
	}

	@Override
	public int getNumberOfPaws() {
		return 2;
	}

	@Override
	public int getGlands() {
		return 2;
	}
}