package assessmentTestPage33.questao14;

import java.util.ArrayList;
import java.util.List;

public class ChickenSong {

	public static void main(String[] args) {
		HenHouse house = new HenHouse() {

			@Override
			public List<Chicken> getChickens() {
				ArrayList<Chicken> chickens = new ArrayList<>();
				chickens.add(new Chicken());
				chickens.add(new Chicken());
				chickens.add(new Chicken());
				return chickens;
			}
		};

		Chicken chicken = house.getChickens().get(0);

		for (int i = 0; i < house.getChickens().size(); chicken = house.getChickens().get(i++)) {
			System.out.println("Cluck");
		}

	}

}
