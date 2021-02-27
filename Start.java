public class Start {
	public static void main(String[] args) {
		Person puh = new Person(Persons.Vinni);
		Person robbin = new Person(Persons.Robin);
		Place forest = new Place("Лес");
		Place porog = new Place("порога");
		Song shum = new Song("Шумелка");
		Boot boot = new Boot("Походные сапоги");
		puh.like(shum, "со словами");
		puh.walk(forest);
		puh.sing(shum, "без слов");
		robbin.sit(porog);
		robbin.wear(boot);
		puh.see(robbin);

	}
}