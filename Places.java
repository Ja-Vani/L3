
public class Places extends Place {

	Places(String namePlace) {
		super(namePlace);
	}

	@Override
	public void getName() {
		System.out.print(toString());
	}
}
