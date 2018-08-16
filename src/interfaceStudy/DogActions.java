package interfaceStudy;

public interface DogActions {

	static String dig(int ground) {
		return "A lot of dirt";
	}

	default boolean likeToTakeBath(String race) {
		if (race == "big") {
			return true;
		}

		return false;
	}
}
