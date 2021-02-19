
public class Pers implements Person {
	private Persons namePerson;
	private String action;

	Pers(Persons namePerson, String action) {
		this.namePerson = namePerson;
		this.action = action;
	}

	@Override
	public String move() {
		return action;
	}

	@Override
	public void like(SongSing song, String how) {
		System.out.print("Ему почему-то так понравилась эта песня (" + song.toString() + "), что он " + song.sing(how)
				+ " ее всю дорогу, ");
	}

	@Override
	public void walk(Places place) {
		System.out.print("шагая по ");
		place.getName();
	}

	@Override
	public void think() {
		System.out.print(
				"Но если я буду петь ее дальше,-- вдруг подумал он,-- как раз придет время чем-нибудь подкрепиться, и тогда последняя строчка будет неправильная. ");
	}

	@Override
	public void sing(SongSing song, String how) {
		System.out.print("Поэтому он " + song.sing(how) + " эту песенку " + how + ".");
	}

	@Override
	public void sit(Places place) {
		System.out.print(this.toString() + "сидел у ");
		place.getName();
		System.out.print(", " + this.move() + " свои Походные Сапоги.");
	}

	public void adventure() {
		System.out.print("Едва " + this.toString() + " " + this.move()
				+ " Походные Сапоги, он сразу понял, что предстоит Приключение, ");
	}

	@Override
	public void ready() {
		System.out.print(
				"и он смахнул лапкой остатки меда с мордочки и подтянулся как только мог, чтобы показать, что он ко всему готов.");
	}

	@Override
	public int hashCode() {
		return super.hashCode() + this.namePerson.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return obj.hashCode() == this.hashCode() ? true : false;
	}

	@Override
	public String toString() {
		if (namePerson == Persons.Vinni) {
			return "Пух";
		} else {
			return "Кристофер Робин";
		}
	}
}
