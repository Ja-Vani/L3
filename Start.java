public class Start {
	public static void main(String[] args) {
		Pers puh = new Pers(Persons.Vinni, "увидел");
		Pers robbin = new Pers(Persons.Robin, "натягивая");
		Places forest = new Places("Лес");
		Places porog = new Places("порога");
		SongSing shum = new SongSing("Шумелка");
		puh.like(shum, "со словами");
		puh.walk(forest);
		puh.think();
		puh.sing(shum, "без слов");
		robbin.sit(porog);
		puh.adventure();
		puh.ready();
	}
}
