
public class Song implements ISong {
	private String nameSong;

	Song(String nameSong) {
		this.nameSong = nameSong;
	}

	@Override
	public String sing(String typeSing) {
		if (typeSing == "�� �������") {
			return "��������";
		} else if (typeSing == "��� ����") {
			return "����������";
		}
		return "������";
	}

	@Override
	public int hashCode() {
		return super.hashCode() + this.nameSong.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass())
			return false;

		return obj.toString() == this.toString() ? true : false;
	}

	@Override
	public String toString() {
		return nameSong;
	}
}
