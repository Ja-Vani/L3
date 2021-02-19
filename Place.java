
public abstract class Place {
	private String namePlace;

	Place(String namePlace) {
		this.namePlace = namePlace;
	}

	public void getName() {
	}

	@Override
	public int hashCode() {
		return super.hashCode() + this.namePlace.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return obj.hashCode() == this.hashCode() ? true : false;
	}

	@Override
	public String toString() {
		return namePlace;
	}
}
