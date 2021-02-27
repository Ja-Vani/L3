
public class Person implements IPerson {
	private Persons namePerson;
	private Boot boot;
	private String status;

	Person(Persons namePerson) {
		this.namePerson = namePerson;
	}

	public Boot getBoot() {
		return boot;
	}

	@Override
	public void like(Song song, String how) {
		status = song.sing(how);
		System.out.println(this.toString() + " ����������� " + song.toString() + ",��� �� " + status + " � ");
		status += " " + song.toString();
	}

	@Override
	public void walk(Place place) {
		status = "����� �� " + place.getName();
		System.out.println(status);
	}

	@Override
	public void sing(Song song, String how) {
		status = song.sing(how) + " " + song.toString();
		System.out.println(status + how);
	}

	@Override
	public void sit(Place place) {
		status = "����� � " + place.getName();
		System.out.println(this.toString() + status);
	}

	@Override
	public void wear(Boot boot) {
		this.boot = boot;
		System.out.println("��������� ���� " + this.boot.getBoot());
	}

	public void see(Person person) {
		System.out.println(this.toString() + " ������ " + person.getBoot().getBoot());
		if (person.getBoot().getBoot() == "�������� ������") {
			status = "����� � �����������";

		} else {
			status = "�� ����� � �����������";
		}
		System.out.println(this.toString() + " " + status);
	}

	@Override
	public int hashCode() {
		return super.hashCode() + this.namePerson.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass())
			return false;

		return obj.toString() == this.toString() ? true : false;
	}

	@Override
	public String toString() {
		if (namePerson == Persons.Vinni) {
			return "���";
		} else {
			return "��������� �����";
		}
	}
}
