
public class Place extends APlace {

	Place(String namePlace) {
		super(namePlace);
	}

	@Override
	public String getName() {
		return toString();
	}
}
