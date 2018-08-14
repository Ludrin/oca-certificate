package assessmentTestPage33.questao16;

interface Mammal2 {
	int getGlands();

	default int getMilkProduction() {
		return getGlands() * 10;
	}

	public default String getName() {
		return null;
	}

	public static String getAge() {
		return null;
	}
}
