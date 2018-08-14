package assessmentTestPage33.questao16;

public interface PawSupport {
	int getNumberOfPaws();

	default boolean isHuman() {
		return getNumberOfPaws() == 2;
	}

	static String helloMessage() {
		return "Hello, pudim";
	}

}
