package assessmentTestPage33;

import java.util.ArrayList;
import java.util.List;

import assessmentTestPage33.questao16.Teste;

public class AssessmentTest extends Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = { 6, 9, 8 };
		List<Integer> list = new ArrayList<>();

		list.add(array[0]);
		list.add(array[2]);
		list.set(1, array[1]);
		list.remove(0);
		// 9
		System.out.println(list);

		Teste.getAltura();

		int a = 2;
		int b = 2;

		System.out.println("a: " + a--);
		System.out.println("b: " + --b);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}

}
