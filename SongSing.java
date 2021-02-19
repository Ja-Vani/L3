
public class SongSing implements Song {
	private String nameSong;

	SongSing(String nameSong) {
		this.nameSong = nameSong;
	}

	@Override
	public String sing(String typeSing) {
		if(typeSing=="со словами") {
			return "распевал";
		}
		else if (typeSing == "без слов") {
			return "замурлыкал";
		}
		return "молчал";
	}

	@Override
	public int hashCode() {
		return super.hashCode() + this.nameSong.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return obj.hashCode() == this.hashCode() ? true : false;
	}

	@Override
	public String toString() {
		return nameSong;
	}
}
