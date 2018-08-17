package assessmentTestPage33.questao17;

import java.util.function.Predicate;

public class Questao17 {
	public static void main(String[] args) {
		// A
		System.out.println(test(i -> i == 5));

		// B
		// System.out.println(test(i -> {i == 5;}));

		// C
		System.out.println(test((i) -> i == 5));

		// D
		// System.out.println(test((int i) -> i == 5);

		// E
		// System.out.println(test((int i) -> { return i == 5; }));

		// F
		System.out.println(test((i) -> {
			return i == 5;
		}));
	}

	private static boolean test(Predicate<Integer> p) {
		return p.test(5);
	}
}
